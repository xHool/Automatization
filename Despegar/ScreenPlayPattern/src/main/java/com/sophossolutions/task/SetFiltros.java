package com.sophossolutions.task;

import com.sophossolutions.interactions.SearchAirlines;
import com.sophossolutions.ui.FlightResultsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SetFiltros implements Task {
	private Target btnFiltro;
	private Target btnClose;

	public SetFiltros(Target btnFiltro, Target btnClose) {
		super();
		this.btnFiltro = btnFiltro;
		this.btnClose = btnClose;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(this.btnClose),
				Scroll.to().,
				Click.on(this.btnFiltro),
				SearchAirlines.search(FlightResultsPage.aerolineaEconomica),
				SearchAirlines.search(FlightResultsPage.aerolineasRapidas),
				WaitUntil.the(this.btnFiltro, WebElementStateMatchers.isNotSelected()).forNoMoreThan(10).seconds()
				);
	}

	public static SetFiltros select() {
		return Tasks.instrumented(SetFiltros.class, FlightResultsPage.btnFiltro,FlightResultsPage.btnClose );
	}
}
