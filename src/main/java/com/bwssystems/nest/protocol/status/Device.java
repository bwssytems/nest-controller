
package com.bwssystems.nest.protocol.status;

import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Device {

	private Map<String, DeviceDetail> devices;

	public Device(Map<String, DeviceDetail> theDevices) {
		this.devices = theDevices;
	}

	public Map<String, DeviceDetail> getDevices() {
		return devices;
	}

	public void setDevices(Map<String, DeviceDetail> devices) {
		this.devices = devices;
	}

}
