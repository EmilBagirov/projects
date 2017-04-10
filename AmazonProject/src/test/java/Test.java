import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.gdata.client.authn.oauth.*;
import com.google.gdata.client.spreadsheet.*;
import com.google.gdata.data.*;
import com.google.gdata.data.batch.*;
import com.google.gdata.data.spreadsheet.*;
import com.google.gdata.util.*;
import java.io.IOException;
import java.net.*;
import java.util.*;


public class Test {

    static WebDriver driver;
    static WebElement element;

    public static void main(String args[]) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
        //sign in

        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("Email")).sendKeys("qareanim@gmail.com");
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("Passwd")).sendKeys("Qareanim");
        driver.findElement(By.id("signIn")).click();
        //sleep till page is loaded --necessary
        Thread.sleep(10000);

        driver.get("https://docs.google.com/spreadsheets/d/1iiTw8ttuMjrcruyXH8IXKEap4WmuBg4Vm88SlyYgu3o/edit#gid=0");



    }
}
