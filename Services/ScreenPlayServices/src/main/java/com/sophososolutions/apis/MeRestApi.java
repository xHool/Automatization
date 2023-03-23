package com.sophososolutions.apis;

import java.util.Iterator;
import java.util.Map;

import com.sophososolutions.restinteractions.RestInteraction;

import io.cucumber.datatable.DataTable;

public class MeRestApi {
	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.setBaseUrl(strBaseUrl);
	}
	
	public static void executeGetRest(String strEndPoint) {
		RestInteraction.executeGetRest(strEndPoint);
	}
	
	public static void validateStatusCode(int intStatusCode) {
		RestInteraction.validateStatusCode(intStatusCode);
	}
	
	public static void validateField(DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		Iterator<String> it = data.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			RestInteraction.validateField("data.".concat(key), data.get(key));
		}
	}
	public static void validateSchema(String strSchema){
		RestInteraction.validateSchema(strSchema);
	}
}
