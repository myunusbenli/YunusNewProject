package com.benli.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookP4 {
    public static void main(String[] args) {

        //TC #4: Facebook header verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        //3. Verify “Create a page” link href value contains text:
        //      Expected: “registration_form”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        String actual = driver.findElement(By.className("_8esh")).getAttribute("href");
        String expectedContain = "registration_form";

        if (actual.contains(expectedContain)){
            System.out.println("verified");
        }else {
            System.out.println("not verified");
        }

        driver.close();

    }
}
