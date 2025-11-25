package com.poc.atf.data;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DBPLDataConfig {
	
	JSONParser parser = null;
	JSONObject json = null;
	ObjectMapper objectMapper = null;
	
	public LoginData getLoginData() {
		LoginData loginData = null;
		try {
			parser = new JSONParser();
			json = (JSONObject) parser.parse(new FileReader("src/main/resources/DBPL-data/DBPLLogin.json"));
			objectMapper = new ObjectMapper();
			loginData = objectMapper.readValue(json.toString(), LoginData.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginData;
	} 
	
//	public ActiveScreenData getActiveScreenData() {
//		ActiveScreenData activeScreenData = null;
//		try {
//			parser = new JSONParser();
//			json = (JSONObject) parser.parse(new FileReader("src/main/resources/DBPL-data/ActiveScreen.json"));
//			objectMapper = new ObjectMapper();
//			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
//					false
//					);
//			activeScreenData = objectMapper.readValue(json.toString(), ActiveScreenData.class);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return activeScreenData;
//	} 
	
	public DeliveredData getDeliveredData() {
		DeliveredData deliveredData = null;
		try {
			parser = new JSONParser();
			json = (JSONObject) parser.parse(new FileReader("src\\main\\resources\\DBPL-data\\delivered.json"));
			objectMapper = new ObjectMapper();
			deliveredData = objectMapper.readValue(json.toString(), DeliveredData.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deliveredData;
	} 
	
	public AllScreenData getAllScreenData() {
		AllScreenData allScreenData = null;
		try {
			parser = new JSONParser();
			json = (JSONObject) parser.parse(new FileReader("src\\main\\resources\\DBPL-data\\All.json"));
			objectMapper = new ObjectMapper();
			allScreenData = objectMapper.readValue(json.toString(), AllScreenData.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allScreenData;
	}
	
	public CreateDOData getCreateDOData() {
		CreateDOData createDOData = null;
		try {
			parser = new JSONParser();
			json = (JSONObject) parser.parse(new FileReader("src\\main\\resources\\DBPL-data\\CreateDO.json"));
			objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
			createDOData = objectMapper.readValue(json.toString(), CreateDOData.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return createDOData;
	}
}
	
	
