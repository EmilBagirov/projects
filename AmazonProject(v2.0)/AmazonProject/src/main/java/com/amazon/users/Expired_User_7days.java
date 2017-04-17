package com.amazon.users;
import com.amazon.utils.SaveToFile;
import org.openqa.selenium.WebDriver;
import java.io.FileNotFoundException;
import java.io.IOException;
import static com.amazon.subscriptions.EndSubscription.endSubscription;

public class Expired_User_7days extends Subscribed_User_7days{
    public Expired_User_7days(WebDriver driver) {
        super(driver);
    }

    public static String create_Expired_User_7days() throws IOException {
        String pathSubscribed_7days = "D:\\emil\\PROJECTS\\java_projects\\AmazonProject(v2.0)\\Users\\expired_7days.txt";
        String expired_User = create_Subscribed_User_7days();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endSubscription();
        //SaveToFile.saveTo(pathSubscribed_7days, expired_User);
        return expired_User;
    }
}
