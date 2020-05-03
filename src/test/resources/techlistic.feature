Feature: Techlistic main page test
  Scenario: User fill the Selenium Practice Form
    Given User views Practice Form page
    When User enter Sevgi on Firstname area
    And User enter Yalcin on Lastname area
    And User click Female
    And User click Experience_four
    And User enter "19.03.2000" on DatePicker area
    And User click Automation_Tester button
    And User click Selenium_WebDriver button

