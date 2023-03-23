package com.sophososolutions.stepDefinions.GoRest;

import com.sophososolutions.utils.Constants;
import com.sophososolutions.apis.GoRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetGoRestStepDefinitions {
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Dado que {string} establece la base url {string} del servicio.")
	public void dadoQueEstableceLaBaseUrlDelServicio(String strActorName, String strBaseUrl) {
		GoRestApi.setBaseUrl(Constants.getData(strBaseUrl));
	}

	@When("Consulta el endpoint {string} usando el id {string}")
	public void consultaElEndpointUsandoElId(String endPoint, String strId) {
		GoRestApi.executeGetRest(Constants.getData(endPoint).concat(strId));
	}

	@Then("Validar el statusCode sea {int} y que la data sea correcta.")
	public void validarElStatusCodeSeaYQueLaDataSeaCorrecta(Integer code,DataTable dataTable) {
		GoRestApi.validateStatusCode(code);
		GoRestApi.validateField(dataTable);
		GoRestApi.validateSchema(Constants.getData("Schame GoRest"));
	}
}
