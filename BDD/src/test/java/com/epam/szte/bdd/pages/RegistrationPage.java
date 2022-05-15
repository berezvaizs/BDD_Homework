package com.epam.szte.bdd.pages;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationPage extends PageObject {
    private final WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean getRegistrationPage() {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.urlToBe("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation"));
        return Hooks.driver.getCurrentUrl().contains("account-creation");
    }

    @FindBy(id = "customer_firstname")
    private WebElement customer_firstname;

    public void typeCustomerFirstName(String customerfirstname) {
        customer_firstname.sendKeys(customerfirstname);
    }

    public boolean getCustomerFirstname(String cfn) {
        return customer_firstname.getAttribute("value").contains(cfn);
    }

    @FindBy(id = "customer_lastname")
    private WebElement customer_lastname;

    public void typeCustomerLastName(String customerlastname) {
        customer_lastname.sendKeys(customerlastname);
    }

    public boolean getCustomerLastName(String cln) {
        return customer_lastname.getAttribute("value").contains(cln);
    }

    @FindBy(id = "passwd")
    private WebElement passwd;

    public void typePassword(String password) {
        passwd.sendKeys(password);
    }


    public boolean getPassword(String psw) {
        return passwd.getAttribute("value").contains(psw);
    }

    @FindBy(id = "firstname")
    private WebElement first_name;

    public void typeFirstName(String firstname) {
        first_name.sendKeys(firstname);
    }

    public boolean getFirstName(String fn) {
        return first_name.getAttribute("value").contains(fn);
    }

    @FindBy(id = "lastname")
    private WebElement last_name;

    public void typeLastName(String lastname) {
        last_name.sendKeys(lastname);
    }

    public boolean getLastName(String ln) {
        return last_name.getAttribute("value").contains(ln);
    }

    @FindBy(id = "address1")
    private WebElement address1;

    public void typeAddress(String address) {
        address1.sendKeys(address);
    }

    public boolean getAddress(String adrss) {
        return address1.getAttribute("value").contains(adrss);
    }

    @FindBy(id = "city")
    private WebElement city;

    public void typeCity(String city_) {
        city.sendKeys(city_);
    }


    public boolean getCity(String ct) {
        return city.getAttribute("value").contains(ct);
    }

    @FindBy(id = "id_state")
    private WebElement id_state;

    public void selectState(String state) {
        Select select = new Select(id_state);
        select.selectByValue(state);
    }

    public boolean getState(String stt) {
        return id_state.getAttribute("value").contains(stt);
    }

    @FindBy(id = "postcode")
    private WebElement postcode;

    public void typePostcode(String postcode_) {
        postcode.sendKeys(postcode_);
    }

    public boolean getPoscode(String pstcd) {
        return postcode.getAttribute("value").contains(pstcd);
    }

    @FindBy(id = "phone_mobile")
    private WebElement phone_mobile;

    public void typeMobilePhone(String mp) {
        phone_mobile.sendKeys(mp);
    }

    public boolean getMobilePhone(String mobil) {
        return phone_mobile.getAttribute("value").contains(mobil);
    }
}
