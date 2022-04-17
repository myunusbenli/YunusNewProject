package com.benli.tests.day7;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class windowHandlePractice {

    //TC Window Handle Practice
    //1. Create a new class called: WindowHandlePractice
    //2. Create new test and make set ups
    //3. Go to http://practice.cybertekschool.com/windows
    //4. Assert: title is "practice"
    //5. Click to: "Click Here" text
    //6. Switch to new Window
    //7. Assert: Title is "New Window"

    WebDriver driver;

    @BeforeClass
    public void beforeClassWindowHandle(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/");

    }

    @Test
    public void window_test(){



        String actualTitleBeforeClick = driver.getTitle();
        String expectedTitleBeforeClick = "Practice";

        System.out.println("actualTitleBeforeClick = " + actualTitleBeforeClick);

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        String actualTitleAfterClick = driver.getTitle();

        System.out.println("actualTitleAfterClick = " + actualTitleAfterClick);


    }

    @AfterClass
    public void afterClassWindowHandle(){

        driver.close();
    }
}
