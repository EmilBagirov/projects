package Amazon_User_creation;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import static com.amazon.BasePage.closeBrowser;
import static com.amazon.utils.WebDriverHolder.driver;
import static com.amazon.users.Expired_User_2days.create_Expired_User_2days;
import static com.amazon.utils.WebDriverHolder.setDriver;

public class CreateExpiredUser_2days {

    @Before
    public  void setUp() {
        setDriver(driver);
        driver = new ChromeDriver();
    }

    @Test
    public void createAmazonUser() throws IOException {
        create_Expired_User_2days();
    }

    /*@AfterClass
    public static void tearDown() {
        closeBrowser();
    }*/
}
