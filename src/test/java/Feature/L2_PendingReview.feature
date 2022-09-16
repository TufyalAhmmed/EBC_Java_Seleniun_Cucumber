Feature: L2_PendingReview
  Scenario:Verify L2_PendingReview Functions works
    Given User on Login Page
    When User enters Username "<Username>" into the Username field
    And user enters Password "<Password>" into the password field
    And Click on Login Button
    And Select on QC Allocator radio Button
    And Click on Submit Button
    And Click on Status DropDown
    And Click on L2_PendingReview
    #And Click on Search
    And Provide Ey-ID
   # And Click on Search
    And Provide AssignTo info
  #  And Click on Search
    And Provide EYCheckId
    #And Click on Search
    And Provide client info
   # And Click on Search
    And Provide severity info
   # And Click on Search
    And Provide CheckType info
   # And Click on Search
    And Provide candidate Name
    And Click on TAT status Dropdown
    And Select Out of TAT
    And Click on Family Type DropDown
    And Select Address Check
    And Click on Search
    And Scroll the page
    And Scroll & select Identified entity checkbox
    And Scroll TillSelectanAction
    And Click on select an action Dropdown
    And Select Assign to QC verifier
    And Click on Assign user Dropdown
    And Click on QC verifier Executive
    Then Click on Assign Button





