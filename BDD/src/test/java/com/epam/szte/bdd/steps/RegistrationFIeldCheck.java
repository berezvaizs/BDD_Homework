package com.epam.szte.bdd.steps;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.RegistrationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.epam.szte.bdd.hooks.Hooks.driver;
import static org.junit.Assert.assertTrue;

public class RegistrationFIeldCheck {
    private final RegistrationPage registrationPage = new RegistrationPage(driver);

    @Then("I will see the Registration page")
    public void RegistrationPageCheck() {
        assertTrue("We are not on the registration page", registrationPage.getRegistrationPage());
    }

    @Then("the customer_firstname's field display value should be 'Zsombor'")
    public void customer_firstnameCheck() {
        assertTrue("Incorrect First name", registrationPage.getCustomerFirstname("Zsombor"));
    }

    @Then("the customer_lastname's field display value should be 'Berezvai'")
    public void customer_lastnameCheck() {
        assertTrue("Incorrect Last name", registrationPage.getCustomerLastName("Berezvai"));
    }

    @Then("the password's field display value should be '1234567'")
    public void passwordCheck() {
        assertTrue("Incorrect password", registrationPage.getPassword("1234567"));
    }

    @Then("the firstname's field display value should be 'Zsombor'")
    public void firstnameCheck() {
        assertTrue("Incorrect First name", registrationPage.getFirstName("Zsombor"));
    }

    @Then("the lastname's field display value should be 'Berezvai'")
    public void lastnameCheck() {
        assertTrue("Incorrect Last name", registrationPage.getLastName("Berezvai"));
    }

    @Then("the address's field display value should be 'Kiss Ferenc utca 37'")
    public void addressCheck() {
        assertTrue("Incorrect address", registrationPage.getAddress("Kiss Ferenc utca 37"));
    }

    @Then("the city's field display value should be 'Debrecen'")
    public void cityCheck() {
        assertTrue("Incorrect city", registrationPage.getCity("Debrecen"));
    }

    @Then("the state's field display value should be '9'")
    public void id_stateCheck() {
        assertTrue("Incorrect state", registrationPage.getState("9"));
    }

    @Then("the postcode's field display value should be '64352'")
    public void postcodeCheck() {
        assertTrue("Incorrect zip code", registrationPage.getPoscode("64352"));
    }

    @Then("the phone_mobile's field display value should be '0630406724'")
    public void phone_mobileCheck() {
        assertTrue("Incorrect mobile phone number", registrationPage.getMobilePhone("0630406724"));
    }

    @When("I scroll to the top")
    public void iScrollToTheTop() {
        WebElement element = driver.findElement(By.id("customer_firstname"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }
}
