Feature: LogIn Page

  Scenario Outline: Verify user logged in successfully
    Given User on Login Page
    When User enters Username "<Username>" into the Username field
    And user enters Password "<Password>" into the password field
    And Click on Login Button
    And Select on QC Allocator radio Button
    Then Click on Submit Button
    Examples:
      |Username           |  Password  |
      |QCAllocator@in.com |  123    |



#      Scenario Outline: Verify By EY Check ID
#        Given Click on Status DropDown
#        When Select Closed Checkbox
#        And Click on Search
#        And Click on Search
#        And Enter EY Check ID "<EY Check ID>"
#        Then Click On Search Button
#        Examples:
#        |EY Check ID|
#        |30001423   |



