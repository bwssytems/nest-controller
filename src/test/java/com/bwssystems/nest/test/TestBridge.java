package com.bwssystems.nest.test;

import java.util.ListIterator;
import java.util.Set;

import com.bwssystems.nest.controller.Home;
import com.bwssystems.nest.controller.Nest;
import com.bwssystems.nest.controller.NestSession;
import com.bwssystems.nest.controller.Thermostat;
import com.bwssystems.nest.protocol.error.LoginException;
import com.bwssystems.nest.protocol.status.WhereDetail;
import com.bwssystems.nest.protocol.status.WhereItem;

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
			System.out.println("Home Structure: " + theNest.getHome(name).getDetail().getName() + ", " + theNest.getHome(name).getDetail().getUser() + ", " + name);
		}
		Thermostat thermo = null;
		Thermostat thermo1 = null;
		Set<String> thermoNames = theNest.getThermostatNames();
		System.out.println("----------------------------------------");
		for(String name : thermoNames) {
			thermo = theNest.getThermostat(name);
			if(thermo1 == null)
				thermo1 = theNest.getThermostat(name);
			String where = null;
			String homeName= null;
			Boolean found = false;
			for(String aHomeName : homeNames) {
				WhereDetail aDetail = theNest.getWhere(aHomeName);
				ListIterator<WhereItem> anIterator = aDetail.getWheres().listIterator();
				while(anIterator.hasNext()) {
					WhereItem aWhereItem = (WhereItem) anIterator.next();
					if(aWhereItem.getWhereId().equals(thermo.getDeviceDetail().getWhereId())) {
						where = aWhereItem.getName();
						homeName = theNest.getHome(aHomeName).getDetail().getName();
						found = true;
						break;
					}
				}
				if(found)
					break;
			}
			System.out.println("Thermotat: " + where + "(" + name.substring(name.length() - 4) + "), Location: " + where + " - " + homeName);
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
