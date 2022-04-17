package com.benli.tests.day1_basic_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");
        driver.manage().window().maximize();

        //expected title
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //actual title
        String actualTitle = driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        if (expectedTitle.equals(actualTitle)){
            System.out.println("verification passed");
        }else {
            System.out.println("verification failed");
        }

        driver.close();
    }
}
