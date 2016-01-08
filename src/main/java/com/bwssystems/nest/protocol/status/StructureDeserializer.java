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

public class StructureDeserializer implements JsonDeserializer<Structure> {
	private Map<String, StructureDetail> structureDetails;
    @Override
    public Structure deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx)
    {
        JsonObject obj = json.getAsJsonObject();

        structureDetails = new HashMap<String, StructureDetail>();
        for(Entry<String, JsonElement> entry:obj.entrySet()){
        	StructureDetail newObj = new Gson().fromJson(obj.getAsJsonObject(entry.getKey()),StructureDetail.class);
            structureDetails.put(entry.getKey(), newObj);
        } 
        return new Structure(structureDetails);
    }

}
