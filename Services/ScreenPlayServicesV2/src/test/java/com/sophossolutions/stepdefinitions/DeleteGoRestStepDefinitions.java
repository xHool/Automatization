package com.sophossolutions.stepdefinitions;

import com.sophososolutions.task.ExecuteDelete;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class DeleteGoRestStepDefinitions {
	@When("Consulta el endpoint {string} por medio de la peticion delete y con el id {string}.")
	public void consultaElEndpointPorMedioDeLaPeticionDeleteYConElId(String strEndPoint, String strId) {
	OnStage.theActorInTheSpotlight().attemptsTo(ExecuteDelete.withToken(strEndPoint, strId));
	}
	@Then("Validar el statusCode sea {int}")
	public void validarElStatusCodeSea(Integer intStatusCode) {
	    OnStage.theActorInTheSpotlight().should(seeThatResponse(validateStatusCode -> validateStatusCode.statusCode(intStatusCode)));
	}	
}
