package com.sophososolutions.stepDefinions;

import org.openqa.selenium.WebDriver;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.ComponentOf;
import com.sophossolutions.task.SetVuelos;
import com.sophossolutions.ui.FlightResultsPage;
import com.sophossolutions.util.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class SearchFlightsStepDefinitions {
	@Managed
	WebDriver myBrowser;

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Se debe estar en la pagina de {string}.")
	public void seDebeEstarEnLaPaginaDe(String url) {
		OnStage.theActorCalled("Automatizador Maestro").wasAbleTo(Open.url(Constants.getData(url)));
	}

	@When("Se llenan los datos para la busqueda del vuelo.")
	public void seLlenanLosDatosParaLaBusquedaDelVuelo(DataTable dataTable) {
		OnStage.theActorInTheSpotlight().wasAbleTo(SetVuelos.formBuscarVuelos(dataTable));
	}

	@Then("I validate the outcomes")
	public void iValidateTheOutcomes() {
		System.out.println("Then");
		OnStage.theActorInTheSpotlight()
				.should(GivenWhenThen.seeThat(ComponentOf.field(FlightResultsPage.elementValidate), Matchers.equalTo(true))
						.orComplainWith(UnexpectedResult.class, "El elemento no existe en la pagina."));
	}
}
