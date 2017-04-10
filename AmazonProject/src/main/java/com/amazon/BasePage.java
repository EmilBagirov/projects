package com.amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.amazon.WebDriverHolder.getDriver;

public abstract class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public static void goTo (String url) {
        getDriver().get(url);
    }

    public static WebElement $ (By selector) {
        return getDriver().findElement(selector);
    }

    public static void closeBrowser () {
        getDriver().quit();
    }


}
