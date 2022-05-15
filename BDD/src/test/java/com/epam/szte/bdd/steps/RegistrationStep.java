package com.epam.szte.bdd.steps;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.LoginPage;
import com.epam.szte.bdd.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class RegistrationStep {
    private final LoginPage loginPage = new LoginPage(Hooks.driver);
    private final RegistrationPage registrationPage = new RegistrationPage(Hooks.driver);

    @When("I type in Email address field")
    public void typeInEmail() {
        loginPage.writeCreateAccountEmail("zsombor.berezvai@gmail.com");
    }

    @And("I select the Create Account button")
    public void selectTheCreateAccount() {
        loginPage.clickCreateAccountButton();
    }


    @When("I type in customerFirstName")
    public void typeInCustomerFirstName() {
        registrationPage.typeCustomerFirstName("Zsombor");
    }

    @And("I type in customerLastName")
    public void typeInCustomerLastName() {
        registrationPage.typeCustomerLastName("Berezvai");
    }

    @And("I type in password")
    public void typeInPassword() {
        registrationPage.typePassword("1234567");
    }

    @And("I type in firstName")
    public void typeInFirstName() {
        registrationPage.typeFirstName("Zsombor");
    }

    @And("I type in lastName")
    public void typeInLastName() {
        registrationPage.typeLastName("Berezvai");
    }

    @And("I type in address")
    public void typeInAddress() {
        registrationPage.typeAddress("Kiss Ferenc utca 37");
    }

    @And("I type in City")
    public void typeInCity() {
        registrationPage.typeCity("Debrecen");
    }

    @And("I select from State")
    public void SelectFromState() {
        registrationPage.selectState("9");
    }

    @And("I type in Postcode")
    public void typeInPostcode() {
        registrationPage.typePostcode("64352");
    }

    @And("I type in Mobile phone")
    public void iTypeInMobilePhone() {
        registrationPage.typeMobilePhone("0630406724");
    }


}
