package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestDevices;
import co.com.choucair.financial.utestchallenge.userinterfaces.UTestPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;

public class RegisterPersonalData implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;


    public RegisterPersonalData(String strLastName,String strName, String strEmail, String strMonth, String strDay, String strYear) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }

    public static RegisterPersonalData dataPersonal(String strLastName, String strName, String strEmail, String strMonth, String strDay, String strYear) {
        return Tasks.instrumented(RegisterPersonalData.class, strLastName, strName, strEmail, strMonth, strDay, strYear);
    }

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(strName).into(UTestPersonal.FIRST_NAME_TEXT),
                SendKeys.of(strLastName).into(UTestPersonal.LAST_NAME_TEXT),
                SendKeys.of(strEmail).into(UTestPersonal.EMAIL_TEXT),
                SelectFromOptions.byVisibleText(strMonth).from(UTestPersonal.MONTH_SELECT),
                SelectFromOptions.byVisibleText(strDay).from(UTestPersonal.DAY_SELECT),
                SelectFromOptions.byVisibleText(strYear).from(UTestPersonal.YEAR_SELECT),
                Click.on(UTestPersonal.ENTER_BUTTON)
                );
    }
}
