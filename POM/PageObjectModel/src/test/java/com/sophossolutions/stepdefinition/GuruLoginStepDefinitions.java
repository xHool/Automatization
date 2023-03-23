package com.sophossolutions.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.page.GuruLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class GuruLoginStepDefinitions {
	GuruLogin guruLogin;
	
	@Managed /** redirecciona configuracion a utilizar en el navegardor desde archivo "serenity.properties." **/
	WebDriver myBrowser;
	
	@Given("El usuario debe estar en la pagina guru99.")
	public void elUsuarioDebeEstarEnLaPaginaGuru99() {
	    System.out.println("Estoy en el given");
	    guruLogin.navegar("https://demo.guru99.com/V4/");
	    guruLogin.login("mngr480422", "EvubEma");
	}
	@When("Ingresa credenciales y se autentica.")
	public void ingresaCredencialesYSeAutentica() {
		System.out.println("Estoy en el when");
	}
	@Then("I validate the outcomes")
	public void iValidateTheOutcomes() {
		System.out.println("Estoy en el Then");
	}
}
