package com.amazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static com.amazon.WebDriverHolder.getDriver;

public class WaitingUtils {


    public static void setImplicitWait(long time, TimeUnit unit) {
        getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

}
