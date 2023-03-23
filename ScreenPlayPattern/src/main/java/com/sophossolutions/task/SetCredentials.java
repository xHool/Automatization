package com.sophossolutions.task;

import com.sophossolutions.interactions.ConsoleMessage;
import com.sophossolutions.models.UserCredentials;
import com.sophossolutions.ui.GuruLoginPage;
import com.sophossolutions.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SetCredentials implements Task {
	private Target targetUser;
	private Target targetPassword;
	private Target targetButton;
	private String strUser;
	private String strPassword;

	public SetCredentials(String user, String password, Target targetUser, Target targetPassword, Target targetButton) {
		this.strUser = user;
		this.strPassword = password;
		this.targetUser = targetUser;
		this.targetPassword = targetPassword;
		this.targetButton = targetButton;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(this.strUser).into(targetUser),
				Enter.theValue(this.strPassword).into(targetPassword),
				ConsoleMessage.withMessage("Hi!, i am the message..."),
				Click.on(targetButton));
		UserCredentials strResult = actor.recall("Message");
		System.out.println(strResult);
	}

	public static SetCredentials with() {
		return Tasks.instrumented(SetCredentials.class, "Will");
	}

	public static SetCredentials formLoginNewTours(String user, String password) {
		return Tasks.instrumented(SetCredentials.class, user, password, LoginPage.txtUser, LoginPage.txtPassword, LoginPage.btnSubmit);
	}
	
	public static SetCredentials formLoginGuru99(String user, String password) {
		return Tasks.instrumented(SetCredentials.class, user, password, GuruLoginPage.txtUser, GuruLoginPage.txtPassword, GuruLoginPage.bntLogin);
	}
}
