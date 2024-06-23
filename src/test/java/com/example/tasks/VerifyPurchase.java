package com.example.tasks;

import com.example.ui.DemoblazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VerifyPurchase implements Task {

    public static VerifyPurchase success() {
        return new VerifyPurchase();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Ensure.that(DemoblazePage.SUCCESS_MESSAGE).isDisplayed()
        );
    }
}
