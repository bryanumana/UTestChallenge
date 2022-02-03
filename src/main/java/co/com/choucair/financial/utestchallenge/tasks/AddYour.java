package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.models.UserData;
import co.com.choucair.financial.utestchallenge.userinterfaces.UTestAddressPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class AddYour implements Task {
    private UserData userData;

    public AddYour(UserData userData) {
        this.userData = userData;
    }

    public static AddYour dataAddress(UserData userData) {
        return Tasks.instrumented(AddYour.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DoubleClick.on(UTestAddressPage.CITY_TEXT),
                SendKeys.of(userData.getStrCity()).into(UTestAddressPage.CITY_TEXT),
                SendKeys.of(Keys.ARROW_DOWN, Keys.ENTER).into(UTestAddressPage.CITY_TEXT),
                SendKeys.of(Keys.ENTER).into(UTestAddressPage.CITY_TEXT),

                DoubleClick.on(UTestAddressPage.ZC_TEXT),
                SendKeys.of(userData.getStrZIP()).into(UTestAddressPage.ZC_TEXT),

                Click.on(UTestAddressPage.COUNTRY),
                SendKeys.of(userData.getStrCountry(), Keys.ENTER).into(UTestAddressPage.COUNTRY_SELECT),

                Click.on(UTestAddressPage.STATE),
                SendKeys.of(userData.getStrState(), Keys.ENTER).into(UTestAddressPage.STATE_SELECT),

                Click.on(UTestAddressPage.ENTER_BUTTON)
        );
    }
}
