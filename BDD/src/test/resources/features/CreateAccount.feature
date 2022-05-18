Feature: Create Account
  I want to login with valid and invalid user


  Scenario: Login test
    Given I have opened the My Store page
    When I select the Sign in button
    Then I will see the Login page
    When I type in Email address field
    ##And I select the Create Account button
    ##Then I will see the Registration page
