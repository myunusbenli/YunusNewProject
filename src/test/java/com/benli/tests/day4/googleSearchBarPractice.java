package com.benli.tests.day4;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class googleSearchBarPractice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("LPL Financial");

        System.out.println(driver.findElement(By.className("UUbT9")).isDisplayed());

        driver.close();
    }
}
