package co.com.choucair.financial.utestchallenge.userinterfaces;

import co.com.choucair.financial.utestchallenge.tasks.RegisterAddressData;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UTestAddress extends PageObject {
    private static String strStateSelect = RegisterAddressData.getStrStateI();
    private static String strCountrySelect = RegisterAddressData.getStrCountryI();

    public static final Target CITY_TEXT = Target.the("when you write the city in which you live")
            .located(By.id("city"));
    public static final Target ZC_TEXT = Target.the("when you write the zip code of the city")
            .located(By.id("zip"));

    public static final Target STATE = Target.the("select your computer's operating system")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");
    public static final Target STATE_SELECT = Target.the("the operating system is Windows")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strStateSelect + "\")]");
    public static final Target COUNTRY = Target.the("select your computer's operating system")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    public static final Target COUNTRY_SELECT = Target.the("the operating system is Windows")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strCountrySelect + "\")]");


    public static final Target ENTER_BUTTON = Target.the("button to go to the next step")
            .locatedBy("//a[@class=\"btn btn-blue pull-right\"]");
}
