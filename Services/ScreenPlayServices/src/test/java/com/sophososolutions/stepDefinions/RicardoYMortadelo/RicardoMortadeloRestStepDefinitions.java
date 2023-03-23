package com.sophososolutions.stepDefinions.RicardoYMortadelo;

import com.sophososolutions.utils.Constants;
import com.sophososolutions.apis.RicardoMortadeloRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RicardoMortadeloRestStepDefinitions {
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("Dado que el {string} establece la base url {string} del servicio.")
	public void dadoQueElEstableceLaBaseUrlDelServicio(String strActorName, String strBaseUrl) {
	    RicardoMortadeloRestApi.setBaseUrl(Constants.getData(strBaseUrl));
	}
	
	@When("Consulta el endpoint del api {string} usando el id {string}")
	public void consultaElEndpointDelApiUsandoElId(String endPoint, String strId) {
		RicardoMortadeloRestApi.executeGetRest(Constants.getData(endPoint).concat(strId));
	}
	@Then("Validar el statusCode sea {int} y que la data sea la indicada.")
	public void validarElStatusCodeSeaYQueLaDataSeaLaIndicada(Integer code, DataTable dataTable) {
		RicardoMortadeloRestApi.validateStatusCode(code);
		RicardoMortadeloRestApi.validateField(dataTable);
	}
}
