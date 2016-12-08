Feature: Base new FDD functionality validation

  Scenario: Open browser
    Given new instance of Selenium WebDriver

  Scenario: Verify that TEM user was login on Portal and FDD page is open
    When user navigates to 'http://54.235.105.224:8080'
    And user login using the Username as 'tem@mailinator.com' and the Password as 'Vadmin123'
    And widget page is open
    And user navigates to new FDD report page 'http://54.235.105.224:8080/#/fdd-report'
    Then base FDD elements are visible

  Scenario: Fault reports can be loaded in reasonable time (bug EPE-1723)
    When open first FDD fault
    Then fault page is opened for less than 5 seconds

  Scenario: CSV export works when 'All' state is selected on main view (EPE-1695)
    When click on CSV export button
    Then EcmDetails.xls file download popup is opened

  Scenario: User can update state from main view page (EPE-1694)
    When change fault state
    Then state should be changed immediately

  Scenario: Highcharts legend section is out of screen on FDD reports details (EPE-1698)
    When select first fault item and open details tab
    Then highcharts legend section is not shifted down

  Scenario: Comments tab looks fine in case of 'long' text message (EPE-1701)
    When Add 'long text' comment in Comments
    Then Comments properties contained in proper columns

  Scenario: 'hostname' column contains real IP address (EPE-1702)
    When User change the state
    Then 'hostname' column contains real IP address instead of '127.0.0.1'

  Scenario: Correct date is set in popup when user's comment has been submitted (EPE-1711)
    When User create new comment
    Then Current date is set in popup when comment has been submitted

  Scenario: Time-stamp is changed on Details after state was switched from Main view page (EPE-1718)
    Given 'State since' value for the first fault
    When change the first fault state
    Then compare 'State since' value was changed

  Scenario: 'change state' drop-down frame is on screen on the main FDD page (EPE-1720)
    When user opens state drop-down
    Then 'change state' drop-down frame is on the screen after opening

  Scenario: Comments tab shows alert when user add comment with more than 1000 symbols
    Given specified 'long' 1000 symbols string
    When user submit comment with 'long' string
    Then correct error message is raised like 'Comment should be less than 1000 Character' and comment has not been added

  Scenario: Close Browser
    Then driver needs to be closed
