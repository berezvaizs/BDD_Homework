Feature: Shopping cart items
  I want to select Blouse from the shopping cart

  Scenario: Add Blouse into the shopping cart
    Given I have opened the My Store page
    When I click on "Women" tab
    And I select the "Blouse" product
    And I set Quantity number to "2"
    Then the Quantity field's display value should be "2"
    When I put Size to "M"
    Then the Size field's display value should be "M"
    When I click on Add to cart button
    And I click on Proceed To Checkout
    Then I will see the shopping cart page
    And I see the added items
      | Description | Unit price | Qty | Total  |
      | Blouse      | $27.00     | 2   | $54.00 |

  Scenario: Check Blouse the shopping cart
    Given I have opened the My Store page
    When I click on "Women" tab
    And I select the "Blouse" product
    And I set Quantity number to "2"
    Then the Quantity field's display value should be "2"
    When I put Size to "M"
    Then the Size field's display value should be "M"
    When I click on Add to cart button
    And I click on Proceed To Checkout
    Then I will see the shopping cart page
    And the Blouse total value field's display value should be shown