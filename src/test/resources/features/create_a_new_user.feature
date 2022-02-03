@createNewCount

Feature: New Account On UTest
  I as user,
  I want to create a new register to get my account and be able to access on UTest platform

  @succesful
  Scenario: successful account creation
    Given user enters the UTest platform
    When user registers their data and their devices
    |strName|strLastName|strEmail      |strMonth |strDay|strYear|strCity|strState|strZIP|strCountry|strOS|strVersion|strLanguage|strMobile|strModel|strOsMobile|strPassword  |strConfirmPassword|
    |Bryan  |Umaña Gómez|bugh@gmail.com|June     |20    |1990   |Ottawa |Ontario |Z1R   |Canada    |Linux|Kali      |Spanish    |Motorola |W220    |Java ME    |Choucair2021*|Choucair2021*     |

    Then user sees the page called
    |strNameButton |
    |Complete Setup|

