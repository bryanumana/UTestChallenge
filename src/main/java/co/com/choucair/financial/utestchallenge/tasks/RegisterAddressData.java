package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class RegisterAddressData implements Task {
    public static RegisterAddressData dataAddress() {
        return Tasks.instrumented(RegisterAddressData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DoubleClick.on(UTestAddress.CITY_TEXT),
                SendKeys.of("Barcelona").into(UTestAddress.CITY_TEXT),
                SendKeys.of(Keys.ARROW_DOWN).into(UTestAddress.CITY_TEXT),
                SendKeys.of(Keys.ENTER).into(UTestAddress.CITY_TEXT),
                DoubleClick.on(UTestAddress.ZC_TEXT),
                SendKeys.of("120").into(UTestAddress.ZC_TEXT),
                Click.on(UTestAddress.COUNTRY),
                Click.on(UTestAddress.COUNTRY_SELECT),
                Click.on(UTestAddress.ENTER_BUTTON)
                );
    }
}
