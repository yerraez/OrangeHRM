@SuccessfulLogin
  Feature: Successful login with username and password
    Background: Validate login with correct credentials

    Scenario: Login into the website with correct username and password
      Given the user go to the website
      When the user enter a valid username and password
      Then the user enter to the website

    Scenario: Add an user
      Given the user click in the add button
      When the user fill the form
      Then the user click in the save button
    Scenario: Logout
      Given the user click in user options
      Then select logout option