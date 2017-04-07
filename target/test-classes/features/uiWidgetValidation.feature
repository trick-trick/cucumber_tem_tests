Feature: UI Widget validation

  Scenario: Open browser
    Given new instance of Selenium WebDriver

  Scenario: Verify that conf icon inside Widget frame
    When user navigates to 'http://54.235.105.224:8080'
    And user login using the Username as 'tem@mailinator.com' and the Password as 'Vadmin123'
    And widget page is open
    Then configuration widget icon inside widget frame

  Scenario: Close Browser
    Then driver needs to be closed