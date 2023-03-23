package com.sophososolutions.stepDefinions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.util.*;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class LoginNewToursStepDefinitios { 
	
	@Managed
	WebDriver myBrowser;
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("Se debe estar en la pagina de New Tours. {string}")
	public void seDebeEstarEnLaPaginaDeNewTours(String url) {
	    OnStage.theActorCalled("Will").wasAbleTo(Open.url(Constants.getData(url)));
	}
	@When("Se agregan las credenciales.")
	public void seAgreganLasCredenciales() {
	   OnStage.theActorInTheSpotlight().wasAbleTo(SetCredentials.formLoginNewTours(Constants.getData("User"), Constants.getData("Password")));
	}
	@Then("Se valida el texto en el home. {string}")
	public void seValidaElTextoEnElHome(String text) {
	    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(HomePage.txtTittle), Matchers.equalTo(text)).orComplainWith(UnexpectedResult.class, "El titulo de la clase no coincide"));
	}
}
