package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestAddress;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class RegisterAddressData implements Task {
    private String strCity;
    private static String strStateI;
    private String strZIP;
    private static String strCountryI;

    public static String getStrStateI() { return strStateI; }
    public void setStrStateI(String strStateI) { RegisterAddressData.strStateI = strStateI; }

    public static String getStrCountryI() { return strCountryI; }
    public void setStrCountryI(String strCountryI) { RegisterAddressData.strCountryI = strCountryI; }

    public RegisterAddressData(String strCity, String strState, String strZIP, String strCountry) {
        this.strCity = strCity;
        RegisterAddressData.strStateI = strState;
        this.strZIP = strZIP;
        RegisterAddressData.strCountryI = strCountry;
    }

    public static RegisterAddressData dataAddress(String strCity, String strState, String strZIP, String strCountry) {
        return Tasks.instrumented(RegisterAddressData.class, strCity, strState, strZIP, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                DoubleClick.on(UTestAddress.CITY_TEXT),
                SendKeys.of(strCity).into(UTestAddress.CITY_TEXT),
                SendKeys.of(Keys.ARROW_DOWN).into(UTestAddress.CITY_TEXT),
                SendKeys.of(Keys.ENTER).into(UTestAddress.CITY_TEXT),

                DoubleClick.on(UTestAddress.ZC_TEXT),
                SendKeys.of(strZIP).into(UTestAddress.ZC_TEXT),

                Click.on(UTestAddress.COUNTRY),
                Click.on(UTestAddress.COUNTRY_SELECT),

                Click.on(UTestAddress.STATE),
                Click.on(UTestAddress.STATE_SELECT),

                Click.on(UTestAddress.ENTER_BUTTON)
        );
    }
}
