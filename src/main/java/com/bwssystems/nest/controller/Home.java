package com.bwssystems.nest.controller;

import java.util.Date;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import com.bwssystems.nest.protocol.status.StructureDetail;

public class Home {
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
		HttpPost postRequest = new HttpPost(theSession.getTransport_url() + "/v2/put/structure." + theName);
		StringEntity requestBody = new StringEntity("{\"away_timestamp\":" + Long.toString(new Date().getTime()) + ",\"away\":" + isAway.toString() + ",\"away_setter\":0}", NestSession.parsedContentType);
        postRequest.setEntity(requestBody);

        theSession.execute(postRequest);
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
