package com.bwssystems.nest.test;

import java.util.Set;

import com.bwssystems.nest.controller.Home;
import com.bwssystems.nest.controller.Nest;
import com.bwssystems.nest.controller.NestSession;
import com.bwssystems.nest.controller.Thermostat;
import com.bwssystems.nest.protocol.error.LoginException;

public class TestBridge {
	public static void main(String[] args) {
		System.out.println("********************************************************");
		System.out.println("Initialize Session and Nest");
		NestSession theSession = null;
		try {
			theSession = new NestSession(args[0], args[1]);
		} catch (LoginException e) {
			System.out.println("Caught Login Exception, exiting....");
			System.exit(1);
		}
		Nest theNest = new Nest(theSession);
		Set<String> homeNames = theNest.getHomeNames();
		Home aHome = null;
		System.out.println("----------------------------------------");
		for(String name : homeNames) {
			if(aHome == null)
				aHome = theNest.getHome(name);
			System.out.println("Home Structure: " + theNest.getHome(name).getName() + "," + theNest.getHome(name).getDetail().getUser());
		}
		Thermostat thermo1 = null;
		Set<String> thermoNames = theNest.getThermostatNames();
		System.out.println("----------------------------------------");
		for(String name : thermoNames) {
			if(thermo1 == null)
				thermo1 = theNest.getThermostat(name);
			System.out.println("Thermotat: " + theNest.getThermostat(name).getDeviceName() + ", " + theNest.getThermostat(name).getDeviceDetail().getHeaterSource());
		}
		System.out.println("********************************************************");
		System.out.println("Set Away: " + false);
		aHome.setAway(Boolean.FALSE);
		System.out.println("********************************************************");
		Float targetTemp = new Float(25.2790765);
		thermo1.setTargetTemperature(targetTemp);
		System.out.println("----------------------------------------");
		System.out.println("Set Target Temp: " + targetTemp.toString());
		System.out.println("----------------------------------------");
		System.out.println("********************************************************");
		String targetType = "range";
		thermo1.setTargetType(targetType);
		System.out.println("----------------------------------------");
		System.out.println("Set Target Type: " + targetType);
		System.out.println("----------------------------------------");
		System.out.println("********************************************************");
		String fanmode = "auto"; /* on or auto */
		thermo1.setFanMode(fanmode);
		System.out.println("----------------------------------------");
		System.out.println("Set Fan Mode: " + fanmode);
		System.out.println("----------------------------------------");
		System.out.println("********************************************************");
		System.out.println("----------------------------------------");
		System.out.println("Current Target Temp Type: " + theNest.getThermostat(thermo1.getDeviceName()).getSharedDetail().getTargetTemperatureType());
		System.out.println("----------------------------------------");
		System.out.println("********************************************************");
		theSession.close();
    }
}
