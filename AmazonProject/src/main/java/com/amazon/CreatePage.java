package com.amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class CreatePage extends BasePage {

    static Wait wait;

    public CreatePage(WebDriver driver) {
        super(driver);
    }

    public static void openBrowser(String url) {
        //WaitingUtils.setImplicitWait(5, TimeUnit.SECONDS);
        BasePage.goTo(url);
    }

    public static void createAccount(String yourName, EmailGen emailGen, String password, String passwordCheck) {
        emailGen = new EmailGen();
        $(Locators.yourName).sendKeys(yourName);
        $(Locators.email).sendKeys(emailGen.random());
        $(Locators.password).sendKeys(password);
        $(Locators.passwordCheck).sendKeys(passwordCheck);
        $(Locators.createButton).click();
        //$(Locators.signInEmail).sendKeys(signInEmail);
        //$(Locators.signInPassword).sendKeys(signInPassword);
        //$(Locators.signInButton).click();
    }

    public static void updateDelivery(String addressLine1,String city, String state, String zip, String phone) {
        WaitingUtils.setImplicitWait(400,TimeUnit.SECONDS);
        $(Locators.changeCountrySettings).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.addressLine1));
        $(Locators.addressLine1).sendKeys(addressLine1);
        $(Locators.city).sendKeys(city);
        $(Locators.state).sendKeys(state);
        $(Locators.zip).sendKeys(zip);
        $(Locators.phone).sendKeys(phone);
        WaitingUtils.setImplicitWait(400,TimeUnit.SECONDS);
        $(Locators.updateCountrySettingsButton).click();
        //new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[.=\" Update \"]")));
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(Locators.editPaymentMethodButton));
    }
    public static void updatePayment(String cardNumber, String cardName) {
        $(Locators.editPaymentMethodButton).click();
        $(Locators.useThisAddressButton).click();
        $(Locators.addACard).click();
        $(Locators.cardNumber).sendKeys(cardNumber);
        $(Locators.cardName).sendKeys(cardName);
        //$(Locators.expDateMonth).click();
        $(Locators.dropDownYear).click();
        $(Locators.expDateYear).click();
        $(Locators.nextButton).click();
        $(Locators.useThisAddressButtonCC).click();
        $(Locators.continueButton).click();

    }
}
