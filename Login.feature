Feature: User Login Functionality

Scenario: Valid User Login
  Given User is on login page
  When User enters username and password
  And User clicks login button
  Then User should be logged in successfully
