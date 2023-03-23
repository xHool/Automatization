package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject{

	public static Target txtUser=Target.the("Campo de Username: ").locatedBy("//input[@name='userName']");
	public static Target txtPassword=Target.the("Campo de Password e").locatedBy("//input[@name='password']");
	public static Target btnSubmit=Target.the("Boton de Submit").locatedBy("//input[@type='submit']");	
}
