package com.epam.szte.bdd.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.szte.bdd.dao.Product;
import com.epam.szte.bdd.utils.PageObject;

import static org.junit.Assert.assertTrue;

public class ShoppingCartPage extends PageObject {

    private final WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    @FindBy(id = "group_1")
    private WebElement shirtSize;

    public void selectShirtSize(String size) {
        Select sizes = new Select(shirtSize);
        sizes.selectByVisibleText(size);
    }

    public void assertShirtSize(String size) {
        assertTrue(shirtSize.getText().contains(size));
    }

    @FindBy(id = "1_3_0_0")
    private WebElement deleteButton;

    public void clickDeleteButton() {
        deleteButton.click();
    }

    @FindBy(css = "#center_column > p")
    private WebElement alertText;

    public void assertEmptyCart() {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(alertText));
        assertTrue(alertText.getText().contains("Your shopping cart is empty."));
    }

    @FindBy(id = "total_price")
    private WebElement totalPriceText;

    public void assertTotalValue() {
        assertTrue("Wrong Price", totalPriceText.getText().contains("$65.60"));
    }

    public void assertTotalValue2() {
        assertTrue("Wrong Price", totalPriceText.getText().contains("$54.00"));
    }

    @FindBy(css = "#cart_title")
    private WebElement shoppingCartTitle;

    @FindBy(css = ".cart_item")
    private List<WebElement> cartItems;

    public boolean shoppingCartIsDisplayed() {
        return shoppingCartTitle.isDisplayed();
    }

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        for (WebElement cartItem : cartItems) {
            Product product = new Product();
            product.setProductName(cartItem.findElement(By.cssSelector(".product-name")).getText());
            product.setUnitProductPrice(cartItem.findElement(By.cssSelector(".cart_unit .price")).getText());
            product.setTotalProductPrice(cartItem.findElement(By.cssSelector(".cart_total .price")).getText());
            product.setProductQuantity(cartItem.findElement(By.cssSelector(".cart_quantity_input")).getAttribute("value"));
            products.add(product);
        }
        return products;
    }

    @FindBy(css=".alert")
    private WebElement alertMessage;


    public String getAlertMessage() {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(alertMessage));
        return alertMessage.getText();
    }

}
