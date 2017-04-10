package com.amazon;

import org.openqa.selenium.By;

public class Locators {
    public static final By yourName = By.id("ap_customer_name");
    public static final By email = By.id("ap_email");
    public static final By password = By.id("ap_password");
    public static final By passwordCheck = By.id("ap_password_check");
    public static final By createButton = By.id("continue");
    public static final By signInEmail = By.cssSelector("input[id=\"ap_email\"]");
    public static final By signInPassword = By.cssSelector("input[tabindex=\"2\"]");
    public static final By signInButton = By.cssSelector("input[id=\"signInSubmit\"]");
    public static final By changeCountrySettings = By.xpath("//span[.=\' Change \']");
    public static final By addressLine1 = By.cssSelector("input[id=\"adr_AddressLine1\"]");
    public static final By city = By.cssSelector("input[id=\"adr_City\"]");
    public static final By state = By.cssSelector("input[id=\"adr_StateOrRegion\"]");
    public static final By zip = By.cssSelector("input[id=\"adr_PostalCode\"]");
    public static final By phone = By.cssSelector("input[id=\"adr_PhoneNumber\"]");
    public static final By updateCountrySettingsButton = By.xpath("//span[.=\" Update \"]");
    public static final By editPaymentMethodButton = By.xpath("//span[.=\" Edit Payment Method \"]");
    public static final By useThisAddressButton = By.cssSelector("button[id=\"pmts-id-3-announce\"]>span");
    public static final By addACard = By.xpath("//span[.=\"Add a card\"]");
    public static final By cardNumber = By.cssSelector("input[name=\"addCreditCardNumber\"]");
    public static final By cardName = By.cssSelector("input[name=\"accountHolderName\"]");
    public static final By dropDownYear = By.cssSelector("select[name=\"expirationYear\"]+ span [class~=\"a-dropdown-prompt\"]");
    //public static final By expDateMonth = By.cssSelector("a[id=\"pmts-id-94_11\"]");
    public static final By expDateYear = By.cssSelector("a[id=\"pmts-id-16_19\"]");
    public static final By nextButton = By.cssSelector("button[id=\"pmts-id-22-announce\"]");
    public static final By useThisAddressButtonCC = By.xpath("//*[text()=\"Use this address\"]");
    public static final By continueButton = By.cssSelector("span[class=\"a-button a-button-span12 a-button-primary pmts-btn-prim-med-ra pmts-continue-link a-button-primary pmts-amzn-btn\"]");
    public static final By order = By.cssSelector("input[aria-labelledby=\"a-autoid-4-announce\"]");
}