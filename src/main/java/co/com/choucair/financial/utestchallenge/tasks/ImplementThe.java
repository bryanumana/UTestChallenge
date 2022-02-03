package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.models.UserData;
import co.com.choucair.financial.utestchallenge.userinterfaces.UTestTheLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class ImplementThe implements Task {

    private UserData userData;

    public ImplementThe(UserData userData) {
        this.userData = userData;
    }

    public static ImplementThe dataPassword(UserData userData) {
        return Tasks.instrumented(ImplementThe.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(userData.getStrPassword()).into(UTestTheLastStepPage.PASSWORD_TEXT),
                SendKeys.of(userData.getStrConfirmPassword()).into(UTestTheLastStepPage.CONFIRM_PASSWORD_TEXT),
                Click.on(UTestTheLastStepPage.INFORMED_CHECK),
                Click.on(UTestTheLastStepPage.TERMS_CHECK),
                Click.on(UTestTheLastStepPage.PRIVACY_CHECK)
                //Click.on(UTestComplete.ENTER_BUTTON)
        );
    }
}
