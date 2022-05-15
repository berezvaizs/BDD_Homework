Feature: Create Account
  I want to login with valid and invalid user


  Scenario: Login test
    Given I have opened the My Store page
    When I select the Sign in button
    Then I have opened the My Store page
    When I type in email
    ##And I click on the Create button
    ##Then Registration page is loaded
