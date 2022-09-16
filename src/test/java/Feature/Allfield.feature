Feature:All Field
  Scenario:Verify All Field Functions works
    Given User on Login Page
    When User enters Username "<Username>" into the Username field
    And user enters Password "<Password>" into the password field
    And Click on Login Button
    And Select on QC Allocator radio Button
    And Click on Submit Button
    And Click on Status DropDown
    And Click on L2_PendingReview
    And Provide Ey-ID
    And Provide AssignTo info
    And Provide EYCheckId
    And Provide client info
    And Provide severity info
    And Provide CheckType info
    And Provide candidate Name
    Then Click on Search



