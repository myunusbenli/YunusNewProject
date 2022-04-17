package com.benli.tests.day7;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iFramePractice1 {

    WebDriver driver;
    Assert assertion;

    //TC #4: iFrame practice
    //1. Create a new class called: IFramePractice
    //2. Create new test and make set ups
    //3. Go to: http://practice.cybertekschool.com/iframe
    //4. Assert: "your content goes here." Text is displayed
    //5. Assert: "An iFrame containing the TinyMCE WYSIWYG Editor

    @BeforeClass
    public void beforeClassIframePractice(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/iframe");

    }

    @Test
    public void tc4_iframe_practice(){

        //1. changing to Iframe by index number: we pass index number
        //driver.switchTo().frame(0);

        //2. locate as a web element to switch
        //WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        //driver.switchTo().frame(iframe);

        //3. If <iframe> tag has id or name attribute, we can pass its attribute value as a string into
        // .switchTo().frame() method directly
        driver.switchTo().frame("mce_0_ifr");

        WebElement yourContentGoesHere = driver.findElement(By.xpath("//p"));

        assertion.assertTrue(yourContentGoesHere.isDisplayed());


        driver.switchTo().parentFrame();
        WebElement headerText = driver.findElement(By.xpath("//h3"));

        assertion.assertTrue(headerText.isDisplayed());

    }
    @AfterClass
    public void afterClassIframe(){
        driver.close();
    }
}
