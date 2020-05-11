package cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tasks.Search;
import util.Browser;

public class BrowserTest {
    WebDriver dr;

//    //TestNG运行模式从suite-test-class-method
//    @BeforeSuite

    @Parameters({"browser", "url"})
    @BeforeTest
    public void beforeTest(String browser, String url){
        System.out.println("I am BeforeTest.");
        dr = Browser.openBrowser(dr, browser, url);
    }

    @Test
    public void browser() throws InterruptedException {
        Search.search(dr);
    }

    @AfterTest
    public void quit(){
        Browser.closeBrowser(dr);
    }
}
