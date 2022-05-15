Feature: Shopping cart items
  I want to select items from the shopping cart


  Scenario: Add Printed Chiffon Dress into the shopping cart
    Given I have opened the My Store page
    When I click on "Women" tab
    And I select the "Printed Chiffon Dress" product
    And I set Quantity number to "4"
    Then the Quantity field's display value should be "4"
    When I put Size to "L"
    Then the Size field's display value should be "L"
    When I click on Add to cart button
    And I click on Proceed To Checkout
    Then I will see the shopping cart page
    And I see the added items
      | Description           | Unit price | Qty | Total  |
      | Printed Chiffon Dress | $16.40     | 4   | $67.60 |

  Scenario: Check Printed Chiffon Dress the shopping cart
    Given I have opened the My Store page
    When I click on "Women" tab
    And I select the "Printed Dress" product
    And I set Quantity number to "4"
    Then the Quantity field's display value should be "4"
    When I put Size to "L"
    Then the Size field's display value should be "L"
    When I click on Add to cart button
    And I click on Proceed To Checkout
    Then I will see the shopping cart page
    And the Printed Chiffon Dress total value field's display value should be shown

  Scenario: Add Blouse into the shopping cart
    Given I have opened the My Store page
    When I click on "Women" tab
    And I select the "Blouse" product
    And I set Quantity number to "1"
    Then the Quantity field's display value should be "1"
    When I put Size to "M"
    Then the Size field's display value should be "M"
    When I click on Add to cart button
    And I click on Proceed To Checkout
    Then I will see the shopping cart page
    And I see the added items
      | Description | Unit price | Qty | Total  |
      | Blouse      | $27.00     | 1   | $27.00 |

  Scenario: Check Blouse the shopping cart
    Given I have opened the My Store page
    When I click on "Women" tab
    And I select the "Blouse" product
    And I set Quantity number to "1"
    Then the Quantity field's display value should be "1"
    When I put Size to "M"
    Then the Size field's display value should be "M"
    When I click on Add to cart button
    And I click on Proceed To Checkout
    Then I will see the shopping cart page
    And the Blouse total value field's display value should be shown

		

