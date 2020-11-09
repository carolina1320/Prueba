package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenwhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());}

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonwantsTolearnAutomationAtTheAcademyChoucair()  {
      OnStage.theActorCalled( requiredActor. "Brandon").wasAbleTo(OpenUp.thePage(), Login.OnThePage()));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorlnTheSpotlight().attemptsTo(Search.the(Course));

}
    @Then("^he finds the course called resources  (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(String question) {
        OnStage.theActorlnTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));


    }
}




