package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GuruLoginPage extends PageObject{
	public static Target txtUser=Target.the("Campo de Username: ").locatedBy("//input[@name='uid']");
	public static Target txtPassword=Target.the("Campo de Password: ").locatedBy("//input[@name='password']");
	public static Target bntLogin=Target.the("Boton Login: ").locatedBy("//input[@name='btnLogin']");
}
