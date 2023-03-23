package com.sophososolutions.stepDefinions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.ui.GuruHomePage;
import com.sophossolutions.util.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class GuruLoginStepDefinitions {

	@Managed
	WebDriver myBrowser;

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Se debe encontrar en la pagina de Guru99. {string}")
	public void seDebeEncontrarEnLaPaginaDeGuru99(String url) {
		OnStage.theActorCalled("Will").wasAbleTo(Open.url(Constants.getData(url)));
	}

	@When("Se deben proporcionar las credenciales.")
	public void seDebenProporcionarLasCredenciales() {
		OnStage.theActorInTheSpotlight()
				.wasAbleTo(SetCredentials.formLoginGuru99(Constants.getData("UserGuru"), Constants.getData("PasswordGuru")));
	}

	@Then("Se debe validar el texto en el home. {string}")
	public void seDebeValidarElTextoEnElHome(String text) {
		OnStage.theActorInTheSpotlight()
				.should(GivenWhenThen.seeThat(TextOf.field(GuruHomePage.txtWelcome), Matchers.equalTo(text))
						.orComplainWith(UnexpectedResult.class, "El titulo de la clase no coincide"));
	}
}
