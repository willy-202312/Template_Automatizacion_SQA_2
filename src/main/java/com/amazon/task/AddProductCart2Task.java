package com.amazon.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.amazon.ui.AmazonUi.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AddProductCart2Task implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(BACK_CATALOG, isClickable());
        actor.attemptsTo(
                Click.on(BACK_CATALOG) ,
                Click.on(BTN_CATEGOR3),
                Click.on(BTN_CATEGOR4),
                Click.on(BTN_PRODUCT2) ,
                Click.on(ADD_PRODUCTCART2)
        );
    }


    public static Performable addProduct2(){

        return Instrumented.instanceOf(AddProductCart2Task.class).withProperties();
    }
}
