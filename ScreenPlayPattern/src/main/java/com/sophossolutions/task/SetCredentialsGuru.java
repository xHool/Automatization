package com.sophossolutions.task;

import com.sophossolutions.ui.GuruLoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SetCredentialsGuru implements Task{
	private String user;
	private String password;
	
	public SetCredentialsGuru(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(this.user).into(GuruLoginPage.txtUser),
		Enter.theValue(this.password).into(GuruLoginPage.txtPassword),
		Click.on(GuruLoginPage.bntLogin));
	}
	
	public static SetCredentialsGuru with() {
		return Tasks.instrumented(SetCredentialsGuru.class, "Will");
	}

	public static SetCredentialsGuru form(String user, String password) {
		return Tasks.instrumented(SetCredentialsGuru.class, user, password);
	}
	

}
