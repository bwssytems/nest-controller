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

public class WhereDeserializer implements JsonDeserializer<Where> {
	private Map<String, WhereDetail> whereDetails;
    @Override
    public Where deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx)
    {
        JsonObject obj = json.getAsJsonObject();

        whereDetails = new HashMap<String, WhereDetail>();
        for(Entry<String, JsonElement> entry:obj.entrySet()){
        	WhereDetail newObj = new Gson().fromJson(obj.getAsJsonObject(entry.getKey()),WhereDetail.class);
            whereDetails.put(entry.getKey(), newObj);
        } 
        return new Where(whereDetails);
    }

}
