package com.epam.szte.bdd.steps;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.HomepagePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomepageStep {

	private HomepagePage homepagePage = new HomepagePage(Hooks.driver);
	
	@Given("^I have opened the My Store page$")
	public void openMyStorePage() {
		homepagePage.openMyStorePage();
	}
	
	@When("I select the Sign in button")
	public void clickOnSignInPage() {
		homepagePage.clickOnsigInButton();
	}

	@When("^I type the \"([^\"]*)\" on search field$")
	public void searchingForItem(String item) {
		homepagePage.searchOnTextField(item);
	}
	
	@When("^I click on Search button$")
	public void clickOnSearchButton() {
		homepagePage.clickOnSearchButton();
	}
	
	@When("^I click on shopping cart$")
	public void clickOnShoppingCart() {
		homepagePage.clickOnShoppingCart();
	}
	
	/**
	 * �rai Feladat
	 */

	@When("^I select on Contact us button$")
	public void clickOncontactUsButton() {
		homepagePage.clickOnContactButton();
	}
	

	
}
