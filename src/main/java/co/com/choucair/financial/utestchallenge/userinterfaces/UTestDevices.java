package co.com.choucair.financial.utestchallenge.userinterfaces;

import co.com.choucair.financial.utestchallenge.tasks.RegisterDevicesData;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class UTestDevices extends PageObject {

    private static String strOsSelect = RegisterDevicesData.getStrOSI();
    private static String strVersionSelect = RegisterDevicesData.getStrVersionI();
    private static String strLanguageSelect = RegisterDevicesData.getStrLanguageI();
    private static String strMobileSelect = RegisterDevicesData.getStrMobileI();
    private static String strModelSelect = RegisterDevicesData.getStrModelI();
    private static String strOsMobileSelect = RegisterDevicesData.getStrOsMobileI();

    public static final Target OS = Target.the("when you select the computer's operating system in the drop down list ")
            .locatedBy("//span[@class=\"btn btn-default form-control ui-select-toggle\"]");
    public static final Target OS_SELECT = Target.the("select your operating system")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strOsSelect + "\")]");

    public static final Target VERSION = Target.the("when you select the computer's version in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    public static final Target VERSION_SELECT = Target.the("select your version")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strVersionSelect + "\")]");

    public static final Target LANGUAGE = Target.the("when you select the language in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
    public static final Target LANGUAGE_SELECT = Target.the("select your language")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strLanguageSelect + "\")]");

    public static final Target MOBILE = Target.the("when you select the mobile device in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]");
    public static final Target MOBILE_SELECT = Target.the("select your mobile device")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strMobileSelect + "\")]");

    public static final Target MODEL = Target.the("when you select the mobile device's model in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");
    public static final Target MODEL_SELECT = Target.the("select your mobile")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strModelSelect + "\")]");

    public static final Target OS_MOBILE = Target.the("when you select the mobile device's operating system in the drop down list")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]");
    public static final Target OS_MOBILE_SELECT = Target.the("select the operative system")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strOsMobileSelect + "\")]");

    public static final Target ENTER_BUTTON = Target.the("button to go to the next step")
            .locatedBy("//a[@class=\"btn btn-blue pull-right\"]");

}
