package co.com.choucair.financial.utestchallenge.quesitons;

import co.com.choucair.financial.utestchallenge.models.ButtonName;
import co.com.choucair.financial.utestchallenge.userinterfaces.UTestTheLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheLastStep implements Question <Boolean> {
    private ButtonName buttonName;

    public TheLastStep(ButtonName buttonName) {
        this.buttonName = buttonName;
    }

    public static TheLastStep isToObserveThe(ButtonName buttonName) {
        return new TheLastStep(buttonName);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameButtonU = Text.of(UTestTheLastStepPage.NAME_BUTTON).viewedBy(actor).asString();

        if(buttonName.getStrNameButton().equals(nameButtonU)){
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
