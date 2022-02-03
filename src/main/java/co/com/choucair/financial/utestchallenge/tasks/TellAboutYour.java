package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.models.UserData;
import co.com.choucair.financial.utestchallenge.userinterfaces.UTestPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;

public class TellAboutYour implements Task {

    private UserData userData;

    public TellAboutYour(UserData userData) {
        this.userData = userData;
    }

    public static TellAboutYour dataPersonal(UserData userData) {
        return Tasks.instrumented(TellAboutYour.class, userData);
    }

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(userData.getStrName()).into(UTestPersonalPage.FIRST_NAME_TEXT),
                SendKeys.of(userData.getStrLastName()).into(UTestPersonalPage.LAST_NAME_TEXT),
                SendKeys.of(userData.getStrEmail()).into(UTestPersonalPage.EMAIL_TEXT),

                SelectFromOptions.byVisibleText(userData.getStrMonth()).from(UTestPersonalPage.MONTH_SELECT),
                SelectFromOptions.byVisibleText(userData.getStrDay()).from(UTestPersonalPage.DAY_SELECT),
                SelectFromOptions.byVisibleText(userData.getStrYear()).from(UTestPersonalPage.YEAR_SELECT),

                Click.on(UTestPersonalPage.ENTER_BUTTON)
                );
    }
}
