package com.bwssystems.nest.controller;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bwssystems.nest.protocol.status.DeviceDetail;
import com.bwssystems.nest.protocol.status.SharedDetail;

public class Thermostat {
	private Logger log = LoggerFactory.getLogger(Thermostat.class);
	private DeviceDetail deviceDetail;
	private SharedDetail sharedDetail;
	private String deviceName;
	private NestSession theSession;
	
	public Thermostat(NestSession aSession, String name, DeviceDetail theDetail, SharedDetail aShared) {
		super();
		deviceDetail = theDetail;
		sharedDetail = aShared;
		deviceName = name;
		theSession = aSession;
	}

	public void reinitialize(DeviceDetail aDevice, SharedDetail aShared) {
		deviceDetail = aDevice;
		sharedDetail = aShared;
	}
	
	public void setTargetTemperature(Float theTemp) {
        if(theTemp < 33.0 & theTemp > 9.0) {
			HttpPost postRequest = new HttpPost(theSession.getTransport_url() + "/v2/put/shared." + deviceName);
	        String target = null;
	        if(deviceDetail.getCurrentScheduleMode().toLowerCase() == "range") {
	        	if(theTemp < sharedDetail.getTargetTemperature())
	        		target = "target_temperature_low";
	        	else
	        		target = "target_temperature_high";
	        }
	        else
	        	target = "target_temperature";
	        StringEntity requestBody = new StringEntity("{\"target_change_pending\":true,\"" + target + "\":" + String.format("%3.1f", theTemp)+ "}", NestSession.parsedContentType);
	        postRequest.setEntity(requestBody);
	        theSession.execute(postRequest);
        }
        else
        	log.warn("temperature outside of Nest paramaters of 10C to 33C derees, not setting with this paramter: " + theTemp.toString());
	}
	
	public void setTargetType(String theType) {
        if(theType.equals("cool") || theType.equals("heat") || theType.equals("range") || theType.equals("off")) {
			HttpPost postRequest = new HttpPost(theSession.getTransport_url() + "/v2/put/shared." + deviceName);
	        StringEntity requestBody = new StringEntity("{\"target_temperature_type\":\"" + theType + "\"}", NestSession.parsedContentType);
	        postRequest.setEntity(requestBody);
	        theSession.execute(postRequest);
        }
        else
        	log.warn("target type of Nest thermostat not one of the following: hest, cool, range or off, not setting with this paramter: " + theType);
	}
	
	public void setFanMode(String theMode) {
        if(theMode.equals("on") || theMode.equals("auto")) {
        	HttpPost postRequest = new HttpPost(theSession.getTransport_url() + "/v2/put/device." + deviceName);
	        StringEntity requestBody = new StringEntity("{\"fan_mode\":\"" + theMode + "\"}", NestSession.parsedContentType);
	        postRequest.setEntity(requestBody);
	        theSession.execute(postRequest);
        }
        else
        	log.warn("fan mode of Nest thermostat not one of the following: auto or off, not setting with this paramter: " + theMode);
	}

	public DeviceDetail getDeviceDetail() {
		return deviceDetail;
	}

	public void setDeviceDetail(DeviceDetail deviceDetail) {
		this.deviceDetail = deviceDetail;
	}

	public SharedDetail getSharedDetail() {
		return sharedDetail;
	}

	public void setSharedDetail(SharedDetail sharedDetail) {
		this.sharedDetail = sharedDetail;
	}

	public String getDeviceName() {
		return deviceName;
	}
}
