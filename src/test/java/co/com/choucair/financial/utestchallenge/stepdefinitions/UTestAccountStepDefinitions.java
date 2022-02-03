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
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

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

                RegisterAddressData.dataAddress(
                        userDataList.get(0).getStrCity(),
                        userDataList.get(0).getStrState(),
                        userDataList.get(0).getStrZIP(),
                        userDataList.get(0).getStrCountry()
                ),

                RegisterDevicesData.dataDevices(
                        userDataList.get(0).getStrOS(),
                        userDataList.get(0).getStrVersion(),
                        userDataList.get(0).getStrLanguage(),
                        userDataList.get(0).getStrMobile(),
                        userDataList.get(0).getStrModel(),
                        userDataList.get(0).getStrOsMobile()
                ),

                RegisterPasswordData.dataPassword(
                        userDataList.get(0).getStrPassword(),
                        userDataList.get(0).getStrConfirmPassword()
                )
        );
    }

    @Then("^user sees the page called$")
    public void userSeesThePageCalled(List<ConfirmLastStep> confirmLastStepList)throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LastStep.toThe(confirmLastStepList.get(0).getStrNameButton())));
    }
}
