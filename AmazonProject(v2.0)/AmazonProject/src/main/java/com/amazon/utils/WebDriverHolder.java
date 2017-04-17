package com.amazon.utils;

import org.openqa.selenium.WebDriver;

public class WebDriverHolder {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        WebDriverHolder.driver = driver;
    }
}
