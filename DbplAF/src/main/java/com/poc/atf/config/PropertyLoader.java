package com.poc.atf.config;

import java.util.ResourceBundle;

public class PropertyLoader {
	
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("config");
	
	public static String getBrowser() {
		return RESOURCE_BUNDLE.getString("browserType");
	}
	
	public static String getChromePath() {
		return RESOURCE_BUNDLE.getString("browserChromePath");
	}
	
	public static String getEdgePath() {
		return RESOURCE_BUNDLE.getString("browserEdgePath");
	}
	
	public static String getFirefoxPath() {
		return RESOURCE_BUNDLE.getString("browserFirefoxPath");
	}
	
	public static String getDBPLUrl() {
		return RESOURCE_BUNDLE.getString("DbplQaUrl");
	}
	
	public static String getLoginData() {
		return RESOURCE_BUNDLE.getString("loginDataPath");
	}

	public static String getPOCUrl() {
		return RESOURCE_BUNDLE.getString("pocQaUrl");
	}
}
 