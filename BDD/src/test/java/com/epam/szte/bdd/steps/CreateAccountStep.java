package com.epam.szte.bdd.steps;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.CreateAccountPage;
import io.cucumber.java.en.When;

public class CreateAccountStep {
    private CreateAccountPage CP = new CreateAccountPage(Hooks.driver);
    @When("I type in email")
    public void iTypeInEmail() {
        CP.typeInEmail();
    }
}
