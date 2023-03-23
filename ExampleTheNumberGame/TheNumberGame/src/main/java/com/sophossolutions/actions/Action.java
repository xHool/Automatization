package com.sophossolutions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Action {
	public static void sendData(WebDriver myBrowser, By target, String data) {

		myBrowser.findElement(target).sendKeys(data);
	}

	public static void clickElement(WebDriver myBrowser, By target) {
		myBrowser.findElement(target).click();
	}

	public static void selectOption(WebDriver myBrowser, By target, String strOption) {
		WebElement element = myBrowser.findElement(target);
		Select options = new Select(element);
		options.selectByVisibleText(strOption);
	}
	
	public static String getText(WebDriver myBrowser, By target) {
		WebElement element = myBrowser.findElement(target);
		return element.getText();
	}
}
