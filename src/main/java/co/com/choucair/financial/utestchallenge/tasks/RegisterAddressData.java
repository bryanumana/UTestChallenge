package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class RegisterAddressData implements Task {
    public static RegisterAddressData dataAddress() {
        return Tasks.instrumented(RegisterAddressData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("").into(UTestAddress.CITY_TEXT),
                SendKeys.of("").into(UTestAddress.ZC_TEXT),
                Click.on(UTestAddress.ENTER_BUTTON)
                );
    }
}
