package com.sophossolutions.interactions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SearchAirlinesByBaggage implements Interaction {
	private Target targetElement;
	private String[] lstBaggage = { "backpack-image baggage-icon -INCLUDED", "handbag-image baggage-icon -INCLUDED",
			"bag-image baggage-icon NOT-INCLUDED" };
	private String[] lstAirlines = { " Avianca Airlines ", "LATAM" };

	public SearchAirlinesByBaggage(Target targetElement) {
		super();
		this.targetElement = targetElement;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		for (int i = 0; i < lstAirlines.length; i++) {
			ListOfWebElementFacades x = this.targetElement.of(lstAirlines[i]).resolveAllFor(actor);
		}
	}

	public static SearchAirlinesByBaggage search(Target target) {
		return Tasks.instrumented(SearchAirlinesByBaggage.class, target);
	}

}
