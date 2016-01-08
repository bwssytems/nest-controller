
package com.bwssystems.nest.protocol.status;

import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Structure {

	private Map<String, StructureDetail> structureDetail;

	public Structure(Map<String, StructureDetail> theStructureDetails) {
		this.structureDetail = theStructureDetails;
	}

	public Map<String, StructureDetail> getStructureDetails() {
		return structureDetail;
	}

	public void setStructureDetails(Map<String, StructureDetail> aStructureDetails) {
		this.structureDetail = aStructureDetails;
	}

}
