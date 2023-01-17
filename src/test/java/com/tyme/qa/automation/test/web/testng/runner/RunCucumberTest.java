package com.tyme.qa.automation.test.web.testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@AddToCartWithChromeBrowser or @AddToCartWithFirefoxBrowser",
        features = "classpath:features",
        glue = {"com.tyme.qa.automation.test.web.common", "com.tyme.qa.automation.test.web.stepdefinitions", "com.tyme.qa.automation.test.web.testng.runner"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumberreport.html"},
        monochrome = true
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
