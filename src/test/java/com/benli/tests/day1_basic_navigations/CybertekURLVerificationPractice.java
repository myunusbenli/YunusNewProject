package com.benli.tests.day1_basic_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekURLVerificationPractice {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Cybertek practice tool verifications
        //1. Open Chrome browser
        //2. Go to https://practice.cybertekschool.com
        //3. Verify URL contains
        //Expected: cybertekschool
        //4. Verify title:
        //       Expected: Practice
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com");

        String expectedURL = "http://practice.cybertekschool.com/";

        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        Thread.sleep(1000);

        if (actualURL.equals(expectedURL)){
            System.out.println("url verified");
        }else {
            System.out.println("url failed");
        }

        driver.close();
    }
}
