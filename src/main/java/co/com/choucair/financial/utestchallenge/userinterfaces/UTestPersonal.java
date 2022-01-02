package co.com.choucair.financial.utestchallenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UTestPersonal extends PageObject {
    public static final Target FIRST_NAME_TEXT = Target.the("when you write your first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME_TEXT = Target.the("when you write your last name")
            .located(By.id("lastName"));
    public static final Target EMAIL_TEXT = Target.the("when you write your email")
            .located(By.id("email"));

    public static final Target MONTH_SELECT = Target.the("when you write the month of birthday")
            .locatedBy("//select[@id=\"birthMonth\"]");
    public static final Target DAY_SELECT = Target.the("when you write the day of birthday")
            .locatedBy("//select[@id=\"birthDay\"]");
    public static final Target YEAR_SELECT = Target.the("when you write the year of birthday")
            .locatedBy("//select[@id=\"birthYear\"]");

    public static final Target ENTER_BUTTON = Target.the("button to go to the next step")
            .locatedBy("//a[@class=\"btn btn-blue\"]");
}
