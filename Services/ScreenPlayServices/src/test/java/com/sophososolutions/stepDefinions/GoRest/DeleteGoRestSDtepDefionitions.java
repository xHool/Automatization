package com.sophososolutions.stepDefinions.GoRest;

import com.sophososolutions.apis.GoRestApi;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import static com.sophososolutions.utils.Constants.getData;

public class DeleteGoRestSDtepDefionitions {

    @When("Consulta el EndPoint {string} por medio de una peticion delete y el id {int}.")
    public void consultaElEndPointPorMedioDeUnaPeticionDeleteYElId(String strEndPoint, Integer strId) {
        SerenityRest.given().auth().oauth2(GoRestApi.STR_TOKEN)
                .delete(getData("Go Rest").concat(getData(strEndPoint).concat(strId+"")));
    }
}
