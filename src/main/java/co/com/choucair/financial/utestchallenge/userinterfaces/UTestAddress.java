package co.com.choucair.financial.utestchallenge.userinterfaces;

import co.com.choucair.financial.utestchallenge.tasks.RegisterAddressData;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UTestAddress extends PageObject {

    public static final Target CITY_TEXT = Target.the("when you write the city in which you live")
            .located(By.id("city"));
    public static final Target ZC_TEXT = Target.the("when you write the zip code of the city")
            .located(By.id("zip"));

    public static final Target STATE = Target.the("when you select the state in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");
    public static final Target STATE_SELECT = Target.the("select your country")
            .locatedBy("//input[@type=\"search\"]");
    public static final Target COUNTRY = Target.the("when you select the country in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    public static final Target COUNTRY_SELECT = Target.the("select your country")
            .locatedBy("(//input[@type=\"search\"])[2]");

    public static final Target ENTER_BUTTON = Target.the("button to go to the next step")
            .locatedBy("//a[@class=\"btn btn-blue pull-right\"]");
}
