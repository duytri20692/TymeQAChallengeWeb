package com.tyme.qa.automation.test.web.stepdefinitions;

import com.tyme.qa.automation.test.web.common.BasePage;
import com.tyme.qa.automation.test.web.pageobject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HomeSteps extends BasePage {
    HomePage homePage = new HomePage(driver);
    @Then("I can see the home page of the Automation test Store")
    public void iCanSeeTheHomePageOfTheAutomationTestStore() {
        Assert.assertTrue(homePage.isHomepageDisplaying(),"Home page not displaying.");
    }

    @And("I can hover my mouse to APPAREL & ACCESSORIES menu")
    public void iCanHoverMyMouseToAPPARELACCESSORIESMenu() {
        homePage.mouseHoverOnCategoryMenuApparelAndAccessories();
    }

    @Then("I can see Shoes and T-shirts categories in APPAREL & ACCESSORIES menu")
    public void iCanSeeShoesAndTShirtsCategoriesInAPPARELACCESSORIESMenu() {
        Assert.assertTrue(homePage.isCategoryTShirtsDisplaying(), "Category TShirts is not Displaying");
    }

    @And("I can click on T-Shirts categories")
    public void iCanClickOnTShirtsCategories() {
        homePage.clickOnCategoryTShirts();
    }
}
