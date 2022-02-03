package co.com.choucair.financial.utestchallenge.stepdefinitions;

import co.com.choucair.financial.utestchallenge.models.ButtonName;
import co.com.choucair.financial.utestchallenge.models.UserData;
import co.com.choucair.financial.utestchallenge.quesitons.TheLastStep;
import co.com.choucair.financial.utestchallenge.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UTestAccountStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^user enters the UTest platform$")
    public void userEntersTheUTestPlatform(){
        theActorCalled("Alberto").wasAbleTo(Load.theWebSite());
    }

    @When("^user registers their data and their devices$")
    public void userRegistersTheirDataAndTheirDevices(List <UserData> userDataList) throws Exception{
        theActorInTheSpotlight().attemptsTo(
                StarRegistration.onThePage(),
                TellAboutYour.dataPersonal(userDataList.get(0)),
                AddYour.dataAddress(userDataList.get(0)),
                EnterYour.dataDevices(userDataList.get(0)),
                ImplementThe.dataPassword(userDataList.get(0))
        );
    }

    @Then("^user sees the button called$")
    public void userSeesTheButtonCalled(List<ButtonName> buttonName)throws Exception {
        theActorInTheSpotlight().should(seeThat(TheLastStep.isToObserveThe(buttonName.get(0))));
    }
}
