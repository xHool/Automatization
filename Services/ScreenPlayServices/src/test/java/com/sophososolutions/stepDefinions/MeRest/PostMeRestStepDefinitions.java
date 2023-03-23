package com.sophososolutions.stepDefinions.MeRest;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

import java.util.Map;

import static com.sophososolutions.utils.Constants.getData;

public class PostMeRestStepDefinitions {
    @When("Consulta el endpoint {string} con metodo post.")
    public void consultaElEndpointConMetodoPost(String strEndPoint, DataTable dataTable) {
        Map<String, String> body = dataTable.asMap(String.class, String.class);
        SerenityRest.given().contentType(ContentType.JSON).when().body(body).post(getData("Me Rest").concat(getData(strEndPoint)));
        SerenityRest.lastResponse().prettyPeek();
    }
}
