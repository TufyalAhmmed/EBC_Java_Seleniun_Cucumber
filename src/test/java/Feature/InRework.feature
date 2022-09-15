Feature: In Rework

 Scenario: Verify In rework  Functions works
    Given User on Login Page
    When User enters Username "<Username>" into the Username field
    And user enters Password "<Password>" into the password field
    And Click on Login Button
    And Select on QC Allocator radio Button
    And Click on Submit Button
    And Click on Status DropDown
    And Click on In Rework DropDown
    And Click on Search
    And Provide EY-ID
#    Then Search After providing EY-ID
    And  Click on Search
    And Provide Assign to info
    And Click on Search
    And Provide EY-Check-Id
    And Click on Search
    And Provide Client info
    And Click on Search
    And Provide Severity info
    And Click on Search
#    And Provide CheckType info
#    And Click on Search
    And Provide Candidate Name
    Then Click on Search


