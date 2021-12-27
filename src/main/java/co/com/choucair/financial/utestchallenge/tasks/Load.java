package co.com.choucair.financial.utestchallenge.tasks;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Load implements Task {
    private UTestPage uTestPage;

    public static Load theWebSite() {
        return Tasks.instrumented(Load.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestPage));
    }
}
