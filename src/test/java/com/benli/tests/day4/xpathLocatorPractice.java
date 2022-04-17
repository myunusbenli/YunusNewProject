package com.benli.tests.day4;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xpathLocatorPractice {
    public static void main(String[] args) {

        //TC #6:  XPATH LOCATOR practice
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        //3. Click on Button 1
        //4. Verify text displayed is as expected:
        //          Expected: “Clicked on button one!”

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        driver.findElement(By.xpath("//button[@onclick='button1()']")).click();

        String expected = "Clicked on button one!";
        String actual = driver.findElement(By.xpath("//p[@id='result']")).getText();

        if (actual.equals(expected)){
            System.out.println("verified");
        }else {
            System.out.println("not verified");
        }

        driver.close();

    }
}
