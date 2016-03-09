package com.bwssystems.nest.controller;

import java.util.Date;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bwssystems.nest.protocol.status.StructureDetail;

public class Home {
	private Logger log = LoggerFactory.getLogger(Nest.class);
	private NestSession theSession;
	private String theName;
	private StructureDetail theDetail;
	
	public Home(NestSession aSession, String aName, StructureDetail aDetail) {
		super();
		theSession = aSession;
		theName = aName;
		theDetail = aDetail;
	}

	public void reinitialize(StructureDetail aDetail) {
		theDetail = aDetail;
	}

	public void setAway(Boolean isAway) {
		String theUrl = theSession.getTransport_url() + "/v2/put/structure." + theName;
		HttpPost postRequest = new HttpPost(theUrl);
        String requestString = "{\"away_timestamp\":" + Long.toString(new Date().getTime()) + ",\"away\":" + isAway.toString() + ",\"away_setter\":0}";
		StringEntity requestBody = new StringEntity(requestString, NestSession.parsedContentType);
		log.debug("setAway for home: " + theUrl + " with body: " + requestString);
        postRequest.setEntity(requestBody);

        String theResponse = theSession.execute(postRequest);
        log.debug("setAway post request response: " + theResponse);
	}
	
	public StructureDetail getDetail() {
		return theDetail;
	}

	public void setDetail(StructureDetail theDetail) {
		this.theDetail = theDetail;
	}

	public String getName() {
		return theName;
	}
}
