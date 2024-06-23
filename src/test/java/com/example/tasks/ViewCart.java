package com.example.tasks;

import com.example.ui.DemoblazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ViewCart implements Task {

    public static ViewCart open() {
        return new ViewCart();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(DemoblazePage.CART_BUTTON)
        );
    }
}
