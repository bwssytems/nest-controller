package com.bwssystems.nest.protocol.auth;

public class Limits {
	private Integer thermostats_per_structure;
	private Integer structures;
	private Integer thermostats;
	private Integer smoke_detectors;
	private Integer smoke_detectors_per_structure;
	public Integer getThermostats_per_structure() {
		return thermostats_per_structure;
	}
	public void setThermostats_per_structure(Integer thermostats_per_structure) {
		this.thermostats_per_structure = thermostats_per_structure;
	}
	public Integer getStructures() {
		return structures;
	}
	public void setStructures(Integer structures) {
		this.structures = structures;
	}
	public Integer getThermostats() {
		return thermostats;
	}
	public void setThermostats(Integer thermostats) {
		this.thermostats = thermostats;
	}
	public Integer getSmoke_detectors() {
		return smoke_detectors;
	}
	public void setSmoke_detectors(Integer smoke_detectors) {
		this.smoke_detectors = smoke_detectors;
	}
	public Integer getSmoke_detectors_per_structure() {
		return smoke_detectors_per_structure;
	}
	public void setSmoke_detectors_per_structure(Integer smoke_detectors_per_structure) {
		this.smoke_detectors_per_structure = smoke_detectors_per_structure;
	}
}
