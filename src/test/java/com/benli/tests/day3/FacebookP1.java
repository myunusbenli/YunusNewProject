package com.benli.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookP1 {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: Facebook title verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        Thread.sleep(1000);

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("title verified");
        }else {
            System.out.println("title not verified");
        }

        driver.close();
    }
}
