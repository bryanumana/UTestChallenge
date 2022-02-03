package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestDevicesPage;
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
                Click.on(UTestDevicesPage.OS),
                SendKeys.of(strOSI, Keys.ENTER).into(UTestDevicesPage.OS_SELECT),

                Click.on(UTestDevicesPage.VERSION),
                SendKeys.of(strVersionI, Keys.ENTER).into(UTestDevicesPage.VERSION_SELECT),

                Click.on(UTestDevicesPage.LANGUAGE),
                SendKeys.of(strLanguageI, Keys.ENTER).into(UTestDevicesPage.LANGUAGE_SELECT),

                Click.on(UTestDevicesPage.MOBILE),
                SendKeys.of(strMobileI, Keys.ENTER).into(UTestDevicesPage.MOBILE_SELECT)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Click.on(UTestDevicesPage.MODEL),
                SendKeys.of(strModelI, Keys.ENTER).into(UTestDevicesPage.MODEL_SELECT),

                Click.on(UTestDevicesPage.OS_MOBILE),
                SendKeys.of(strOsMobileI, Keys.ENTER).into(UTestDevicesPage.OS_MOBILE_SELECT),

                Click.on(UTestDevicesPage.ENTER_BUTTON)
        );

    }
}
