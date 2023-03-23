package com.sophossolutions.page;

import net.serenitybdd.core.pages.PageObject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import com.sophossolutions.actions.Action;
import com.sophossolutions.utils.Constants;

public class TheNumberGamePage extends PageObject {
	By selectBuild = By.id("buildNumber");
	By btnReRoll = By.id("rollDiceButton");
	By strInputNumberGuess = By.id("numberGuess");
	By btmSubmit = By.id("submitButton");
	By strMessage = By.xpath("//label[@id='feedbackLabel']/descendant::i");

	public void navigate(String strUrl) {
		getDriver().navigate().to(strUrl);
	}

	public void playGame(String strBuild, String strNumberGuess) {
		int intAttempts = 1;
		int intNumberGuess = Integer.parseInt(strNumberGuess);

		Action.selectOption(getDriver(), selectBuild, strBuild);
		Action.clickElement(getDriver(), btnReRoll);

		while (intAttempts < 13) {
			Action.sendData(getDriver(), strInputNumberGuess, intNumberGuess + "");
			Action.clickElement(getDriver(), btmSubmit);

			if (Action.getText(getDriver(), strMessage).contains(Constants.getData("Success text"))) {
				break;
			} else if (Action.getText(getDriver(), strMessage).contains("Too low!")) {
				intNumberGuess++;
			} else if (Action.getText(getDriver(), strMessage).contains("Too high!")) {
				intNumberGuess--;
			}
			intAttempts++;

		}
		System.out.println("The user managed to guess the number in " + intAttempts + " attempts");

	}

	public void validateText(String strText) {
		assertTrue("The test failed", Action.getText(getDriver(), strMessage).contains(Constants.getData(strText)));
	}
}
