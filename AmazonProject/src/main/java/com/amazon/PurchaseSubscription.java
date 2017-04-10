package com.amazon;


import org.openqa.selenium.WebElement;

import static com.amazon.BasePage.$;
import static com.amazon.Locators.order;
import static com.amazon.Locators.yourName;

public class PurchaseSubscription {

    public static void purchase () {
        $(Locators.order).click();
        $(Locators.continueButton).click();
        $(Locators.order).click();
    }
}
