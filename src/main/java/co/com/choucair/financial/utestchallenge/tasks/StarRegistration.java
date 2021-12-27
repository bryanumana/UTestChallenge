package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class StarRegistration implements Task {

    public static StarRegistration onThePage() {
        return Tasks.instrumented(StarRegistration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestHome.JOIN_BUTTON));
    }
}
