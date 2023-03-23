package com.sophososolutions.restinteractions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import com.sophososolutions.utils.Constants;
import io.cucumber.datatable.DataTable;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;

public class RestInteraction {
	private static String strBaseUrl;

	public static void setBaseUrl(String strBaseurl) {
		RestInteraction.strBaseUrl = strBaseurl;
	}

	public static void executeGetRest(String strEndPoint) {
		System.out.println("strEndPoint = " + strEndPoint);
		SerenityRest.given().when().get(strBaseUrl.concat(strEndPoint));
		SerenityRest.lastResponse().prettyPeek();
	}
	
	public static void validateStatusCode(int intStatusCode) {
		int intResponseCode = SerenityRest.lastResponse().getStatusCode();
		assertEquals(intStatusCode, intResponseCode, "El estatus code esperado no coincide...");
	}
	
	public static void validateField(String strFieldName, String strFieldValue) {
		JsonPath responseJSON = SerenityRest.lastResponse().jsonPath();
		String strFIeldValueObtained = responseJSON.getString(strFieldName);
		assertEquals(strFieldValue, strFIeldValueObtained, "El valor del campo esperado no coincide...");
	}
	
	public static void validateFields(DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		Iterator<String> it = data.keySet().iterator();
		
		JsonPath responseJSON = SerenityRest.lastResponse().jsonPath();
		
//		System.out.println( responseJSON.getString("episode[2].id")); TENER EN CUENTA.
		
		while(it.hasNext()) {
			String key = it.next();
			String strFIeldValueObtained = responseJSON.getString(key);
			assertEquals(data.get(key), strFIeldValueObtained, "El valor del campo esperado no coincide...");
		}
	}

	public static void validateSchema(String strSchema){
		SerenityRest.lastResponse().then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(strSchema)));
	}
}
