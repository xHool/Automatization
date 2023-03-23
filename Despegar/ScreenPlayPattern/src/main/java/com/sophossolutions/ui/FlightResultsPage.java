package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlightResultsPage extends PageObject {
	public static Target btnFiltro = Target.the("Filtro Button: ").locatedBy("//tab-component[2]");
	public static Target elementValidate = Target.the("Validate Element: ").locatedBy("//tab-component[1]");
	public static Target btnClose = Target.the("Close Button: ")
			.locatedBy("//i[@class='eva-3-icon-close tooltip-close']");

	public static Target aerolineaEconomica = Target.the("Lista de aerolineas").locatedBy(
			"//div[@class='cluster-container COMMON' and descendant::span[contains(text(), '{0}')]]/div[@class='cluster-pricebox-container CLUSTER']/descendant::p[@class='item-fare fare-price']/descendant::span[@class='amount price-amount']");

	public static Target aerolineasRapidas = Target.the("Aerolineas Rapidas Lista: ").locatedBy(
			"//span[@class='sub-cluster' and descendant::span[contains(text(), '{0}')]]/descendant::span[@class='best-duration']");

	public static Target aerolineasPorEquipaje = Target.the("Aerolineas por Equipaje Lista: ").locatedBy(
			"//div[@class='cluster-container COMMON' and descendant::span[contains(text(), '{0}')] and descendant::span[@class='sub-cluster']/descendant::span[@class='{1}']]/div[@class='cluster-pricebox-container CLUSTER']/descendant::p[@class='item-fare fare-price']/descendant::span[@class='amount price-amount']");
}
