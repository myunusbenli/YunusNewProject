package com.benli.tests.day5;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsPractice {
    public static void main(String[] args) {

        //TC #0: FINDELEMENTS
        //1. Open Chrome browser
        //2. Go to https://www.merriam-webster.com/
        //3. Print out the texts of all links
        //4. Print out how many link is missing text
        //5. Print out how many link has text
        //6. Print out how many total link


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement each: listOfLinks) {
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));

        }

        int numberOfLinks = listOfLinks.size();

        driver.close();
    }
}
