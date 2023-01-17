package com.tyme.qa.automation.test.web.pageobject;

import com.tyme.qa.automation.test.web.common.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends WebElementHelper {
    @FindBy(xpath = "//a[text() = 'Description']")
    WebElement productDetailPageDescription;

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductDetailPageDisplaying(){
        waitElementVisibility(productDetailPageDescription, 10);
        return productDetailPageDescription.isDisplayed();
    }
}
