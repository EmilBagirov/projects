package com.amazon.utils;
import java.util.concurrent.TimeUnit;
import static com.amazon.utils.WebDriverHolder.getDriver;

public class WaitingUtils {


    public static void setImplicitWait(long time, TimeUnit unit) {
        getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

}
