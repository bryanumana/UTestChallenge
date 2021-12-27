@story

Feature: New Account On UTest
  I as user, I want to create a new register to get my account and be able to access on UTest platform

  @scenario1
  Scenario: successful account creation
    Given user enters the UTest platform
    When user registers their data and their devices by completing the text boxes
    Then user sees the button called Complete Setup
