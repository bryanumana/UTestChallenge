@story

Feature: New Account On UTest
  I as user, I want to create a new register to get my account and be able to access on UTest platform

  @scenario1
  Scenario: successful account creation
    Given user enters the UTest platform
    When user registers their data and their devices by completing the text boxes
    |strLastName |strName|strEmail      |strMonth |strDay|strYear|strPassword  |strConfirmPassword|strOS|
    |Umaña Gómez |Bryan  |bugh@gmail.com|June     |20    |1990   |Choucair2021*|Choucair2021*     |Linux|

    Then user sees the button called
    |strNameButton|
    |Complete Setup|

