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

public class SharedDeserializer implements JsonDeserializer<Shared> {
	private Map<String, SharedDetail> sharedDetails;
    @Override
    public Shared deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx)
    {
        JsonObject obj = json.getAsJsonObject();

        sharedDetails = new HashMap<String, SharedDetail>();
        for(Entry<String, JsonElement> entry:obj.entrySet()){
        	SharedDetail newObj = new Gson().fromJson(obj.getAsJsonObject(entry.getKey()),SharedDetail.class);
            sharedDetails.put(entry.getKey(), newObj);
        } 
        return new Shared(sharedDetails);
    }

}
