package com.sophososolutions.task;

import java.util.Map;

import org.apache.http.HttpHeaders;

import com.sophososolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class ExecutePost implements Task {
	private String strEntPoint;
	private Map<String, String> mapBody;

	public ExecutePost(String strEntPoint, DataTable dataTable) {
		super();
		this.strEntPoint = strEntPoint;
		this.mapBody = dataTable.asMap(String.class, String.class);
		;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println(strEntPoint);
		actor.attemptsTo(Post.to(strEntPoint)
				.with(requestEspecification -> requestEspecification.header(HttpHeaders.CONTENT_TYPE, ContentType.JSON)
						.auth().oauth2(Constants.getData("Token Go Rest")).body(mapBody)));
		System.out.println(SerenityRest.lastResponse().prettyPrint());
	}

	public static ExecutePost withTokens(String strEndPoint, DataTable dataTable) {
		return Tasks.instrumented(ExecutePost.class, Constants.getData(strEndPoint), dataTable);
	}
}
