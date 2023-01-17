package com.tyme.qa.automation.test.web.common;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public static WebDriver driver;
    private static String configPathFile = "src\\test\\resources\\testData\\Config.properties";
    protected static String baseURL = ReadPropertiesFileHelper.readPropertiesFile(configPathFile,"baseUrl");
}
