package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestDevices;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class RegisterDevicesData implements Task {
    private String strOSI;
    private String strVersionI;
    private String strLanguageI;
    private String strMobileI;
    private String strModelI;
    private String strOsMobileI;

    public RegisterDevicesData(String strOS, String strVersion, String strLanguage, String strMobile, String strModel, String strOsMobile) {
        this.strOSI = strOS;
        this.strVersionI  = strVersion;
        this.strLanguageI = strLanguage;
        this.strMobileI = strMobile;
        this.strModelI = strModel;
        this.strOsMobileI = strOsMobile;
    }

    public static RegisterDevicesData dataDevices(String strOS, String strVersion, String strLanguage, String strMobile, String strModel, String strOsMobile) {
        return Tasks.instrumented(RegisterDevicesData.class, strOS, strVersion, strLanguage, strMobile, strModel, strOsMobile);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDevices.OS),
                SendKeys.of(strOSI, Keys.ENTER).into(UTestDevices.OS_SELECT),

                Click.on(UTestDevices.VERSION),
                SendKeys.of(strVersionI, Keys.ENTER).into(UTestDevices.VERSION_SELECT),

                Click.on(UTestDevices.LANGUAGE),
                SendKeys.of(strLanguageI, Keys.ENTER).into(UTestDevices.LANGUAGE_SELECT),

                Click.on(UTestDevices.MOBILE),
                SendKeys.of(strMobileI, Keys.ENTER).into(UTestDevices.MOBILE_SELECT)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Click.on(UTestDevices.MODEL),
                SendKeys.of(strModelI, Keys.ENTER).into(UTestDevices.MODEL_SELECT),

                Click.on(UTestDevices.OS_MOBILE),
                SendKeys.of(strOsMobileI, Keys.ENTER).into(UTestDevices.OS_MOBILE_SELECT),

                Click.on(UTestDevices.ENTER_BUTTON)
        );

    }
}
