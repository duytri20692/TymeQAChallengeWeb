package com.tyme.qa.automation.test.web.stepdefinitions;

import com.tyme.qa.automation.test.web.common.BasePage;
import com.tyme.qa.automation.test.web.pageobject.ProductDetailPage;
import io.cucumber.java.en.And;

public class ProductDetailSteps extends BasePage {
    ProductDetailPage productDetailPage = new ProductDetailPage(driver);

    @And("I can see the item detailed information")
    public void iCanSeeTheItemDetailedInformation() {
        productDetailPage.isProductDetailPageDisplaying();
    }
}
