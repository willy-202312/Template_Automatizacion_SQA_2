package com.amazon.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.amazon.ui.AmazonUi.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AddProductCartTask implements Task {

//Metodo para agregar productos al carrito
    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(BTN_PRODUCT, isClickable());
        Scroll.to(BTN_PRODUCT);
        actor.attemptsTo(
                Click.on(BTN_PRODUCT),
                Click.on(ADD_PRODUCTCART)
                );

    }

    public static Performable addProduct() {

        return Instrumented.instanceOf(AddProductCartTask.class).withProperties();
    }
}
