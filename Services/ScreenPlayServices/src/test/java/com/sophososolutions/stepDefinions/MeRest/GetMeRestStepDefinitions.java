package com.sophososolutions.stepDefinions.MeRest;

import com.sophososolutions.utils.Constants;
import com.sophososolutions.apis.MeRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetMeRestStepDefinitions {
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Dado que {string} establece la base de la url {string} del servicio a consultar.")
	public void dadoQueEstableceLaBaseDeLaUrlDelServicioAConsultar(String string, String url) {
		MeRestApi.setBaseUrl(Constants.getData(url));
	}
	@When("Consulta el endpoint {string} con metodo get y usando el email {string} del usuario.")
	public void consultaElEndpointConMetodoGetYUsandoElEmailDelUsuario(String endPoint, String strId) {
		MeRestApi.executeGetRest(Constants.getData(endPoint).concat("/" + strId));
	}
	@Then("Validar el statusCode sea {int} y que el response que entrega el servicio sea correcto, asi como validar el schema {string}.")
	public void validarElStatusCodeSeaYQueElResponseQueEntregaElServicioSeaCorrectoAsiComoValidarElSchema(Integer code, String strSchema, DataTable dataTable) {
		MeRestApi.validateStatusCode(code);
		MeRestApi.validateField(dataTable);
		MeRestApi.validateSchema(Constants.getData(strSchema));
	}
}
