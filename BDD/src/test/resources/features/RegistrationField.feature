Feature: Create an account
  I want to fill fields

  Scenario: Type in the mandatory fields
    Given I have opened the My Store page
    When I select the Sign in button
    Then I will see the Login page
    When I type in Email address field
    And I select the Create Account button
    Then I will see the Registration page
    When I type in customerFirstName
    And I type in customerLastName
    And I type in password
    And I type in firstName
    And I type in lastName
    And I type in address
    And I type in City
    And I select from State
    And I type in Postcode
    And I type in Mobile phone

  Scenario: Check the mandatory field's display value
    Given I have opened the My Store page
    When I select the Sign in button
    Then I will see the Login page
    When I type in Email address field
    And I select the Create Account button
    Then I will see the Registration page
    When I type in customerFirstName
    And I type in customerLastName
    And I type in password
    And I type in firstName
    And I type in lastName
    And I type in address
    And I type in City
    And I select from State
    And I type in Postcode
    And I type in Mobile phone
    When I scroll to the top
    Then the customer_firstname's field display value should be 'Zsombor'
    Then the customer_lastname's field display value should be 'Berezvai'
    Then the password's field display value should be '1234567'
    Then the firstname's field display value should be 'Zsombor'
    Then the lastname's field display value should be 'Berezvai'
    Then the address's field display value should be 'Kiss Ferenc utca 37'
    Then the city's field display value should be 'Debrecen'
    Then the state's field display value should be '9'
    Then the postcode's field display value should be '64352'
    Then the phone_mobile's field display value should be '0630406724'







