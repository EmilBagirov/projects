import com.amazon.CreatePage;
import com.amazon.EmailGen;
import com.amazon.PurchaseSubscription;
import com.amazon.WaitingUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.amazon.BasePage.closeBrowser;
import static com.amazon.BasePage.goTo;
import static com.amazon.CreatePage.*;
import static com.amazon.PurchaseSubscription.purchase;
import static com.amazon.WebDriverHolder.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CreateAmazonUser {
    public static CreatePage createPage;
    public static PurchaseSubscription purchaseSubscription;
    public static EmailGen emailGen;
    public static WaitingUtils waitingUtils;

    @Before
    public  void setUp() {
        //System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\GeckoDriver\\geckodriver.exe");
        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        setDriver(driver);
        createPage = new CreatePage(driver);
    }

    @Test
    public void createAmazonUser(){
        openBrowser("https://www.amazon.com/ap/register?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
        createAccount ("Qarea Texture", emailGen,"qqqqqq", "qqqqqq");
        //waitingUtils.setImplicitWait(1, TimeUnit.MINUTES);
        goTo("https://www.amazon.com/mn/dcw/myx.html#/home/settings/payment");
        updateDelivery("165 Pleasant St","Framingham","MA", "01701", "1111111111");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        updatePayment("4532153940224328", "Qarea Texture");
    }

    @Test
    public void purchaseSubscription() {
        goTo("https://www.amazon.com/dp/B06XFY3H37");
        purchase();
    }

    @AfterClass
    public static void tearDown() {
        closeBrowser();
    }
}
