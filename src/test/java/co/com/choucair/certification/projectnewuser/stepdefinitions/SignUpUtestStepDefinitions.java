package co.com.choucair.certification.projectnewuser.stepdefinitions;

import co.com.choucair.certification.projectnewuser.tasks.JoinToday;
import co.com.choucair.certification.projectnewuser.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SignUpUtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than erick wants to access the web Utest site$")
    public void thanErickWantsToAccessTheWebUtestSite()  {
        OnStage.theActorCalled("Erick").wasAbleTo(OpenUp.thePage(), (JoinToday.onThePage()));

    }


    @When("^he makes the registration on the page$")
    public void heMakesTheRegistrationOnThePage()  {

    }

    @Then("^He verifies that the screen loads with text Welcome to the world's largest community of freelance software testers!$")
    public void heVerifiesThatTheScreenLoadsWithTextWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters()  {

    }

}
