package com.amazon.users;
import com.amazon.subscriptions.CreatePage;
import com.amazon.utils.EmailGen;
import com.amazon.utils.SaveToFile;
import org.openqa.selenium.WebDriver;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Unsubscribed_User extends CreatePage {

    public Unsubscribed_User(WebDriver driver) {
        super(driver);
    }

    public static String create_Unsubscribed_User() throws IOException {
        String email= new EmailGen().random();
        //String email = "b3cgmx@yopmail.com";
        String pathUnsubscribed = "D:\\emil\\PROJECTS\\java_projects\\AmazonProject(v2.0)\\Users\\unsubscribed.txt";
        String yourName = "Qarea Texture";
        String password = "qqqqqq";
        String passwordCheck = "qqqqqq";
        String url_amazon = "https://www.amazon.com/ap/register?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=" +
                "http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs." +
                "openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs." +
                "openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid." +
                "pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon." +
                "com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust";
        open(url_amazon);
        String unsubscribed_User = createAccount (yourName, email, password, passwordCheck);
        //SaveToFile.saveTo(pathUnsubscribed, unsubscribed_User);
        return unsubscribed_User;
    }
}
