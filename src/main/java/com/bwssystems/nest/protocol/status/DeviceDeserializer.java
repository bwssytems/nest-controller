package com.bwssystems.nest.protocol.status;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class DeviceDeserializer implements JsonDeserializer<Device> {
	private Map<String, DeviceDetail> devices;
    @Override
    public Device deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx)
    {
        JsonObject obj = json.getAsJsonObject();

        devices = new HashMap<String, DeviceDetail>();
        for(Entry<String, JsonElement> entry:obj.entrySet()){
            DeviceDetail newDevice = new DeviceDetail();
            JsonObject theRawDetail = obj.getAsJsonObject(entry.getKey());
            newDevice.setCurrentScheduleMode(theRawDetail.get("current_schedule_mode").getAsString());
            newDevice.setFanMode(theRawDetail.get("fan_mode").getAsString());
            devices.put(entry.getKey(), newDevice);
        } 
        return new Device(devices);
    }

}
