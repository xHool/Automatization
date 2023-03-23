package com.sophossolution.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
	
	public static void sendData(WebDriver myBrowser, By target, String data) {
		
		myBrowser.findElement(target).sendKeys(data);
	}
	
	public static void clickElement(WebDriver myBrowser, By target) {
		myBrowser.findElement(target).click();
	}

}
