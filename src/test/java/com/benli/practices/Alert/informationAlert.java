package com.benli.practices.Alert;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class informationAlert {

    WebDriver driver;

    @BeforeClass
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void informationAlerts(){

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement successfullClick = driver.findElement(By.id("result"));
        System.out.println(successfullClick.isDisplayed());
        System.out.println(successfullClick.getText());
    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
}
