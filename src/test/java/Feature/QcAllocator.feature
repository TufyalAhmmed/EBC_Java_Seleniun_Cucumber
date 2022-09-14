Feature: QC Allocator

  Scenario Outline: Verify QC Allocator Functions works
    Given User on Login Page
    When User enters Username "<Username>" into the Username field
    And user enters Password "<Password>" into the password field
    And Click on Login Button
    And Select on QC Allocator radio Button
    And Click on Submit Button
    And Click on Status DropDown
    And Select Closed Checkbox
#    And Click on Assigned to
    And Click on Search
#    And Click on Search
    And Scroll into the Bottom of page
    And again Scroll into Top of the page
    And Enter EY Check ID "<EY Check ID>"
    Then Click On Search Button
    Examples:
      |EY Check ID|
      |30001423   |