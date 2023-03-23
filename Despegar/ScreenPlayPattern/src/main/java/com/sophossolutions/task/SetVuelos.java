package com.sophossolutions.task;

import java.util.Map;

import com.sophossolutions.interactions.PressButton;
import com.sophossolutions.ui.SearchFlightsPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SetVuelos implements Task {

	private Target targetOrigen;
	private Target select;
	private Target targetDestino;
	private Target targetFechaIda;
	private Target targetFechaSeleccionadaIda;
	private Target targetFechaVuelta;
	private Target targetFechaSeleccionadaVuelta;
	private Target targetPasajeros;
	private Target btnPasajeros;
	private Target btnBuscar;

	private String strOrigen;
	private String strDestino;
	private String strFechaIda;
	private String strFechaVuelta;
	private int intPasajeros;

	public SetVuelos(String strOrigen, String strDestino, String strFechaIda, String strFechaVuelta, int intPasajeros,
			Target targetOrigen, Target select, Target targetDestino, Target targetFechaIda,
			Target targetFechaSeleccionadaIda, Target targetFechaVuelta, Target targetFechaSeleccionadaVuelta,
			Target targetPasajeros, Target btnPasajeros, Target btnBuscar) {

		this.targetOrigen = targetOrigen;
		this.select = select;
		this.targetDestino = targetDestino;
		this.targetFechaIda = targetFechaIda;
		this.targetFechaSeleccionadaIda = targetFechaSeleccionadaIda;
		this.targetFechaVuelta = targetFechaVuelta;
		this.targetFechaSeleccionadaVuelta = targetFechaSeleccionadaVuelta;
		this.targetPasajeros = targetPasajeros;
		this.btnPasajeros = btnPasajeros;
		this.btnBuscar = btnBuscar;

		this.strOrigen = strOrigen;
		this.strDestino = strDestino;
		this.strFechaIda = strFechaIda;
		this.strFechaVuelta = strFechaVuelta;
		this.intPasajeros = intPasajeros;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(this.targetOrigen), Enter.theValue(this.strOrigen).into(this.targetOrigen),
				Click.on(this.select),
				Click.on(this.targetDestino), Enter.theValue(this.strDestino).into(this.targetDestino),
				Click.on(this.select),
				Click.on(this.targetFechaIda),
				Click.on(this.targetFechaSeleccionadaIda.of(strFechaIda)), Click.on(this.targetFechaVuelta),
				Click.on(this.targetFechaSeleccionadaVuelta.of(strFechaVuelta)), Click.on(this.targetPasajeros),
				PressButton.press(this.intPasajeros, this.btnPasajeros), Click.on(this.btnBuscar));

	}

	public static SetVuelos formBuscarVuelos(DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		return Tasks.instrumented(SetVuelos.class, data.get("Origen"), data.get("Destino"), data.get("DiaIda"),
				data.get("DiaVuelta"), Integer.parseInt(data.get("Pasajeros")), SearchFlightsPage.origenText,
				SearchFlightsPage.select, SearchFlightsPage.destinoText, SearchFlightsPage.targetFechaIda,
				SearchFlightsPage.textFechaIda, SearchFlightsPage.targetFechaVuelta, SearchFlightsPage.textFechaVuelta,
				SearchFlightsPage.targetPasajeros, SearchFlightsPage.btnPasajeros, SearchFlightsPage.btnBuscar);
	}

}
