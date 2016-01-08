package com.bwssystems.nest.controller;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import com.bwssystems.nest.protocol.status.DeviceDetail;
import com.bwssystems.nest.protocol.status.SharedDetail;

public class Thermostat {
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
        if(theTemp < 50.0 & theTemp > 0.0) {
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
	}
	
	public void setTargetType(String theType) {
        if(theType.equals("cool") || theType.equals("heat") || theType.equals("range") || theType.equals("off")) {
			HttpPost postRequest = new HttpPost(theSession.getTransport_url() + "/v2/put/shared." + deviceName);
	        StringEntity requestBody = new StringEntity("{\"target_temperature_type\":\"" + theType + "\"}", NestSession.parsedContentType);
	        postRequest.setEntity(requestBody);
	        theSession.execute(postRequest);
        }
	}
	
	public void setFanMode(String theMode) {
        if(theMode.equals("on") || theMode.equals("auto")) {
        	HttpPost postRequest = new HttpPost(theSession.getTransport_url() + "/v2/put/device." + deviceName);
	        StringEntity requestBody = new StringEntity("{\"fan_mode\":\"" + theMode + "\"}", NestSession.parsedContentType);
	        postRequest.setEntity(requestBody);
	        theSession.execute(postRequest);
        }
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
