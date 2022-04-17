package com.benli.tests.day5;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_02_FindElements_Apple {
    public static void main(String[] args) {

        //TC #02: FINDELEMENTS_APPLE
        //1. Open Chrome browser
        //2. Go to https://www.apple.com
        //3. Click to iPhone
        //4. Print out the texts of all links
        //5. Print out how many link is missing text
        //6. Print out how many link has text
        //7. Print out how many total link

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.apple.com");

        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();

        List<WebElement> appleTexts = driver.findElements(By.xpath("//link"));

        for (WebElement each: appleTexts) {
            if (each.getText().isEmpty()){
                System.out.println("empty text");
            }else {
                System.out.println(each.getText());
            }

        }
        driver.close();


    }
}
