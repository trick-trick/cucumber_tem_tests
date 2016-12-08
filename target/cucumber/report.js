$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("baseFdd.feature");
formatter.feature({
  "line": 1,
  "name": "Base new FDD functionality validation",
  "description": "",
  "id": "base-new-fdd-functionality-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Open browser",
  "description": "",
  "id": "base-new-fdd-functionality-validation;open-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "new instance of Selenium WebDriver",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsImplementation.new_instance_of_Selenium_WebDriver()"
});
formatter.result({
  "duration": 4842394579,
  "status": "passed"
});
formatter.after({
  "duration": 136135,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify that TEM user was login on Portal and FDD page is open",
  "description": "",
  "id": "base-new-fdd-functionality-validation;verify-that-tem-user-was-login-on-portal-and-fdd-page-is-open",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user navigates to \u0027http://54.235.118.15:8080\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user login using the Username as \u0027tem@mailinator.com\u0027 and the Password as \u0027Vadmin123\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "widget page is open",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user navigates to new FDD report page \u0027http://54.235.118.15:8080/#/fdd-report\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "base FDD elements are visible",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://54.235.118.15:8080",
      "offset": 19
    }
  ],
  "location": "StepsImplementation.user_navigates_to_http(String)"
});
formatter.result({
  "duration": 3706977572,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tem@mailinator.com",
      "offset": 34
    },
    {
      "val": "Vadmin123",
      "offset": 75
    }
  ],
  "location": "StepsImplementation.user_login_using_the_Username_as_user_and_the_Password_as_password(String,String)"
});
formatter.result({
  "duration": 491956896,
  "status": "passed"
});
formatter.match({
  "location": "StepsImplementation.widget_page_is_open()"
});
formatter.result({
  "duration": 10463399438,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://54.235.118.15:8080/#/fdd-report",
      "offset": 39
    }
  ],
  "location": "StepsImplementation.user_navigates_to_new_FDD_report_page_http_fdd_report(String)"
});
formatter.result({
  "duration": 201085453,
  "status": "passed"
});
formatter.match({
  "location": "StepsImplementation.base_FDD_elements_are_visible()"
});
formatter.result({
  "duration": 35112440,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat steps.StepsImplementation.base_FDD_elements_are_visible(StepsImplementation.java:59)\r\n\tat ✽.Then base FDD elements are visible(baseFdd.feature:11)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("URL at failure: http://54.235.118.15:8080/#/fdd-report");
formatter.after({
  "duration": 145101875,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Fault reports can be loaded in reasonable time (bug EPE-1723)",
  "description": "",
  "id": "base-new-fdd-functionality-validation;fault-reports-can-be-loaded-in-reasonable-time-(bug-epe-1723)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "open first FDD fault",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "fault page is opened in the range of time from 1 to 5 seconds",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsImplementation.open_first_FDD_fault()"
});
formatter.result({
  "duration": 21432,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 47
    },
    {
      "val": "5",
      "offset": 52
    }
  ],
  "location": "StepsImplementation.fault_page_is_opened_in_the_range_of_time_from_to_seconds(int,int)"
});
formatter.result({
  "duration": 592230,
  "status": "passed"
});
formatter.after({
  "duration": 15093,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "CSV export works when \u0027All\u0027 state is selected on main view (EPE-1695)",
  "description": "",
  "id": "base-new-fdd-functionality-validation;csv-export-works-when-\u0027all\u0027-state-is-selected-on-main-view-(epe-1695)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "click on CSV export button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "EcmDetails.xls file download popup is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsImplementation.click_on_CSV_export_button()"
});
formatter.result({
  "duration": 20224,
  "status": "passed"
});
formatter.match({
  "location": "StepsImplementation.ecmdetails_xls_file_download_popup_is_opened()"
});
formatter.result({
  "duration": 10262,
  "status": "passed"
});
formatter.after({
  "duration": 10867,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User can update state from main view page (EPE-1694)",
  "description": "",
  "id": "base-new-fdd-functionality-validation;user-can-update-state-from-main-view-page-(epe-1694)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "change fault state",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "state should be changed immediately",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsImplementation.change_fault_state()"
});
formatter.result({
  "duration": 16904,
  "status": "passed"
});
formatter.match({
  "location": "StepsImplementation.state_should_be_changed_immediately()"
});
formatter.result({
  "duration": 10565,
  "status": "passed"
});
formatter.after({
  "duration": 14791,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Highcharts legend section is out of screen on FDD reports details (EPE-1698)",
  "description": "",
  "id": "base-new-fdd-functionality-validation;highcharts-legend-section-is-out-of-screen-on-fdd-reports-details-(epe-1698)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "select first fault item and open details tab",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "highcharts legend section is not shifted down",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsImplementation.select_first_fault_item_and_open_details_tab()"
});
formatter.result({
  "duration": 19620,
  "status": "passed"
});
formatter.match({
  "location": "StepsImplementation.highcharts_legend_section_is_not_shifted_down()"
});
formatter.result({
  "duration": 14187,
  "status": "passed"
});
formatter.after({
  "duration": 15395,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Comments tab looks fine in case of \u0027long\u0027 text message (EPE-1701)",
  "description": "",
  "id": "base-new-fdd-functionality-validation;comments-tab-looks-fine-in-case-of-\u0027long\u0027-text-message-(epe-1701)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "Add \u0027long text\u0027 comment in Comments",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Comments properties contained in proper columns",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsImplementation.add_long_text_comment_in_Comments()"
});
formatter.result({
  "duration": 27167,
  "status": "passed"
});
formatter.match({
  "location": "StepsImplementation.comments_properties_contained_in_proper_columns()"
});
formatter.result({
  "duration": 11168,
  "status": "passed"
});
formatter.after({
  "duration": 15997,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "\u0027hostname\u0027 column contains real IP address (EPE-1702)",
  "description": "",
  "id": "base-new-fdd-functionality-validation;\u0027hostname\u0027-column-contains-real-ip-address-(epe-1702)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "User change the state",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "\u0027hostname\u0027 column contains real IP address instead of \u0027127.0.0.1\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsImplementation.user_change_the_state()"
});
formatter.result({
  "duration": 18715,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "127",
      "offset": 55
    },
    {
      "val": "0",
      "offset": 59
    },
    {
      "val": "0",
      "offset": 61
    },
    {
      "val": "1",
      "offset": 63
    }
  ],
  "location": "StepsImplementation.hostname_column_contains_real_IP_address_instead_of(int,int,int,int)"
});
formatter.result({
  "duration": 99913,
  "status": "passed"
});
formatter.after({
  "duration": 15092,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Correct date is set in popup when user\u0027s comment has been submitted (EPE-1711)",
  "description": "",
  "id": "base-new-fdd-functionality-validation;correct-date-is-set-in-popup-when-user\u0027s-comment-has-been-submitted-(epe-1711)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "User create new comment",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Current date is set in popup when comment has been submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsImplementation.user_create_new_comment()"
});
formatter.result({
  "duration": 27771,
  "status": "passed"
});
formatter.match({
  "location": "StepsImplementation.current_date_is_set_in_popup_when_comment_has_been_submitted()"
});
formatter.result({
  "duration": 14489,
  "status": "passed"
});
formatter.after({
  "duration": 10565,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Time-stamp is changed on Details after state was switched from Main view page (EPE-1718)",
  "description": "",
  "id": "base-new-fdd-functionality-validation;time-stamp-is-changed-on-details-after-state-was-switched-from-main-view-page-(epe-1718)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "\u0027State since\u0027 value for the first fault",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "change the first fault state",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "compare \u0027State since\u0027 value was changed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsImplementation.state_since_value_for_the_first_fault()"
});
formatter.result({
  "duration": 17206,
  "status": "passed"
});
formatter.match({
  "location": "StepsImplementation.change_the_first_fault_state()"
});
formatter.result({
  "duration": 9961,
  "status": "passed"
});
formatter.match({
  "location": "StepsImplementation.compare_State_since_value_was_changed()"
});
formatter.result({
  "duration": 13885,
  "status": "passed"
});
formatter.after({
  "duration": 10565,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "\u0027change state\u0027 drop-down frame is on screen on the main FDD page (EPE-1720)",
  "description": "",
  "id": "base-new-fdd-functionality-validation;\u0027change-state\u0027-drop-down-frame-is-on-screen-on-the-main-fdd-page-(epe-1720)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "user opens state drop-down",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "\u0027change state\u0027 drop-down frame is on the screen after opening",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsImplementation.user_opens_state_drop_down()"
});
formatter.result({
  "duration": 17809,
  "status": "passed"
});
formatter.match({
  "location": "StepsImplementation.change_state_drop_down_frame_is_on_the_screen_after_opening()"
});
formatter.result({
  "duration": 11169,
  "status": "passed"
});
formatter.after({
  "duration": 10565,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Comments tab shows alert when user add comment with more than 1000 symbols",
  "description": "",
  "id": "base-new-fdd-functionality-validation;comments-tab-shows-alert-when-user-add-comment-with-more-than-1000-symbols",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "specified \u0027long\u0027 1000 symbols string",
  "keyword": "Given "
});
formatter.step({
  "line": 52,
  "name": "user submit comment with \u0027long\u0027 string",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "correct error message is raised like \u0027Comment should be less than 1000 Character\u0027 and comment has not been added",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 17
    }
  ],
  "location": "StepsImplementation.specified_long_symbols_string(int)"
});
formatter.result({
  "duration": 68822,
  "status": "passed"
});
formatter.match({
  "location": "StepsImplementation.user_submit_comment_with_long_string()"
});
formatter.result({
  "duration": 9962,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 66
    }
  ],
  "location": "StepsImplementation.correct_error_message_is_raised_like_Comment_should_be_less_than_Character_and_comment_has_not_been_added(int)"
});
formatter.result({
  "duration": 34713,
  "status": "passed"
});
formatter.after({
  "duration": 10264,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Close Browser",
  "description": "",
  "id": "base-new-fdd-functionality-validation;close-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "driver needs to be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsImplementation.close_driver()"
});
formatter.result({
  "duration": 1494151348,
  "status": "passed"
});
formatter.after({
  "duration": 19620,
  "status": "passed"
});
});