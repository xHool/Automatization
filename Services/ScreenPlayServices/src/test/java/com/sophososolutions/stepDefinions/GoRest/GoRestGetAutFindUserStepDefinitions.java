package com.sophososolutions.stepDefinions.GoRest;

import com.sophososolutions.apis.GoRestApi;
import static com.sophososolutions.utils.Constants.getData;

import java.util.HashMap;
import java.util.Map;

import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class GoRestGetAutFindUserStepDefinitions {

	@When("Consulta el endpoint {string} con una peticion get usando toekn y el id {string}")
	public void consultaElEndpointConUnaPeticionGetUsandoToeknYElId(String strEndPoint, String strId) {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Authorization", "Bearer ".concat(GoRestApi.STR_TOKEN));
		headers.put("Content-Type", "application/json");
		
// 	ESTA ES LA BUENA.
//		SerenityRest.given().auth().oauth2(GoRestApi.STR_TOKEN)
//				.get(getData("Go Rest").concat(getData(strEndPoint).concat(strId)));
		
//		SerenityRest.given()
//				.headers("Authorization", "Bearer ".concat(GoRestApi.STR_TOKEN), "Content-Type", ContentType.JSON)
//				.get(getData("Go Rest").concat(getData(strEndPoint).concat(strId)));
		
		SerenityRest.given().headers(headers).get(getData("Go Rest").concat(getData(strEndPoint).concat(strId)));
		SerenityRest.lastResponse().prettyPeek();
	}
}
