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

    public static final Target OS = Target.the("select your computer's operating system")
            .locatedBy("//span[@class=\"btn btn-default form-control ui-select-toggle\"]");
    public static final Target OS_SELECT = Target.the("the operating system is Windows")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strOsSelect + "\")]");

    public static final Target VERSION = Target.the("select the version of the operating system")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    public static final Target VERSION_SELECT = Target.the("the version is seven")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strVersionSelect + "\")]");

    public static final Target LANGUAGE = Target.the("select your language")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
    public static final Target LANGUAGE_SELECT = Target.the("the language is spanish")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strLanguageSelect + "\")]");

    public static final Target MOBILE = Target.the("select your mobile device")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]");
    public static final Target MOBILE_SELECT = Target.the("the mark is motorola")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strMobileSelect + "\")]");

    public static final Target MODEL = Target.the("select the model of your mobile device")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");
    public static final Target MODEL_SELECT = Target.the("the model is E5")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strModelSelect + "\")]");

    public static final Target OS_MOBILE = Target.the("select the operative system of your mobile device")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]");
    public static final Target OS_MOBILE_SELECT = Target.the("the operative system is Android 8.0.0")
            .locatedBy("//span[@class=\"ui-select-choices-row-inner\"]//div[contains(text(),\""+ strOsMobileSelect + "\")]");

    public static final Target ENTER_BUTTON = Target.the("button to go to the next step")
            .locatedBy("//a[@class=\"btn btn-blue pull-right\"]");

}
