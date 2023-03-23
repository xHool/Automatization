package com.sophossolutions.interactions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SearchAirlines implements Interaction {
	private Target targetlistElements;

	private String[] lstAirlines = { " Avianca Airlines ", "LATAM" };

	public SearchAirlines(Target targetlistElements) {
		this.targetlistElements = targetlistElements;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<String> lstLatam = new ArrayList<>();
		List<String> lstAvianca = new ArrayList<>();
		try {
			
			for (int i = 0; i < lstAirlines.length; i++) {
				ListOfWebElementFacades x = this.targetlistElements.of(lstAirlines[i]).resolveAllFor(actor);
				for (WebElementFacade element : x) {
					if (i == 0) {
						lstAvianca.add(element.getText());

					} else {
						lstLatam.add(element.getText());
					}

				}
				System.out.println();
			}
			System.out.println("Latam: " + Collections.min(lstLatam));
			System.out.println("Avianca: " + Collections.min(lstAvianca));
		} catch (Exception e) {
			if(lstAvianca.size() == 0) {
				System.out.println("No se encontraron vuelos disponibles de 'AVIANCA AIRLINES'.");
			}if(lstLatam.size()== 0) {
				System.out.println("No se encontraron vuelos disponibles de 'LATAM'.");
			}
		}
	}

	public static SearchAirlines search(Target target) {
		return Tasks.instrumented(SearchAirlines.class, target);
	}

}
