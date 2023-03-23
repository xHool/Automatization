package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchFlightsPage extends PageObject {
	public static Target origenText = Target.the("Origen Text: ").locatedBy(
			"//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::input[@placeholder='Ingresa desde dónde viajas']");
	
	public static Target select = Target.the("Origen Select Options: ").locatedBy(
			"//span[@class='item-text']");
	
	public static Target destinoText = Target.the("Destino Text: ").locatedBy(
			"//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::input[@placeholder='Ingresa hacia dónde viajas']");

	public static Target targetFechaIda = Target.the("Fecha Ida Target: ").locatedBy(
			"//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::input[@placeholder='Ida']");
	
	public static Target textFechaIda = Target.the("Fecha Ida Text: ").locatedBy(
			"//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']/descendant::div[@data-month = '2023-03']//div[contains(text(), '{0}')]");
	
	public static Target targetFechaVuelta = Target.the("Fecha Vuelta Target: ").locatedBy(
			"//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::input[@placeholder='Vuelta']");
	
	public static Target textFechaVuelta = Target.the("Fecha Vuelta Text: ").locatedBy(
			"//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']/descendant::div[@data-month = '2023-03']//div[contains(text(), '{0}')]");
	
	public static Target targetPasajeros = Target.the("Pasajeros Target: ").locatedBy(
			"//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::label[contains(text(), 'Pasajeros y Clase')]");
	
	public static Target btnPasajeros = Target.the("Pasajeros Button: ").locatedBy(
			"//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//button[@class='steppers-icon-right stepper__icon'][1]");
	
	public static Target btnBuscar = Target.the("Buscar Button: ").locatedBy(
			"//button[@class= 'sbox5-box-button-ovr--3LK5x sbox5-3-btn sbox5-button -secondary -icon -lg']");
}
