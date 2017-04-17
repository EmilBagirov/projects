package com.amazon.subscriptions;
import com.amazon.BasePage;
import com.amazon.locators.Locators;
import com.amazon.utils.WaitingUtils;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class CreatePage extends BasePage {

    public CreatePage(WebDriver driver) {
        super(driver);
    }

    public static String createAccount(String yourName, String emailGen, String password, String passwordCheck) {
        $(Locators.yourName).sendKeys(yourName);
        $(Locators.email).sendKeys(emailGen);
        $(Locators.password).sendKeys(password);
        $(Locators.passwordCheck).sendKeys(passwordCheck);
        $(Locators.createButton).click();
        System.out.println("\nUser is created: " + emailGen);
        return emailGen;
    }

    public static void updateDelivery(String addressLine1,String city, String state, String zip, String phone) {
        WaitingUtils.setImplicitWait(400,TimeUnit.SECONDS);
        $(Locators.changeCountrySettings).click();
        $(Locators.addressLine1).sendKeys(addressLine1);
        $(Locators.city).sendKeys(city);
        $(Locators.state).sendKeys(state);
        $(Locators.zip).sendKeys(zip);
        $(Locators.phone).sendKeys(phone);
        WaitingUtils.setImplicitWait(400,TimeUnit.SECONDS);
        $(Locators.updateCountrySettingsButton).click();
        System.out.println("\nDelivery info is updated");
    }

    public static void updatePayment(String cardNumber, String cardName) {
        $(Locators.editPaymentMethodButton).click();
        $(Locators.useThisAddressButton).click();
        $(Locators.addACard).click();
        $(Locators.cardNumber).sendKeys(cardNumber);
        $(Locators.cardName).sendKeys(cardName);
        $(Locators.dropDownYear).click();
        $(Locators.expDateYear).click();
        $(Locators.nextButton).click();
        $(Locators.useThisAddressButtonCC).click();
        $(Locators.continueButton).click();
        System.out.println("\nPayment info is updated");
    }
}
