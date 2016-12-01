Feature: User can open first fault detection item on FDD report page

  Scenario:
    Given new instance of Selenium WebDriver

  Scenario: Verify that TEM user was login
    When user navigates to 'http://54.235.105.224:8080'
    And user login using the Username as 'tem@mailinator.com' and the Password as 'Vadmin123'
    Then widget page is open

  Scenario: Verify that new FDD page is open
    When user navigates to new FDD report page 'http://54.235.105.224:8080/#/fdd-report'
    Then base FDD elements are visible

  Scenario:
    Then driver needs to be closed
