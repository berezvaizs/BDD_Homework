package com.epam.szte.bdd.pages;

import com.epam.szte.bdd.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends PageObject {

    private WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    @FindBy(id="email_create")
    private WebElement emailField;

    public void typeInEmail() {
       emailField.sendKeys("zsombor.berezvai@gmail.com");
    }
}
