package com.amazon.users;
import com.amazon.utils.SaveToFile;
import org.openqa.selenium.WebDriver;
import java.io.FileNotFoundException;
import java.io.IOException;
import static com.amazon.subscriptions.EndSubscription.endSubscription;

public class Expired_User_2days extends Subscribed_User_2days {
    public Expired_User_2days(WebDriver driver) {
        super(driver);
    }

    public static String create_Expired_User_2days() throws IOException {
        String pathSubscribed_2days = "D:\\emil\\PROJECTS\\java_projects\\AmazonProject(v2.0)\\Users\\expired_2days.txt";
        String expired_User = create_Subscribed_User_2days();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endSubscription();
        //SaveToFile.saveTo(pathSubscribed_2days, expired_User);
        return expired_User;
    }
}
