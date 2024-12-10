package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.verifyLogin;
import tasks.loginTask;
import tasks.openBrowserTask;

public class loginSteps {

    @Given("the link to the Orangehrm website")
    public void the_link_to_the_orangehrm_website() {
        OnStage.theActorInTheSpotlight().wasAbleTo(openBrowserTask.urlApp());
    }

    @When("I enter my login details")
    public void i_enter_my_login_details() {
        OnStage.theActorInTheSpotlight().attemptsTo(loginTask.loginAttempt());
    }

    @Then("I access the homepage")
    public void i_access_the_homepage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(verifyLogin.verifyLogin(), Matchers.equalTo("Dashboard")));
    }
}
