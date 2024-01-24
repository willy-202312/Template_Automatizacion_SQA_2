package com.amazon.StepDefinitions;

import com.amazon.task.AddProductCartTask;
import com.amazon.task.ChooseProductTask;
import com.amazon.task.ConfirmPayTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.description.type.TypeList;
import net.bytebuddy.pool.TypePool;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuyStepDefinition  {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());

    }

    @Given("the user is in the page amazon.com")
    public void the_user_is_in_the_page_amazon_com() {

        theActorCalled("User").wasAbleTo(Open.url("https://www.amazon.com/?&tag=googleuscol05-20&ref=pd_sl_7d0mn8q9wb_e&adgrpid=159179349492&hvpone=&hvptwo=&hvadid=675113331057&hvpos=&hvnetw=g&hvrand=14742458444399618328&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1003654&hvtargid=kwd-10573980&hydadcr=8635_13554489&language=es_US"));
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @When("User choose a product")
    public void user_choose_a_product() {

        OnStage.theActorInTheSpotlight().attemptsTo(ChooseProductTask.categoryBuy());
    }
    @When("Add product on the cart")
    public void add_product_on_the_cart() {

        OnStage.theActorInTheSpotlight().attemptsTo(AddProductCartTask.addProduct());
    }
    @Then("User confirm your buy")
    public void user_confirm_your_buy() {
        OnStage.theActorInTheSpotlight().attemptsTo(ConfirmPayTask.confirmBuy());
    }

}



