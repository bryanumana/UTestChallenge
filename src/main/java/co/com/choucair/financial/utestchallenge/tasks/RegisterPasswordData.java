package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestComplete;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class RegisterPasswordData implements Task {
    public static RegisterPasswordData dataPassword() {
        return Tasks.instrumented(RegisterPasswordData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Choucair2021*").into(UTestComplete.PASSWORD_TEXT),
                SendKeys.of("Choucair2021*").into(UTestComplete.CONFIRM_PASSWORD_TEXT),
                Click.on(UTestComplete.TERMS_CHECK),
                Click.on(UTestComplete.PRIVACY_CHECK)
                //Click.on(UTestComplete.ENTER_BUTTON)
        );
    }
}
