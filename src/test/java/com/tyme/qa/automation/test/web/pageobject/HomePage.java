package com.tyme.qa.automation.test.web.pageobject;

import com.tyme.qa.automation.test.web.common.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebElementHelper {
    @FindBy(xpath = "//img[@title='Automation Test Store']")
    WebElement homepageTitle;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']//a[contains(text(), 'Apparel & accessories')]")
    WebElement categoryMenuApparelAndAccessories;
    @FindBy(xpath = "//ul[@class='nav-pills categorymenu']//a[contains(text(), 'T-shirts')]")
    WebElement categoryTShirts;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isHomepageDisplaying(){
        waitElementVisibility(homepageTitle, 5);
        return homepageTitle.isDisplayed();
    }

    public HomePage mouseHoverOnCategoryMenuApparelAndAccessories(){
        waitElementVisibility(categoryMenuApparelAndAccessories, 5);
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryMenuApparelAndAccessories).perform();
        return this;
    }

    public boolean isCategoryTShirtsDisplaying(){
        waitElementVisibility(categoryTShirts, 5);
        return categoryTShirts.isDisplayed();
    }

    public TShirtsPage clickOnCategoryTShirts(){
        waitElementVisibility(categoryTShirts, 5);
        categoryTShirts.click();
        return new TShirtsPage(driver);
    }
}
