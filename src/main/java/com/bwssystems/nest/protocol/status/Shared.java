
package com.bwssystems.nest.protocol.status;

import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Shared {

	private Map<String, SharedDetail> sharedDetails;

	public Shared(Map<String, SharedDetail> theStructureDetails) {
		this.sharedDetails = theStructureDetails;
	}

	public Map<String, SharedDetail> getSharedDetails() {
		return sharedDetails;
	}

	public void setSharedDetails(Map<String, SharedDetail> aSharedDetails) {
		this.sharedDetails = aSharedDetails;
	}

}
