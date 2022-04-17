package com.benli.tests.day6;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_AppleTask {
    public static void main(String[] args) {

        //TC #03: FINDELEMENTS_APPLE
        //1. Open Chrome browser
        //2. Go to https://www.apple.com
        //3. Click to all of the headers one by one
                //a. Mac, iPad, iPhone, Watch, TV, Music, Support
        //4. Print out the titles of the each page
        //5. Print out total number of links in each page
        //6. While in each page:
                //a. Print out how many link is missing text TOTAL
                //b. Print out how many link has text TOTAL

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.apple.com");

        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        //we started from 1 and finished before last one because we didn't want to click these links
        for (int eachLink = 2; eachLink < headerLinks.size()-2; eachLink++) {
            //System.out.println(headerLinks.get(eachLink).getText());
            headerLinks.get(eachLink).click();

            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        }

        driver.close();
    }
}
