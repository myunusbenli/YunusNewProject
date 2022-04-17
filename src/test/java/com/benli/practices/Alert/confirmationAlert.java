package com.benli.practices.Alert;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class confirmationAlert {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void informationAlerts() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(1000);
        WebElement acceptClick = driver.findElement(By.id("result"));

        System.out.println("acceptClick.getText() = " + acceptClick.getText());
    }

    @Test
    public void dismissClick() throws InterruptedException {

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        Thread.sleep(1000);
        WebElement dismissedClick = driver.findElement(By.id("result"));

        System.out.println("dismissedClick.getText() = " + dismissedClick.getText());

    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
}
