package com.amazon.users;
import com.amazon.utils.SaveToFile;
import org.openqa.selenium.WebDriver;
import java.io.FileNotFoundException;
import java.io.IOException;
import static com.amazon.subscriptions.PurchaseSubscription.purchase7Days;

public class Subscribed_User_7days extends Unsubscribed_User{

    public Subscribed_User_7days(WebDriver driver) {
        super(driver);
    }

    public static String create_Subscribed_User_7days () throws IOException {
        String pathSubscribed_7days = "D:\\emil\\PROJECTS\\java_projects\\AmazonProject(v2.0)\\Users\\subscribed_7days.txt";
        String url_payment_settings = "https://www.amazon.com/mn/dcw/myx.html#/home/settings/payment";
        String purchase_Texture = "https://www.amazon.com/dp/B06XFY3H37";
        String addressLine1 = "165 Pleasant St";
        String city = "Framingham";
        String state = "MA";
        String zip = "01701";
        String phone = "1111111111";
        String cardNumber = "4532153940224328";
        String cardName = "Qarea Texture";

        String subscribed_user = create_Unsubscribed_User();
        open(url_payment_settings);
        updateDelivery(addressLine1, city, state, zip, phone);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        updatePayment(cardNumber, cardName);
        open(purchase_Texture);
        purchase7Days();
        //SaveToFile.saveTo(pathSubscribed_7days, subscribed_user);
        return subscribed_user;
    }
}
