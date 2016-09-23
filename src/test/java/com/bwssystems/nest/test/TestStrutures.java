package com.bwssystems.nest.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.bwssystems.nest.protocol.status.Device;
import com.bwssystems.nest.protocol.status.DeviceDeserializer;
import com.bwssystems.nest.protocol.status.NestStatus;
import com.bwssystems.nest.protocol.status.Shared;
import com.bwssystems.nest.protocol.status.SharedDeserializer;
import com.bwssystems.nest.protocol.status.Structure;
import com.bwssystems.nest.protocol.status.StructureDeserializer;
import com.bwssystems.nest.protocol.status.Where;
import com.bwssystems.nest.protocol.status.WhereDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestStrutures {
	public static void main(String[] args) {
		String content = null;
		Path jsonPath = Paths.get(args[0]);
		Gson gson =
                new GsonBuilder()
                .registerTypeAdapter(Device.class, new DeviceDeserializer())
                .registerTypeAdapter(Structure.class, new StructureDeserializer())
                .registerTypeAdapter(Where.class, new WhereDeserializer())
                .registerTypeAdapter(Shared.class, new SharedDeserializer())
                .create();
		System.out.println("********************************************************");
		if(Files.notExists(jsonPath) || !Files.isReadable(jsonPath)){
			System.out.println("Error reading the file: " + jsonPath + " - Does not exist or is not readable. continuing...");
		}
		else {
			
			try {
				content = new String(Files.readAllBytes(jsonPath));
			} catch (IOException e) {
				System.out.println("Error reading the file: " + jsonPath + " message: " + e.getMessage());
			}
			
			NestStatus testStatus = gson.fromJson(content, NestStatus.class);
			
			if(testStatus != null)
				System.out.println("Test Successful");
			else
				System.out.println("CAnnot convert data");
		}
	}

}
