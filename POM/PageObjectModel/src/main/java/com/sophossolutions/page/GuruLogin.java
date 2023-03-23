package com.sophossolutions.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


import org.openqa.selenium.By;

import com.sophossolution.action.Action;

/** Definimos la url a la cual nos vamos a conectar, con eso se abre directamente a esta pagina. **/
@DefaultUrl("https://demo.guru99.com/V4/")
public class GuruLogin extends PageObject{

  By userName = By.name("uid"); //Almacena la referencia al elemento que vamos a conectar.
  By password = By.name("password"); 
  By button = By.name("btnLogin"); 

  public void navegar(String url) {
	  getDriver().navigate().to(url);
  }

  public void login(String userName, String password) {
	  Action.sendData(getDriver(), this.userName, userName);
	  Action.sendData(getDriver(), this.password, password);
	  Action.clickElement(getDriver(), this.button);
  }
}
