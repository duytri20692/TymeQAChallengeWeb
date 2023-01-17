package com.tyme.qa.automation.test.web.stepdefinitions;

import com.tyme.qa.automation.test.web.common.BasePage;
import com.tyme.qa.automation.test.web.common.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class InitSteps extends BasePage {
    @Given("As the EndUser, Given I can open Chrome")
    public void asTheEndUserGivenICanOpenChrome() {
        Hooks.setupChromeDriver();
    }

    @And("I access automation test store page")
    public void iAccessAutomationTestStorePage() {
        Hooks.openURL(baseURL);
    }

    @Given("As the EndUser, Given I can open Firefox")
    public void asTheEndUserGivenICanOpenFirefox() {
        Hooks.setupFirefoxDriver();
    }
}
