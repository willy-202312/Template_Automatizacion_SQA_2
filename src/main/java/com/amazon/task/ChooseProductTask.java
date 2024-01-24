package com.amazon.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.amazon.ui.AmazonUi.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class ChooseProductTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
                WaitUntil.the(BTN_CATEGORY, isClickable());
                actor.attemptsTo(
                Click.on(BTN_CATEGORY)
                );
                WaitUntil.the(BTN_CATEGORY2, isClickable());
                actor.attemptsTo(
                Click.on(BTN_CATEGORY2)
        );


    }

    public static Performable categoryBuy() {

        return Instrumented.instanceOf(ChooseProductTask.class).withProperties();
    }
}
