Feature: UI Widget validation

  Scenario: Open browser
    Given new instance of Selenium WebDriver

  Scenario: Verify that 'Set Up' link in 'Left Menu bar' and 'My Account' link is out of 'Left Menu bar'
    When user navigates to 'http://54.235.105.224:8080'
    And user login using the Username as 'tem@mailinator.com' and the Password as 'Vadmin123'
    And widget page is open
    Then 'Set Up' link in 'Left Menu bar' and 'My Account' link is out of 'Left Menu bar'

  Scenario: Verify that 'Update' button on the same right offset that 'Display Name' field
    When user navigates to Manage Assets page 'http://54.235.105.224:8080/#/manage-assets'
    And Manage Assets page are visible
    Then Compare right offset for 'Update' button and 'Display Name' field

  Scenario: Verify that Policy Dashboard title has font-size 21px
    When user navigates to Policy Manager page 'http://54.235.105.224:8080/#/PolicyManager.in?status=loadMainPage'
    Then Check Policy Dashboard title has font-size '21px'

  Scenario: Verify that 'Add' link have valid left/right Offsets
    When  Policy Manager page are visible
    Then Check 'Add' link have valid left/right Offsets

  Scenario: Verify that 'Control Strategies' and 'Recent Activities' tables on the top offset
    Then Check 'Control Strategies' and 'Recent Activities' tables on the top offset

  Scenario: Close Browser
    Then driver needs to be closed