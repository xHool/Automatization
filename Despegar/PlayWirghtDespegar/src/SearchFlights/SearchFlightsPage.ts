import { Page } from "@playwright/test";

export class SearchFlightsPage {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }

    async SearchFlights() {

        await this.page.locator('.login-incentive--close').click();
        await this.page.waitForTimeout(2000);
        
        await this.page.getByRole('textbox', { name: 'Ingresa hacia dónde viajas' }).click();
        await this.page.getByRole('textbox', { name: 'Ingresa hacia dónde viajas' }).clear();
        await this.page.waitForTimeout(2000);

        await this.page.getByText('Cúcuta, Norte de Santander, Colombia').click();
        await this.page.waitForTimeout(2000);

        await this.page.getByRole('textbox', { name: 'Ida' }).click();
        await this.page.getByText('Bogotá, Colombia').click();
        await this.page.waitForTimeout(2000);

        await this.page.getByText('24').first().click();
        await this.page.waitForTimeout(2000);

        await this.page.getByRole('textbox', { name: 'Vuelta' }).click();
        await this.page.waitForTimeout(2000);

        await this.page.getByText('30').first().click();
        await this.page.waitForTimeout(2000);
       
        await this.page.locator('#searchbox-sbox-box-flights').getByRole('textbox').nth(4).click();
        await this.page.waitForTimeout(2000);

        await this.page.getByRole('button', { name: 'Buscar' }).click();
        await this.page.waitForTimeout(2000);
    }
}