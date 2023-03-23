package com.sophososolutions.task;

import java.util.Map;

import com.sophososolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Patch;

public class ExecutePath implements Task {
	private String strEndPoint;
	private String strId;
	private Map<String, String> mapBody;

	public ExecutePath(String strEndPoint, String strId, DataTable dataTable) {
		super();
		this.strEndPoint = Constants.getData(strEndPoint);
		this.strId = strId;
		this.mapBody = dataTable.asMap(String.class, String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Patch.to(strEndPoint.concat(strId)).with(
				requestEspecification -> requestEspecification.auth().oauth2(Constants.getData("Token Go Rest")).body(mapBody)));
	}

	public static ExecutePath withToken(String strEndPoint, String strId,DataTable dataTable) {
		return Tasks.instrumented(ExecutePath.class, strEndPoint, strId, dataTable);
	}
}
