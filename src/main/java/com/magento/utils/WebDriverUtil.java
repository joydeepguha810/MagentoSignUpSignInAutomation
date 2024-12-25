package com.magento.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {
    public static WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
        return new ChromeDriver();
    }
}
