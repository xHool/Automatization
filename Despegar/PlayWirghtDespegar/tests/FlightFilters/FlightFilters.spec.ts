import { test } from '@playwright/test';
import { FlightResultsPage } from '../../src/FlightFilters/FlightResultsPage';
import { SearchFlightsPage } from '../../src/SearchFlights/SearchFlightsPage';

test.beforeEach(async ({ page }) => {
    await page.goto('https://www.despegar.com.co/vuelos/');
    const searchFlightsPage = new SearchFlightsPage(page);
    await searchFlightsPage.SearchFlights();
});

test(`
Given Estoy en los resultados de la busqueda.
when Observo los vuelos.
then Selecciono el vuelo.
`, async ({ page }) => {
    const flightResultsPage = new FlightResultsPage(page);
    flightResultsPage.FlightResults();
});