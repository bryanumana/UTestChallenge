package co.com.choucair.financial.utestchallenge.models;

public class UserData {
    private String strLastName;
    private String strName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;

    private String strCity;
    private String strState;
    private String strZIP;
    private String strCountry;

    private String strOS;
    private String strVersion;
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String strOsMobile;

    private String strPassword;
    private String strConfirmPassword;



    //Personal Data
    public String getStrName() { return strName; }

    public void setStrName(String strName) { this.strName = strName; }

    public String getStrLastName() { return strLastName; }

    public void setStrLastName(String strLastName) { this.strLastName = strLastName; }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrMonth() {
        return strMonth;
    }

    public void setStrMonth(String strMonth) {
        this.strMonth = strMonth;
    }

    public String getStrDay() {
        return strDay;
    }

    public void setStrDay(String strDay) {
        this.strDay = strDay;
    }

    public String getStrYear() {
        return strYear;
    }

    public void setStrYear(String strYear) {
        this.strYear = strYear;
    }


    //Address Data
    public String getStrCity() { return strCity; }

    public void setStrCity(String strCity) { this.strCity = strCity; }

    public String getStrState() { return strState; }

    public void setStrState(String strState) { this.strState = strState; }

    public String getStrZIP() { return strZIP; }

    public void setStrZIP(String strZIP) { this.strZIP = strZIP; }

    public String getStrCountry() { return strCountry; }

    public void setStrCountry(String strCountry) { this.strCountry = strCountry; }


    //Devices Data
    public String getStrOS() { return strOS; }

    public void setStrOS(String strOS) { this.strOS = strOS; }

    public String getStrVersion() { return strVersion; }

    public void setStrVersion(String strVersion) { this.strVersion = strVersion; }

    public String getStrLanguage() { return strLanguage; }

    public void setStrLanguage(String strLanguage) { this.strLanguage = strLanguage; }

    public String getStrMobile() { return strMobile; }

    public void setStrMobile(String strMobile) { this.strMobile = strMobile; }

    public String getStrModel() { return strModel; }

    public void setStrModel(String strModel) { this.strModel = strModel; }

    public String getStrOsMobile() { return strOsMobile; }

    public void setStrOsMobile(String strOsMobile) { this.strOsMobile = strOsMobile; }


    //Password Data
    public String getStrPassword() { return strPassword; }

    public void setStrPassword(String strPassword) { this.strPassword = strPassword; }

    public String getStrConfirmPassword() { return strConfirmPassword; }

    public void setStrConfirmPassword(String strConfirmPassword) { this.strConfirmPassword = strConfirmPassword; }

}
