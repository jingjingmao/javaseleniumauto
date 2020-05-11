package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    public static void search(WebDriver dr) throws InterruptedException {
        dr.findElement(By.id("kw")).clear();
        dr.findElement(By.id("kw")).sendKeys("selenium");
        dr.findElement(By.id("su")).click();
        Thread.sleep(2000);
    }
}
