package com.amazon.subscriptions;
import com.amazon.locators.Locators;
import static com.amazon.BasePage.$;

public class PurchaseSubscription {
    /*purchase subscription with 2 Days FREE*/
    public static void purchase2Days() {
        $(Locators.Radio2DaysButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(Locators.Start2DaysButton).click();
        $(Locators.continueButton).click();
        $(Locators.orderPlace).click();
        System.out.println("\nSubscription purchased");
    }

    /*purchase subscription with 7 Days FREE*/
    public static void purchase7Days() {
        $(Locators.Radio7DaysButton).click();
        if( $(Locators.orderVisible).isDisplayed()){
            $(Locators.orderVisible).click();
        }else{
            $(Locators.orderInvisible).click();
        }
        $(Locators.continueButton).click();
        $(Locators.orderPlace).click();
        System.out.println("\nSubscription purchased");
    }
}
