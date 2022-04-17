package com.benli.tests.day7;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class windowHandlePractice2 {

    //TC-6 WINDOW HANDLE PRACTICE
        //1. Create a new test and make set ups
        //2. Go to: https://www.amazon.com
        //3. copy paste the lines from below into your class
        //4. create a logic to switch to the tab where etsy.com is open
        //5. assert: title contains "Etsy"

    WebDriver driver;

    @BeforeClass
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
    }

    @Test
    public void multiple_window_test(){
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        for (String each: driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("driver.getTitle() = " + driver.getTitle());

        }
    }

    @AfterClass
    public void afterClass(){
        driver.close();
    }

}
