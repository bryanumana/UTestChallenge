package co.com.choucair.financial.utestchallenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class UTestDevicesPage extends PageObject {

    public static final Target OS = Target.the("when you select the computer's operating system in the drop down list ")
            .locatedBy("//span[@class=\"btn btn-default form-control ui-select-toggle\"]");
    public static final Target OS_SELECT = Target.the("select your operating system")
            .locatedBy("(//input[@type=\"search\"])[1]");

    public static final Target VERSION = Target.the("when you select the computer's version in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    public static final Target VERSION_SELECT = Target.the("select your version")
            .locatedBy("(//input[@type=\"search\"])[2]");

    public static final Target LANGUAGE = Target.the("when you select the language in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
    public static final Target LANGUAGE_SELECT = Target.the("select your language")
            .locatedBy("(//input[@type=\"search\"])[3]");

    public static final Target MOBILE = Target.the("when you select the mobile device in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]");
    public static final Target MOBILE_SELECT = Target.the("select your mobile device")
            .locatedBy("(//input[@type=\"search\"])[4]");

    public static final Target MODEL = Target.the("when you select the mobile device's model in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");
    public static final Target MODEL_SELECT = Target.the("select your mobile")
            .locatedBy("(//input[@type=\"search\"])[5]");

    public static final Target OS_MOBILE = Target.the("when you select the mobile device's operating system in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]");
    public static final Target OS_MOBILE_SELECT = Target.the("select the operative system")
            .locatedBy("(//input[@type=\"search\"])[6]");
    public static final Target ENTER_BUTTON = Target.the("button to go to the next step")
            .locatedBy("//a[@class=\"btn btn-blue pull-right\"]");

}
