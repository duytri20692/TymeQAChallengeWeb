package com.tyme.qa.automation.test.web.stepdefinitions;

import com.tyme.qa.automation.test.web.common.BasePage;
import com.tyme.qa.automation.test.web.pageobject.TShirtsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TShirtsSteps extends BasePage {
    TShirtsPage tShirtsPage = new TShirtsPage(driver);

    @Then("I can see T-Shirts page")
    public void iCanSeeTShirtsPage() {
        tShirtsPage.isTShirtsPageDisplaying();
    }

    @And("I can select Sort by Price Low > High on T-Shirt page")
    public void iCanSelectSortByPriceLowHighOnTShirtPage() {
        tShirtsPage.clickOnSortOptionPriceLowToHigh();
    }

    @And("I can verify that all items were sorted by Price Low > High")
    public void iCanVerifyThatAllItemsWereSortedByPriceLowHigh() {
        Assert.assertTrue(tShirtsPage.isAllItemsWereSortedByPriceLowToHigh(), "All Items Were Not Sorted By Price Low To High");
    }

    @Then("I add to Cart an Item on T-shirts")
    public void iAddToCartAnItemOnTShirts() {
        tShirtsPage.clickOnAddToCartButton();
    }
}
