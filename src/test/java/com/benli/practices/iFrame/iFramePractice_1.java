package com.benli.practices.iFrame;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iFramePractice_1 {

    WebDriver driver;

    @BeforeClass
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/iframe");

    }
    @Test
    public void iframe(){
        WebElement innerFrame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));

        driver.switchTo().frame(innerFrame);

        WebElement contentText = driver.findElement(By.xpath("//body[@id='tinymce']/p"));

        String actual = contentText.getText();
        String expected = "Your content goes here.";

        if (actual.equals(expected)){
            System.out.println("PASSED!!");
        }else {
            System.out.println("FAILED");
        }
    }
    @AfterClass
    public void afterClass(){

        driver.close();
    }
}
