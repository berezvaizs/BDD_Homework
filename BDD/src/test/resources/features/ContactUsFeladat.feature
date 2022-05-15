Feature: Contact us
  I want to test the contact us

  
  Scenario: Add items into the shopping cart
	  Given I have opened the My Store page
	  When I select the Sign in button
		Then I can see the contuct us page
		When I select "Customer service" Subject Heading
		And I write email address "asada@sada.com"
		And I write order reference "asdasd"
		And I write message "This is my message"
		Then I see my message is "This is my message"
