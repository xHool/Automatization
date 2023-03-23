package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject{
	
	public static Target txtTittle=Target.the("Titulo de bienvenida").locatedBy("//h3[text()='Login Successfully']");	
}
