package com.sophososolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();
	
	private Constants() { 
		constantDir.put("Go Rest", "https://gorest.co.in");
		constantDir.put("Endpoint GoRest", "/public/v2/users/");
		constantDir.put("Ricardo y Mortadelo", "https://rickandmortyapi.com");
		constantDir.put("Endpoint RYM", "/api/character/");
		constantDir.put("Me Rest", "http://localhost:8080");
		constantDir.put("Endpoint MeRest", "/api/v1/user");
		constantDir.put("Schame MeRest", "src/test/resources/com/sophosolutions/src/MeRest.json");
		constantDir.put("Schame GoRest", "src/test/resources/com/sophosolutions/src/GoRest.json");
	}
	
	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}

}
