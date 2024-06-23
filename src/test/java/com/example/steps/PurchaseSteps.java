package com.example.steps;

import com.example.tasks.AddProductToCart;
import com.example.ui.DemoblazePage;
import com.example.tasks.FillOrderForm;
import com.example.tasks.VerifyPurchase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.example.tasks.NavigateTo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PurchaseSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("User is on the Demoblaze homepage")
    public void userIsOnTheDemoblazeHomepage() {
        OnStage.theActorCalled("John").attemptsTo(
            net.serenitybdd.screenplay.actions.Open.url("https://www.demoblaze.com")
        );
    }

    @When("User adds {string} to the cart")
    public void userAddsToTheCart(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            AddProductToCart.withName(productName)
        );
    }

    @When("User views the cart")
    public void userViewsTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            NavigateTo.theUrl("https://www.demoblaze.com/cart.html")
        );
    }

    @When("User completes the order form")
    public void userCompletesTheOrderForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            FillOrderForm.withData("FirstName", "LastName", "email@example.com", "1234567890", "Company", "Address", "City", "12345", "Country", "Region")
        );
    }

    @Then("User verifies the purchase")
    public void userVerifiesThePurchase() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            VerifyPurchase.success()
        );
    }
}
