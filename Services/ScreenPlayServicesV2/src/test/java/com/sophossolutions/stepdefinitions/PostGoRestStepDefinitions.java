package com.sophossolutions.stepdefinitions;

import com.sophososolutions.task.ExecutePost;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;

public class PostGoRestStepDefinitions {
	@When("Consulta el endpoint {string} por medio de la peticion post.")
	public void consultaElEndpointPorMedioDeLaPeticionPost(String strEndPoint, DataTable dataTable) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecutePost.withTokens(strEndPoint, dataTable));
		
		SerenityRest.lastResponse().prettyPeek();
	}
}
