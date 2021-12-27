package co.com.choucair.financial.utestchallenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UTestHome extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button to start registration")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
