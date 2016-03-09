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
    		String theUrl = theSession.getTransport_url() + "/v2/put/shared." + deviceName;
			HttpPost postRequest = new HttpPost(theUrl);
	        String target = null;
	        log.debug("current thermostat target type is: " + deviceDetail.getCurrentScheduleMode());
	        if(deviceDetail.getCurrentScheduleMode().equalsIgnoreCase("range")) {
	        	log.debug("current thermostat temperature is: " + Float.toString(sharedDetail.getTargetTemperature()));
	        	if(theTemp < sharedDetail.getTargetTemperature())
	        		target = "target_temperature_low";
	        	else
	        		target = "target_temperature_high";
	        }
	        else
	        	target = "target_temperature";
	        
	        String requestString = "{\"target_change_pending\":true,\"" + target + "\":" + String.format("%3.1f", theTemp)+ "}";
	        StringEntity requestBody = new StringEntity(requestString, NestSession.parsedContentType);
        	log.debug("setTargetTemperature for thermostat: " + theUrl + " with body: " + requestString);
	        postRequest.setEntity(requestBody);
	        String theResponse = theSession.execute(postRequest);
	        log.debug("setTargetTemperature response: " + theResponse);
        }
        else
        	log.warn("setTargetTemperature outside of Nest paramaters of 10C to 33C derees, not setting with this paramter: " + theTemp.toString());
	}
	
	public void setTargetType(String theType) {
        log.debug("current thermostat target type is: " + deviceDetail.getCurrentScheduleMode());
        if(theType.equalsIgnoreCase("cool") || theType.equalsIgnoreCase("heat") || theType.equalsIgnoreCase("range") || theType.equalsIgnoreCase("off")) {
    		String theUrl = theSession.getTransport_url() + "/v2/put/shared." + deviceName;
			HttpPost postRequest = new HttpPost(theUrl);
			String requestString = "{\"target_temperature_type\":\"" + theType + "\"}";
	        StringEntity requestBody = new StringEntity(requestString, NestSession.parsedContentType);
	        log.debug("setTargetType for thermostat: " + theUrl + " with body: " + requestString);
	        postRequest.setEntity(requestBody);
	        String theResponse = theSession.execute(postRequest);
	        log.debug("setTargetType response: " + theResponse);
        }
        else
        	log.warn("setTargetType of Nest thermostat not one of the following: hest, cool, range or off, not setting with this paramter: " + theType);
	}
	
	public void setFanMode(String theMode) {
        log.debug("current thermostat fan mode is: " + deviceDetail.getFanMode());
        if(theMode.equalsIgnoreCase("on") || theMode.equalsIgnoreCase("auto")) {
    		String theUrl = theSession.getTransport_url() + "/v2/put/device." + deviceName;
        	HttpPost postRequest = new HttpPost(theUrl);
			String requestString = "{\"fan_mode\":\"" + theMode + "\"}";
	        StringEntity requestBody = new StringEntity(requestString, NestSession.parsedContentType);
	        log.debug("setFanMode for thermostat: " + theUrl + " with body: " + requestString);
	        postRequest.setEntity(requestBody);
	        String theResponse = theSession.execute(postRequest);
	        log.debug("setFanMode response: " + theResponse);
        }
        else
        	log.warn("setFanMode of Nest thermostat not one of the following: auto or off, not setting with this paramter: " + theMode);
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
