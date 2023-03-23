package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GuruHomePage extends PageObject{
	public static Target txtWelcome=Target.the("Texto de bienvenida: ").locatedBy("//marquee[@class='heading3']");
}
