Feature: Shopping Cart
  I want to add some items into the shopping cart

  @shop
  Scenario: Add items into the shopping cart
	  Given I have opened the My Store page
		When I click on "Women" tab
		And I select the "Printed Dress" product
		And I set Quantity number to "2"
		Then the Quantity field's display value should be "2"
		When I click on Add to cart button
		And I click on continue shopping
		When I click on "T-Shirts" tab
		And I select the "Faded Short Sleeve T-shirts" product
		And I set Quantity number to "3"
		Then the Quantity field's display value should be "3"
		When I click on Add to cart button
		And I click on continue shopping
		And I click on Proceed To Checkout
		Then I will see the shopping cart page
		And I see the added items
			|Description								|Unit price	|Qty|Total	|
			|Printed Dress							|$26.00			|2	|$52.00	|
			|Faded Short Sleeve T-shirts|$16.51			|3	|$49.53	|
		
		

