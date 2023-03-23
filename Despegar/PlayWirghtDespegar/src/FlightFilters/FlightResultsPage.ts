import { Page } from "@playwright/test";

export class FlightResultsPage {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }

    async FlightResults() {
        await this.page.getByText('RecomendadosDesde $ 395.840').click();
        await this.page.waitForTimeout(2000);

        await this.page.getByText('Vuelos baratosDesde $ 395.840').click();
        await this.page.waitForTimeout(2000);

        await this.page.getByText('Vuelos rápidosDesde $ 612.584').click();
        await this.page.waitForTimeout(2000);
    }

}