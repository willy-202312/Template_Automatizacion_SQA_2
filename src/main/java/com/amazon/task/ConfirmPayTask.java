package com.amazon.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.amazon.ui.AmazonUi.CONFIRM_BUY;

public class ConfirmPayTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CONFIRM_BUY)
        );
    }

    public static Performable confirmBuy() {

        return Instrumented.instanceOf(ConfirmPayTask.class).withProperties();
    }
}
