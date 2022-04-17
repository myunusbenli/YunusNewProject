package com.benli.tests.day5;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P1_Merriam_Webster {
    public static void main(String[] args) {

        //TC #0: FINDELEMENTS
        //1. Open Chrome browser
        //2. Go to https://www.merriam-webster.com/
        //3. Print out the texts of all links
        //4. Print out how many link is missing text
        //5. Print out how many link has text
        //6. Print out how many total link

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.merriam-webster.com/");

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement each : listOfLinks) {
            if (each.getText().isEmpty()){
                System.out.println("empty text");

            }else {
                System.out.println(each.getText());
            }
        }

            driver.close();


    }
}
