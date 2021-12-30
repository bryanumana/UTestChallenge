package co.com.choucair.financial.utestchallenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class UTestDevices extends PageObject {
    public static final Target OS = Target.the("select your computer's operating system")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");
    public static final Target WINDOWS_SELECT = Target.the("the operating system is Windows")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");

    public static final Target VERSION = Target.the("select the version of the operating system")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    public static final Target SEVEN_SELECT = Target.the("the version is seven")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[5]");

    public static final Target LANGUAGE = Target.the("select your language")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
    public static final Target SPANISH_SELECT = Target.the("the language is spanish")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[38]");

    public static final Target MOBILE = Target.the("select your mobile device")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]");
    public static final Target MOTOROLA_SELECT = Target.the("the mark is motorola")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[24]");

    public static final Target MODEL = Target.the("select the model of your mobile device")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");
    public static final Target E5_SELECT = Target.the("the model is E5")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[136]");

    public static final Target OS_MOBILE = Target.the("select the operative system of your mobile device")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]");
    public static final Target ANDROID8_SELECT = Target.the("the operative system is Android 8.0.0")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[1]");

    public static final Target ENTER_BUTTON = Target.the("button to go to the next step")
            .locatedBy("//a[@class=\"btn btn-blue pull-right\"]");

    //btn btn-blue pull-right
}
