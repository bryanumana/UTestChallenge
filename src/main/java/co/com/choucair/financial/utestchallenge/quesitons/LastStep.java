package co.com.choucair.financial.utestchallenge.quesitons;

import co.com.choucair.financial.utestchallenge.userinterfaces.UTestTheLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LastStep implements Question <Boolean> {
    private String nameButton;

    public LastStep(String nameButton) {
        this.nameButton = nameButton;
    }

    public static LastStep toThe(String nameButton) {
        return new LastStep(nameButton);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameButtonU = Text.of(UTestTheLastStepPage.NAME_BUTTON).viewedBy(actor).asString();

        if(nameButton.equals(nameButtonU)){
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
