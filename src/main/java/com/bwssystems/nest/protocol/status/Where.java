
package com.bwssystems.nest.protocol.status;

import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Where {

	private Map<String, WhereDetail> wheres;

	public Where(Map<String, WhereDetail> theWheres) {
		this.wheres = theWheres;
	}

	public Map<String, WhereDetail> getDevices() {
		return wheres;
	}

	public void setWheres(Map<String, WhereDetail> theWheres) {
		this.wheres = theWheres;
	}

}
