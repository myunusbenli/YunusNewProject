package com.benli.tests.day2_locators_gettext_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_back_and_forward_navigations {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Click to Gmail from top right.
        //4- Verify title contains:
        //      Expected: Gmail
        //5- Go back to Google by using the .back();
        //6- Verify title equals:
        //      Expected: Google

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        //driver.findElement(By.linkText("Gmail")).click();

        driver.findElement(By.className("gb_d")).click();

        //driver.findElement(By.xpath("//a[@class='gb_d']")).click();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.navigate().back();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.close();
    }
}
