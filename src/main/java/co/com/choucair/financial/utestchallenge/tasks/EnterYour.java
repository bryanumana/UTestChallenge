package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.models.UserData;
import co.com.choucair.financial.utestchallenge.userinterfaces.UTestDevicesPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class EnterYour implements Task {
    private UserData userData;

    public EnterYour(UserData userData) {
        this.userData = userData;
    }

    public static EnterYour dataDevices(UserData userData) {
        return Tasks.instrumented(EnterYour.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDevicesPage.OS),
                SendKeys.of(userData.getStrOS(), Keys.ENTER).into(UTestDevicesPage.OS_SELECT),

                Click.on(UTestDevicesPage.VERSION),
                SendKeys.of(userData.getStrVersion(), Keys.ENTER).into(UTestDevicesPage.VERSION_SELECT),

                Click.on(UTestDevicesPage.LANGUAGE),
                SendKeys.of(userData.getStrLanguage(), Keys.ENTER).into(UTestDevicesPage.LANGUAGE_SELECT),

                Click.on(UTestDevicesPage.MOBILE),
                SendKeys.of(userData.getStrMobile(), Keys.ENTER).into(UTestDevicesPage.MOBILE_SELECT),

                Click.on(UTestDevicesPage.MODEL),
                SendKeys.of(userData.getStrModel(), Keys.ENTER).into(UTestDevicesPage.MODEL_SELECT),

                Click.on(UTestDevicesPage.OS_MOBILE),
                SendKeys.of(userData.getStrOsMobile(), Keys.ENTER).into(UTestDevicesPage.OS_MOBILE_SELECT),

                Click.on(UTestDevicesPage.ENTER_BUTTON)
        );

    }
}
