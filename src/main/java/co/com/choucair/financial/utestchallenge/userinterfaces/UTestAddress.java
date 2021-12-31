package co.com.choucair.financial.utestchallenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UTestAddress extends PageObject {
    public static final Target CITY_TEXT = Target.the("when you write the city in which you live")
            .located(By.id("city"));
    public static final Target ZC_TEXT = Target.the("when you write the zip code of the city")
            .located(By.id("zip"));

    public static final Target OS = Target.the("select your computer's operating system")
            .locatedBy("//span[@class=\"btn btn-default form-control ui-select-toggle\"]");
    public static final Target WINDOWS_SELECT = Target.the("the operating system is Windows")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");

    public static final Target ENTER_BUTTON = Target.the("button to go to the next step")
            .locatedBy("//a[@class=\"btn btn-blue pull-right\"]");
}
