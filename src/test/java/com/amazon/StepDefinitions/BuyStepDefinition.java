package com.amazon.StepDefinitions;

import com.amazon.task.AddProductCart2Task;
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

        theActorCalled("User").wasAbleTo(Open.url("https://www.amazon.comY"));
        try {
            Thread.sleep(10000);
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

    @When("Add product two on the cart")
    public void add_product_two_on_the_cart() {

        OnStage.theActorInTheSpotlight().attemptsTo(AddProductCart2Task.addProduct2());
    }
    @Then("User confirm your buy")
    public void user_confirm_your_buy() {
        OnStage.theActorInTheSpotlight().attemptsTo(ConfirmPayTask.confirmBuy());
    }

}



