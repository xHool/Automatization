package com.sophososolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();
	
	private Constants() { 
		constantDir.put("Go Rest", "https://gorest.co.in");
		constantDir.put("GoRest EndPoint", "/public/v2/users/");
		constantDir.put("Token Go Rest", "0dcb692ea4c51a848e696130eab6b2db8951f6aab9a5a53c38281de8e6e44e4b");
		constantDir.put("Go Schema", "src/test/resources/com/sophossolutions/resources/go_rest_schema_user.json");
		
	}
	
	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}

}
