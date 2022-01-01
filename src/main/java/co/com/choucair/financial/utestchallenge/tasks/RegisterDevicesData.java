package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestDevices;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegisterDevicesData implements Task {
    private static String strOSI;

    public RegisterDevicesData(String strOS) {
        RegisterDevicesData.strOSI = strOS;
    }

    public static String getStrOSI() {
        return strOSI;
    }

    public static void setStrOSI(String strOSI) {
        RegisterDevicesData.strOSI = strOSI;
    }

    public static RegisterDevicesData dataDevices(String strOS) {
        return Tasks.instrumented(RegisterDevicesData.class, strOS);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDevices.OS),
                Click.on(UTestDevices.OS_SELECT),
                Click.on(UTestDevices.VERSION),
                Click.on(UTestDevices.SEVEN_SELECT),
                Click.on(UTestDevices.LANGUAGE),
                Click.on(UTestDevices.SPANISH_SELECT),
                Click.on(UTestDevices.MOBILE),
                Click.on(UTestDevices.MOTOROLA_SELECT),
                Click.on(UTestDevices.MODEL),
                Click.on(UTestDevices.E5_SELECT),
                Click.on(UTestDevices.OS_MOBILE),
                Click.on(UTestDevices.ANDROID8_SELECT),
                Click.on(UTestDevices.ENTER_BUTTON)
        );

    }
}
