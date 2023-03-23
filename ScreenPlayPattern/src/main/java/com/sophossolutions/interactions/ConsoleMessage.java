package com.sophossolutions.interactions;

import com.sophossolutions.models.UserCredentials;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class ConsoleMessage implements Interaction{
	
	private String strMessage;

	public ConsoleMessage(String strMessage) {
		super();
		this.strMessage = strMessage;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println(this.strMessage);
		strMessage = strMessage + "Will";
		actor.remember("Message", new UserCredentials("Usuario", "Contraseña"));
	}
	
	public static ConsoleMessage withMessage(String strMessage) {
		return Tasks.instrumented(ConsoleMessage.class, strMessage);
	}
	
}
