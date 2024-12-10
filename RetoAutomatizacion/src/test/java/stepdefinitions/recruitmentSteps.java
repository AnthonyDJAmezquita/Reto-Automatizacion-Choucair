package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.verifyRecruitment;
import tasks.recruitmentTaskFill;
import tasks.recruitmentTaskMenu;
import tasks.recruitmentTaskVerified;

public class recruitmentSteps {

    @Given("the fields and the candidates information")
    public void the_fields_and_the_candidates_information() {
        OnStage.theActorInTheSpotlight().attemptsTo(recruitmentTaskMenu.recruitmentAttempt());
    }

    @When("we fill the fields")
    public void we_fill_the_fields() {
        OnStage.theActorInTheSpotlight().attemptsTo(recruitmentTaskFill.recruitmentAttempt());
    }

    @Then("information was saved and verified")
    public void information_was_saved() {
        OnStage.theActorInTheSpotlight().attemptsTo(recruitmentTaskVerified.recruitmentAttempt());

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                verifyRecruitment.withValues(
                        "Payroll Administrator",
                        "Oscar Andres Roa",
                        "Application Initiated"
                ),
                Matchers.equalTo(true)
        ));
    }
}
