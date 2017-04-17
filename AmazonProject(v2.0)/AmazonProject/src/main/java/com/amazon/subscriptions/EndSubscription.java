package com.amazon.subscriptions;
import com.amazon.locators.Locators;

import static com.amazon.BasePage.$;
import static com.amazon.BasePage.open;

public class EndSubscription {

    public static void endSubscription () {
        $(Locators.manageYourSubscription).click();
        $(Locators.manageSubscription).click();
        $(Locators.endSubscription).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if ($(Locators.endSubscriptionPopUp).isDisplayed()){
            $(Locators.endSubscriptionSubmit).click();
            System.out.println("\nSubscription cancelled");
        }
        else {
            System.out.println("\nSubscription NOT cancelled");
        }
    }
}
