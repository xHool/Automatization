package com.sophososolutions.apis;

import com.sophososolutions.restinteractions.RestInteraction;

import io.cucumber.datatable.DataTable;

public class RicardoMortadeloRestApi {
	
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
		RestInteraction.validateFields(dataTable);
	}
}
