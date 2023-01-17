package com.tyme.qa.automation.test.web.pageobject;

import com.tyme.qa.automation.test.web.common.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TShirtsPage extends WebElementHelper {
    @FindBy(xpath = "//title")
    WebElement tShirtsPageTitle;
    @FindBy(xpath = "//select[@id='sort']/option[text() = 'Price Low > High']")
    WebElement sortOptionPriceLowToHigh;
    @FindBy(xpath = "//div[@class='thumbnails grid row list-inline']//div[@class='oneprice']")
    List<WebElement> allPrices;
    @FindBy(xpath = "//div[@class='thumbnails grid row list-inline']//a[@title='Add to Cart']")
    WebElement addToCartButton;

    public TShirtsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTShirtsPageDisplaying(){
        return tShirtsPageTitle.getText().equals("T-shirts");
    }

    public TShirtsPage clickOnSortOptionPriceLowToHigh(){
        sortOptionPriceLowToHigh.click();
        return this;
    }

    public boolean isAllItemsWereSortedByPriceLowToHigh(){
        List<String> pricesListString = new ArrayList<>();
        allPrices.forEach((price) -> {
            pricesListString.add(price.getText().trim().replace("$",""));
        });
        double[] doubleValues = Arrays.stream(pricesListString.toArray(new String[0]))
                .mapToDouble(Double::parseDouble)
                .toArray();
        return isDoubleArraySortedAscending(doubleValues, doubleValues.length);
    }

    public TShirtsPage clickOnAddToCartButton(){
        addToCartButton.click();
        return this;
    }
}
