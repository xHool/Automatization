package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.io.File;

import com.sophososolutions.task.ExecuteGet;
import com.sophososolutions.utils.Constants;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GetGoRestStepDefinition {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Dado que {string} establece la base url {string} del servicio.")
	public void dadoQueEstableceLaBaseUrlDelServicio(String strActorName, String strBaseUrl) {
		OnStage.theActorCalled(strActorName).whoCan(CallAnApi.at(Constants.getData(strBaseUrl)));
	}

	@When("Consulta el endpoint {string} usando el id {string}")
	public void consultaElEndpointUsandoElId(String strEndPoint, String strId) {
		OnStage.theActorInTheSpotlight().attemptsTo(ExecuteGet.withTokens(strEndPoint, strId));
	}

	@Then("Validar el statusCode sea {int} y que el esquema sea correcto {string}")
	public void validarElStatusCodeSeaYQueElEsquemaSeaCorrecto(Integer intStatusCode, String strSchema) {
		OnStage.theActorInTheSpotlight()
				.should(seeThatResponse(validateResponse -> validateResponse.statusCode(intStatusCode)
						.body(JsonSchemaValidator.matchesJsonSchema(new File(Constants.getData(strSchema))))));
	}
}
