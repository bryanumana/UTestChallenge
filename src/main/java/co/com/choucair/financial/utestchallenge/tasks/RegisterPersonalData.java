package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class RegisterPersonalData implements Task {
    public static RegisterPersonalData dataPersonal() {
        return Tasks.instrumented(RegisterPersonalData.class);
    }

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Bryan").into(UTestPersonal.FIRST_NAME_TEXT),
                SendKeys.of("Uma\u00f1a G\u00f3mez").into(UTestPersonal.LAST_NAME_TEXT),
                SendKeys.of("bumanag@correo.udistrital.edu.com").into(UTestPersonal.EMAIL_TEXT),
                SendKeys.of("December").into(UTestPersonal.MONTH_SELECT),
                SendKeys.of("20").into(UTestPersonal.DAY_SELECT),
                SendKeys.of("1998").into(UTestPersonal.YEAR_SELECT),
                Click.on(UTestPersonal.ENTER_BUTTON)
                );
    }
}
