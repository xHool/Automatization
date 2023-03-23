package com.sophososolutions.task;

import com.sophososolutions.utils.Constants;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ExecuteGet implements Task {
	private String strEndPoint;
	private String strId;

	public ExecuteGet(String strEndPoint, String strId) {
		super();
		this.strEndPoint = strEndPoint;
		this.strId = strId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(strEndPoint.concat(strId)).with(
				requestEspecification -> requestEspecification.auth().oauth2(Constants.getData("Token Go Rest"))));
	}

	public static ExecuteGet withTokens(String strEndPoint, String strId) {
		return Tasks.instrumented(ExecuteGet.class, Constants.getData(strEndPoint), strId);
	}

}
