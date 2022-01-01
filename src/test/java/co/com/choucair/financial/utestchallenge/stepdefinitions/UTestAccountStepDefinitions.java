package co.com.choucair.financial.utestchallenge.stepdefinitions;

import co.com.choucair.financial.utestchallenge.models.ConfirmLastStep;
import co.com.choucair.financial.utestchallenge.models.UserData;
import co.com.choucair.financial.utestchallenge.quesitons.LastStep;
import co.com.choucair.financial.utestchallenge.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UTestAccountStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user enters the UTest platform$")
    public void userEntersTheUTestPlatform(){
        OnStage.theActorCalled("Carlos").wasAbleTo(LoadThePage.theWebSite(), StarRegistration.onThePage());
    }

    @When("^user registers their data and their devices by completing the text boxes$")
    public void userRegistersTheirDataAndTheirDevicesByCompletingTheTextBoxes(List <UserData> userDataList) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegisterPersonalData.dataPersonal(
                        userDataList.get(0).getStrLastName(),
                        userDataList.get(0).getStrName(),
                        userDataList.get(0).getStrEmail(),
                        userDataList.get(0).getStrMonth(),
                        userDataList.get(0).getStrDay(),
                        userDataList.get(0).getStrYear()
                ),

                RegisterAddressData.dataAddress(),

                RegisterDevicesData.dataDevices(
                        userDataList.get(0).getStrOS()
                ),
                RegisterPasswordData.dataPassword(
                        userDataList.get(0).getStrPassword(),
                        userDataList.get(0).getStrConfirmPassword()
                )
        );
    }

    @Then("^user sees the button called$")
    public void userSeesTheButtonCalledCompleteSetup(List<ConfirmLastStep> confirmLastStepList)throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LastStep.toThe(confirmLastStepList.get(0).getStrNameButton())));
    }
}
