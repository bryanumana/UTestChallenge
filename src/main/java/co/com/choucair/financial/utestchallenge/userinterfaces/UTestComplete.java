package co.com.choucair.financial.utestchallenge.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestComplete extends PageObject {
    public static final Target PASSWORD_TEXT = Target.the("when you write your password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_TEXT = Target.the("when you to confirm your password")
            .located(By.id("confirmPassword"));
    public static final Target TERMS_CHECK = Target.the("when you accept the terms of use")
            .locatedBy("//span[@class=\"checkmark signup-consent__checkbox error\"]");
    public static final Target PRIVACY_CHECK = Target.the("when you accept privacy and security policy")
            .locatedBy("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]");
    public static final Target ENTER_BUTTON = Target.the("button to finish registration")
            .locatedBy("//a[@class=\"btn btn-blue\"]");
    public static final Target NAME_BUTTON = Target.the("button to finish registration")
            .locatedBy("//a[@class=\"btn btn-blue\"]//span[contains(text(),\"Complete Setup\")] ");
}
