package com.bwssystems.nest.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.net.ssl.SSLContext;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

import com.bwssystems.nest.protocol.auth.SessionAuthorization;
import com.bwssystems.nest.protocol.error.LoginException;
import com.bwssystems.nest.protocol.error.NestError;
import com.google.gson.Gson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NestSession {
	private Logger log = LoggerFactory.getLogger(NestSession.class);
	private String theUsername;
	private String thePassword;
	private SessionAuthorization theAuth;
    private SSLContext sslcontext;
    private SSLConnectionSocketFactory sslsf;
    private RequestConfig globalConfig;
    private CloseableHttpClient httpclient;
    public static final ContentType parsedContentType = ContentType.parse("application/json");
    private BufferedReader theLine;
    private String theBody;
    private int retry;
    private CloseableHttpResponse response;

    public NestSession(String username, String password) throws LoginException {
		super();
		theLine = null;
		theBody = null;
		response = null;
		theUsername = new String(username);
		thePassword = new String(password);
		log.info("Starting Nest login...");
		retry = 0;
        // Trust own CA and all self-signed certs
        sslcontext = SSLContexts.createDefault();
        // Allow TLSv1 protocol only
        sslsf = new SSLConnectionSocketFactory(
                sslcontext,
                new String[] { "TLSv1" },
                null,
                SSLConnectionSocketFactory.getDefaultHostnameVerifier());
        globalConfig = RequestConfig.custom()
                .setCookieSpec(CookieSpecs.STANDARD)
                .build();
        
        _login();
	}
	
    private void _login() throws LoginException {
        httpclient = HttpClients.custom()
                .setSSLSocketFactory(sslsf)
                .setDefaultRequestConfig(globalConfig)
                .build();

            HttpPost postRequest = new HttpPost("https://home.nest.com/user/login");
            StringEntity requestBody = new StringEntity("{\"email\":\"" + theUsername + "\",\"password\":\"" + thePassword + "\"}", parsedContentType);
            postRequest.setEntity(requestBody);
            String authResponse = _execute(postRequest);
            log.debug("The Response: " + authResponse);
            theAuth = new Gson().fromJson(authResponse, SessionAuthorization.class);
            if(theAuth.getAccess_token() == null && theAuth.getUser() == null) {
            	NestError anError = new Gson().fromJson(authResponse, NestError.class);
            	String errormsg = "Login issue: " + anError.getError() + ", Description: " + anError.getErrorDescription();
            	log.error(errormsg);
            	throw new LoginException(errormsg);
            }
            else
            	log.info("Completed Nest login...");
    }
    
	public void close() {
		try {
			this.httpclient.close();
		} catch (IOException e) {
			// noop
		}
		this.httpclient = null;
		this.theAuth = null;
	}
	
	public String execute(HttpRequestBase aRequest) {
        aRequest.setHeader("Authorization", "Basic " + theAuth.getAccess_token());
        retry = 0;
        return _execute(aRequest);
	}
	
	private String _execute(HttpRequestBase aRequest) {
		try {
			response = httpclient.execute(aRequest);
            theLine = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            theBody = theLine.readLine();
            EntityUtils.consume(response.getEntity());
            response.close();
		} catch (ClientProtocolException e) {
			log.warn("_execute Client Protocol failed: " + e.getMessage());
			retry = 0;
			theBody = null;
		} catch (IOException e) {
			log.warn("_execute IO failed, count number: " + retry + ", error message: " + e.getMessage());
			close();
			if(retry < 3) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					// noop
				}
				try {
					_login();
					theBody = _execute(aRequest);
				} catch (LoginException e1) {
					log.warn("_execute retry login failed, count number: " + retry);
				}
				retry++;	
			}
			else {
				log.warn("Cannot execute http request, failed 3 times....");
				retry = 0;
				theBody = null;
			}
		}
        return theBody;
	}
	
	public String getTransport_url() {
		return theAuth.getUrls().getTransport_url();
	}
	
	public String getUserid() {
		return theAuth.getUserid();
	}
}
