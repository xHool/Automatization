package com.sophossolutions.util;

import java.util.HashMap;
import java.util.Map;


public class Constants {
	
	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();
	
	private Constants() { 
		constantDir.put("New Tour", "https://demo.guru99.com/test/newtours/");
		constantDir.put("User", "pepeElPollo");
		constantDir.put("Password", "elpollopepe");
		constantDir.put("Guru99", "https://demo.guru99.com/V4/");
		constantDir.put("UserGuru", "mngr482083");
		constantDir.put("PasswordGuru", "vynEhar");
	}
	
	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
}