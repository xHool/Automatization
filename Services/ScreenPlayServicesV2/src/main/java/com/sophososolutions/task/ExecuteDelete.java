package com.sophososolutions.task;

import com.sophososolutions.utils.Constants;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

public class ExecuteDelete implements Task{
	private String strEndPoint;
	private String strId;

	public ExecuteDelete(String strEndPoint, String strId) {
		super();
		this.strEndPoint = Constants.getData(strEndPoint);
		this.strId = strId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Delete.from(strEndPoint.concat(strId)).with(requestEspecification ->
		requestEspecification.auth().oauth2(Constants.getData("Token Go Rest"))));
	}
	
	public static ExecuteDelete withToken(String strEndPoint, String strId) {
		return Tasks.instrumented(ExecuteDelete.class, strEndPoint, strId);
	}
}
