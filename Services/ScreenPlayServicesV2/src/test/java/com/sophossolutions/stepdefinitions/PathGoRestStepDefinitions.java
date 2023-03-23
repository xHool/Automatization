package com.sophossolutions.stepdefinitions;

import com.sophososolutions.task.ExecutePath;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class PathGoRestStepDefinitions {

	@When("Consulta el endpoint {string} por medio de la peticion path y por medio del id {string}.")
	public void consultaElEndpointPorMedioDeLaPeticionPathYPorMedioDelId(String strEndPoint, String strId, DataTable mapBody) {
		OnStage.theActorInTheSpotlight().attemptsTo(ExecutePath.withToken(strEndPoint, strId, mapBody));
	}
	 

}
