package com.benli.tests.day2_locators_gettext_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class etsyPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();



        driver.get("https://www.etsy.com");

        driver.manage().window().maximize();

        System.out.println(driver.findElement(By.id("desktop-category-nav")).getAttribute("id"));
        System.out.println(driver.findElement(By.id("desktop-category-nav")).getText());

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon" + Keys.ENTER);

        //driver.findElement(By.xpath("//button[@type='submit']")).click();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        Thread.sleep(1000);

        driver.close();
    }
}
