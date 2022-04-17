package com.benli.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookP3 {
    public static void main(String[] args) {

        //TC #3: Facebook header verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        //3. Verify header text is as expected:
        //      Expected: “Connect with friends and the world around you on Facebook.”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        String actual = driver.findElement(By.className("_8eso")).getText();
        System.out.println("actual = " + actual);

        String expected = "Connect with friends and the world around you on Facebook.";

        if (actual.equals(expected)){
            System.out.println("verified");
        }else {
            System.out.println("not verified");
        }

        driver.close();
    }
}
