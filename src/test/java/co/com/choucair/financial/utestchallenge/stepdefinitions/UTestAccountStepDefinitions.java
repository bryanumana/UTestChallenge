package co.com.choucair.financial.utestchallenge.stepdefinitions;

import co.com.choucair.financial.utestchallenge.quesitons.LastStep;
import co.com.choucair.financial.utestchallenge.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UTestAccountStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user enters the UTest platform$")
    public void userEntersTheUTestPlatform() {
        OnStage.theActorCalled("GLOBAL").wasAbleTo(LoadThePage.theWebSite(), StarRegistration.onThePage());
    }

    @When("^user registers their data and their devices by completing the text boxes$")
    public void userRegistersTheirDataAndTheirDevicesByCompletingTheTextBoxes() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegisterPersonalData.dataPersonal(),
                RegisterAddressData.dataAddress(),
                RegisterDevicesData.dataDevices(),
                RegisterPasswordData.dataPassword()
        );
    }

    @Then("^user sees the button called (.*)$")
    public void userSeesTheButtonCalledCompleteSetup(String nameButton) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LastStep.toThe(nameButton)));
    }
}
