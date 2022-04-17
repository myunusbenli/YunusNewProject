package com.benli.tests.day4;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonCSSPractice {
    public static void main(String[] args) {

        //TC #3:  Amazon link number verification
        //1. Open Chrome browser
        //2. Go to https://www.amazon.com
        //3. Enter search term (use cssSelector to locate search box)
        //4. Verify title contains search term

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearchBar.sendKeys("wooden spoon" + Keys.ENTER);

        String expected = "wooden spoon";
        String actual = driver.getTitle();

        if (actual.contains(expected)){
            System.out.println("verified");
        }else {
            System.out.println("not verified");
        }

        driver.close();

    }
}
