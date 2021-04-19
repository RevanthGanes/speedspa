@SPEEDSpaFlow
Feature: SpeedSPA Test Automation Workflow

  Scenario: Create SpeedSPA and verify the Same
    Given User is in login SpeedsSPA portal
    When User enters valid Email and password
    And Click on Login button
    And User Click on clients button present in homepage
    And User Click Addclient and add clientinfo
    Then User Click on Savechanges
    And User Click on staff button and Add Staff
    And User Click schedule button and Add Appointment
    And User Click staff schedule button and Add New StaffSchedule
    
    