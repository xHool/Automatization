import { test } from '@playwright/test';
import { SearchFlightsPage } from '../../src/SearchFlights/SearchFlightsPage';

test.beforeEach(async ({ page }) => {
    await page.goto('https://www.despegar.com.co/vuelos/');
});

test(`
Given Necesito buscar un vuelo.
when Lleno los campos
then Visualizo todos los vuelos disponibles.
`, async ({ page }) => {
    const searchFlightsPage = new SearchFlightsPage(page);
    await searchFlightsPage.SearchFlights();
});