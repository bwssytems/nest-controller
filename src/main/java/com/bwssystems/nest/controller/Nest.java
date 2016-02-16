package com.bwssystems.nest.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.http.client.methods.HttpGet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bwssystems.nest.protocol.status.Device;
import com.bwssystems.nest.protocol.status.DeviceDeserializer;
import com.bwssystems.nest.protocol.status.NestStatus;
import com.bwssystems.nest.protocol.status.Shared;
import com.bwssystems.nest.protocol.status.SharedDeserializer;
import com.bwssystems.nest.protocol.status.Structure;
import com.bwssystems.nest.protocol.status.StructureDeserializer;
import com.bwssystems.nest.protocol.status.Where;
import com.bwssystems.nest.protocol.status.WhereDeserializer;
import com.bwssystems.nest.protocol.status.WhereDetail;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Nest {
	private Logger log = LoggerFactory.getLogger(Nest.class);
	private NestSession theSession;
	private NestStatus theStatus;
	private Gson gson;
	private Map<String, Thermostat> theThermostats;
	private Map<String, Home> theHomes;
	
	public Nest(NestSession aSession) {
		super();
		gson =
                new GsonBuilder()
                .registerTypeAdapter(Device.class, new DeviceDeserializer())
                .registerTypeAdapter(Structure.class, new StructureDeserializer())
                .registerTypeAdapter(Where.class, new WhereDeserializer())
                .registerTypeAdapter(Shared.class, new SharedDeserializer())
                .create();
		theSession = aSession;
		theThermostats = new HashMap<String, Thermostat>();
		theHomes = new HashMap<String, Home>();
		_getStatus();
	}
	
	private void _getStatus() {
		log.debug("getting status...");
        HttpGet newRequest = new HttpGet(theSession.getTransport_url() + "/v2/mobile/user." + theSession.getUserid());
        String response = theSession.execute(newRequest);
        theStatus = gson.fromJson(response, NestStatus.class);
        for(String key : theStatus.getDevice().getDevices().keySet()) {
        	if(theThermostats.get(key) == null)
        		theThermostats.put(key, new Thermostat(theSession, key, theStatus.getDevice().getDevices().get(key), theStatus.getShared().getSharedDetails().get(key)));
        	else
        		theThermostats.get(key).reinitialize(theStatus.getDevice().getDevices().get(key), theStatus.getShared().getSharedDetails().get(key));
        }
        for(String key : theStatus.getStructure().getStructureDetails().keySet()) {
        	if(theHomes.get(key) == null)
        		theHomes.put(key, new Home(theSession, key, theStatus.getStructure().getStructureDetails().get(key)));
        	else
        		theHomes.get(key).reinitialize(theStatus.getStructure().getStructureDetails().get(key));
        }
	}

	public Thermostat getThermostat(String aName) {
		if(theSession == null)
			return null;
		_getStatus();
		return theThermostats.get(aName);
	}
	
	public Home getHome(String aName) {
		if(theSession == null)
			return null;
		_getStatus();
		return theHomes.get(aName);
	}
	
	public Set<String> getThermostatNames() {
		if(theSession == null)
			return null;
		return theThermostats.keySet();
	}

	public Set<String> getHomeNames() {
		if(theSession == null)
			return null;
		return theHomes.keySet();
	}
	
	public WhereDetail getWhere(String aName) {
		if(theSession == null)
			return null;
		return theStatus.getWhere().getWheres().get(aName);
	}
	public void endNestSession() {
		theSession.close();
		theSession = null;
	}
}