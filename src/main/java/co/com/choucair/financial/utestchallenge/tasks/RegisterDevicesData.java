package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestDevices;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegisterDevicesData implements Task {
    private static String strOSI;
    private static String strVersionI;
    private static String strLanguageI;
    private static String strMobileI;
    private static String strModelI;
    private static String strOsMobileI;

    public static String getStrOSI() {
        return strOSI;
    }
    public static void setStrOSI(String strOSI) { RegisterDevicesData.strOSI = strOSI; }

    public static String getStrVersionI() { return strVersionI; }
    public static void setStrVersionI(String strVersionI) { RegisterDevicesData.strVersionI = strVersionI; }

    public static String getStrLanguageI() { return strLanguageI; }
    public static void setStrLanguageI(String strLanguageI) { RegisterDevicesData.strLanguageI = strLanguageI; }

    public static String getStrMobileI() { return strMobileI; }
    public static void setStrMobileI(String strMobileI) { RegisterDevicesData.strMobileI = strMobileI; }

    public static String getStrModelI() { return strModelI; }
    public static void setStrModelI(String strModelI) { RegisterDevicesData.strModelI = strModelI; }

    public static String getStrOsMobileI() { return strOsMobileI; }
    public static void setStrOsMobileI(String strOsMobileI) { RegisterDevicesData.strOsMobileI = strOsMobileI; }

    public RegisterDevicesData(String strOS, String strVersion, String strLanguage, String strMobile, String strModel, String strOsMobile) {
        RegisterDevicesData.strOSI = strOS;
        RegisterDevicesData.strVersionI  = strVersion;
        RegisterDevicesData.strLanguageI = strLanguage;
        RegisterDevicesData.strMobileI = strMobile;
        RegisterDevicesData.strModelI = strModel;
        RegisterDevicesData.strOsMobileI = strOsMobile;
    }

    public static RegisterDevicesData dataDevices(String strOS, String strVersion, String strLanguage, String strMobile, String strModel, String strOsMobile) {
        return Tasks.instrumented(RegisterDevicesData.class, strOS, strVersion, strLanguage, strMobile, strModel, strOsMobile);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDevices.OS),
                Click.on(UTestDevices.OS_SELECT),

                Click.on(UTestDevices.VERSION),
                Click.on(UTestDevices.VERSION_SELECT),

                Click.on(UTestDevices.LANGUAGE),
                Click.on(UTestDevices.LANGUAGE_SELECT),

                Click.on(UTestDevices.MOBILE),
                Click.on(UTestDevices.MOBILE_SELECT)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Click.on(UTestDevices.MODEL),
                Click.on(UTestDevices.MODEL_SELECT),

                Click.on(UTestDevices.OS_MOBILE),
                Click.on(UTestDevices.OS_MOBILE_SELECT),

                Click.on(UTestDevices.ENTER_BUTTON)
        );

    }
}
