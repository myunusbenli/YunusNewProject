package com.benli.tests.day7;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alert_Intro {

    WebDriver driver;

    //TC #1 Information alert practice
    //1. open browser
    //2. go to website "http://practice.cybertekschool.com/javascript_alerts"
    //3. click to "click for js alert" button
    //4. click to OK button from alert
    //5. Verify "you successfully clicked an alert" text is displayed.

    @BeforeClass
    public void alertBeforeClass() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //driver.manage().timeouts().getImplicitWaitTimeout();
        Thread.sleep(1000);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void information_alert_test(){
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();

        Alert alert = driver.switchTo().alert();

        alert.accept();

        //verify if you click the alert
        WebElement resultText = driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));

        Assert.assertTrue(resultText.isDisplayed());

    }
    @AfterClass
    public void closeMethod(){
        driver.close();
    }
}
