package com.benli.practices.Alert;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class promptAlert {
    WebDriver driver;

    @BeforeClass
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void promptAlerts1() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        Alert alert = driver.switchTo().alert();

        Thread.sleep(1000);
        alert.sendKeys("asdasd");

        //alert.sendKeys("please, confirm it!");

        Thread.sleep(2000);

        System.out.println("driver.findElement(By.id(\"result\")) = " + driver.findElement(By.id("result")).getText());

    }
//    @Test
//    public void promptAlerts2() throws InterruptedException {
//
//
//
//        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//
//        Alert alert = driver.switchTo().alert();
//
//        alert.accept();
//
//
//
//        System.out.println("driver.findElement(By.id(\"result\")) = " + driver.findElement(By.id("result")).getText());
//    }
    @Test
    public void promptAlerts3() throws InterruptedException {



        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        Alert alert = driver.switchTo().alert();

        alert.dismiss();



        System.out.println("driver.findElement(By.id(\"result\")) = " + driver.findElement(By.id("result")).getText());
    }

    @AfterClass
    public void afterClass(){
        driver.close();
    }
}
