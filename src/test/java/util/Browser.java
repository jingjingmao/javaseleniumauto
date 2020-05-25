package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Browser {
    @BeforeTest
    public static WebDriver openBrowser(WebDriver dr, String browser, String url){
        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "./chromedriver");
            dr = new ChromeDriver();
        } else if (browser.equals("firefox")){
            System.setProperty("webdriver.firefox.driver", "./geckodriver");
            dr = new FirefoxDriver();
        } else {
            System.out.println("Browser is not supported.");
        }

        dr.manage().window().maximize();
        dr.get(url);
        return dr;
    }

    @AfterTest
    public static void closeBrowser(WebDriver dr){
        dr.quit();
    }
}
