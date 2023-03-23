package com.sophososolutions.stepDefinions.GoRest;

import java.util.Map;

import com.sophososolutions.apis.GoRestApi;

import com.sophososolutions.utils.Constants;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import static com.sophososolutions.utils.Constants.getData;

public class PostGoRestoStepDefinitions {

	@When("Consulta el EndPoint {string} por medio de una peticion post.")
	public void consultaElEndPointPorMedioDeUnaPeticionPost(String strEndPoint, DataTable dataTable) {
		Map<String, String> body = dataTable.asMap(String.class, String.class);
		SerenityRest.given().auth().oauth2(GoRestApi.STR_TOKEN).contentType(ContentType.JSON).when().body(body)
				.post(getData("Go Rest").concat(getData(strEndPoint)));
		
		SerenityRest.lastResponse().prettyPeek();
	}

	@Then("Validar el statusCode sea {int} y que el esquema {string} sea el correcto.")
	public void validarElStatusCodeSeaYQueElEsquemaSeaElCorrecto(Integer intCodeStatus, String strRuta) {
		GoRestApi.validateStatusCode(intCodeStatus);
		GoRestApi.validateSchema(Constants.getData(strRuta));
	}
}
