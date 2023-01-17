package com.tyme.qa.automation.test.web.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WebElementHelper {
    protected WebDriver driver;

    public WebElementHelper(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void waitElementVisibility(WebElement element, int timeout){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sleepInSeconds(int seconds) {
        try {
            Thread.sleep((long)(seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isDoubleArraySortedAscending(double arr[], int n)
    {
        if (n == 1 || n == 0)
            return true;
        if (arr[n - 1] < arr[n - 2])
            return false;
        return isDoubleArraySortedAscending(arr, n - 1);
    }
}
