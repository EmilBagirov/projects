package Amazon_User_creation;
import com.amazon.utils.WebDriverHolder;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import static com.amazon.BasePage.closeBrowser;
import static com.amazon.users.Unsubscribed_User.create_Unsubscribed_User;
import static com.amazon.utils.WebDriverHolder.*;


public class CreateUnsubscribedUser {

    @Before
    public  void setUp() {
        setDriver(driver);
        driver = new ChromeDriver();
    }

    @Test
    public void createAmazonUser() throws IOException {
        create_Unsubscribed_User();
    }

    @AfterClass
    public static void tearDown() {
        closeBrowser();
    }
}
