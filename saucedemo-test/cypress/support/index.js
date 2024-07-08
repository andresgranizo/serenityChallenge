import './commands';

Cypress.on('uncaught:exception', (err, runnable) => {
    if (err.message.includes('events.backtrace.io')) {
        return false;
    }
});

afterEach(() => {
    cy.clearCookies();
    cy.clearLocalStorage();
});
