package com.epam.szte.bdd.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.beans.SamePropertyValuesAs.samePropertyValuesAs;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.epam.szte.bdd.dao.Product;
import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.ShoppingCartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class ShoppingCartStep {

    private final ShoppingCartPage shoppingCartPage = new ShoppingCartPage(Hooks.driver);

    @When("I put Size to {string}")
    public void putSize(String size) {
        shoppingCartPage.selectShirtSize(size);
    }

    @Then("the Size field's display value should be {string}")
    public void sizeDisplay(String s) {
        shoppingCartPage.assertShirtSize(s);
    }


    @When("I click on delete button")
    public void clickOnDeleteButton() {
        shoppingCartPage.clickDeleteButton();
    }

    @Then("I can see the cart is empty")
    public void canSeeTheCartIsEmpty() {
        shoppingCartPage.assertEmptyCart();
    }

    @And("the Printed Chiffon Dress total value field's display value should be shown")
    public void PrintedChiffonDessTheTotalValue() {
        shoppingCartPage.assertTotalValue();
    }

    @And("the Blouse total value field's display value should be shown")
    public void BlouseTheTotalValue() {
        shoppingCartPage.assertTotalValue2();
    }

    @And("I click on green color")
    public void clickOnGreenButton() {
        shoppingCartPage.clickGreenButton();
    }

    @Then("the color display value should be green")
    public void selectedGreenColor(String green) {
        shoppingCartPage.assertGreenButton(green);
    }

    @And("I click on black color")
    public void clickOnBlackButton() {
        shoppingCartPage.clickBlackButton();
    }

    @Then("the color display value should be black")
    public void selectedBlackColor(String black) {
        shoppingCartPage.assertBlackButton(black);
    }

    @Then("^I will see the shopping cart page$")
    public void shoppingCartPageIsDisplayed() {
        assertTrue("The shopping cart page is not displayed", shoppingCartPage.shoppingCartIsDisplayed());
    }


    @Then("^I see the added items$")
    public void checkAddedItems(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        List<Product> actualProducts = shoppingCartPage.getProducts();
        List<Product> expectedProducts = new ArrayList<>();
        for (Map<String, String> stringStringMap : list) {
            Product product = new Product();
            product.setProductName(stringStringMap.get("Description"));
            product.setUnitProductPrice(stringStringMap.get("Unit price"));
            product.setTotalProductPrice(stringStringMap.get("Total"));
            product.setProductQuantity(stringStringMap.get("Qty"));
            expectedProducts.add(product);
        }
        assertThat(actualProducts.size(), equalTo(expectedProducts.size()));
        Iterator<Product> actualIterator = actualProducts.iterator();
        for (Product expectedProduct : expectedProducts) {
            assertThat("failed", actualIterator.next(), samePropertyValuesAs(expectedProduct));
        }
    }

}
