package com.benli.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookP2 {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        //3. Enter incorrect username
        //4. Enter incorrect password
        //5. Verify title changed to:
        //      Expected: “Log into Facebook”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        Thread.sleep(1000);

        driver.findElement(By.id("email")).sendKeys("muhammed");

        driver.findElement(By.id("pass")).sendKeys("benli" + Keys.ENTER);

        driver.findElement(By.xpath("//button[@id='u_0_d_pf']")).click();

        Thread.sleep(5000);

        String expected = "Log into Facebook";
        String actual = driver.getTitle();

        if (actual.equals(expected)){
            System.out.println("verified");
        }else {
            System.out.println("not verified");
        }
        Thread.sleep(2000);
        driver.close();
    }
}
