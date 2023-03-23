package com.sophososolutions.stepDefinions;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.task.SetFiltros;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;

public class FlightResultsStepDefinitions {

	@Managed
	WebDriver myBrowser;

	@When("I complete action")
	public void iCompleteAction() {
		System.out.println("When");
		OnStage.theActorInTheSpotlight().wasAbleTo(SetFiltros.select());
	}
}
