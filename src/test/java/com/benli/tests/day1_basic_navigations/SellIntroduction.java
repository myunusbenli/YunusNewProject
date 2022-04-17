package com.benli.tests.day1_basic_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SellIntroduction {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();



        driver.get("https://www.google.com");

        driver.manage().window().maximize();    //this makes it the browser cover entire screen

        //driver.manage().window().fullscreen();  //this makes it like watching a full screen movie



        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@class='MV3Tnb'][2]")).click();

        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.close();



    }
}
