package com.instawork.in.Page;

import com.instawork.in.Utility.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BasePage {


    public  static WebDriver driver;

    public static void initConfiguration(String browser) {

        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            System.out.println("Launching Firefox : ");
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/com/instawork/in/drivers/chromedriver");
            driver = new ChromeDriver();
            System.out.println("Launching chrome ");
        }



        driver.get(Constants.url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.implictwait, TimeUnit.SECONDS);
    }

public static void quitBrowser(){
driver.quit();

}

}
