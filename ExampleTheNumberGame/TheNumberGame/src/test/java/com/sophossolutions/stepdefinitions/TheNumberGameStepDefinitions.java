package com.sophossolutions.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.page.TheNumberGamePage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class TheNumberGameStepDefinitions {

	TheNumberGamePage theNumberGamePage;

	@Managed
	WebDriver myBrowser;

	@Given("Since I am on the page {string}")
	public void sinceIAmOnThePage(String strUrl) {
		System.out.println("Given");
		theNumberGamePage.navigate(Constants.getData(strUrl));
	}

	@When("Try to guess the correct number {string} with the build. {string}")
	public void tryToGuessTheCorrectNumberWithTheBuild(String strNumberGuess, String strBuild) {
		System.out.println("When");
		theNumberGamePage.playGame(strBuild, strNumberGuess);
	}

	@Then("We validate that the number was guessed by looking at the text {string}")
	public void weValidateThatTheNumberWasGuessedByLookingAtTheText(String string){
		System.out.println("Then");
		theNumberGamePage.validateText(string);
	}
}
