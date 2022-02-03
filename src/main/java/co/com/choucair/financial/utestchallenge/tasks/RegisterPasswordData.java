package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestCompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class RegisterPasswordData implements Task {

    private String strPassword;
    private String strConfirmPassword;

    public RegisterPasswordData(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static RegisterPasswordData dataPassword(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(RegisterPasswordData.class, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(strPassword).into(UTestCompletePage.PASSWORD_TEXT),
                SendKeys.of(strConfirmPassword).into(UTestCompletePage.CONFIRM_PASSWORD_TEXT),
                Click.on(UTestCompletePage.INFORMED_CHECK),
                Click.on(UTestCompletePage.TERMS_CHECK),
                Click.on(UTestCompletePage.PRIVACY_CHECK)
                //Click.on(UTestComplete.ENTER_BUTTON)
        );
    }
}
