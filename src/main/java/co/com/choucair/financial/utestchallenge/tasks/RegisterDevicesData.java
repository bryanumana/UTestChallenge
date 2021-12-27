package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestDevices;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class Step3 implements Task {
    public static Step3 dataDevices() {
        return Tasks.instrumented(Step3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDevices.OS),
                Click.on(UTestDevices.WINDOWS_SELECT),
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
