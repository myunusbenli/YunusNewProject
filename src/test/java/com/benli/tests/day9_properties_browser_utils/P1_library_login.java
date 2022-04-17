package com.benli.tests.day9_properties_browser_utils;

import com.benli.utilities.BrowserUtils;
import com.benli.utilities.ConfigurationReader;
import com.benli.utilities.LibraryUtils;
import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class P1_library_login {

    WebDriver driver;

    //TASK# Library software link verification
    //1. Open browser
    //2. Go to website: "http://library2.cybertekschool.com/login.html"
    //3/ Enter username:
    //4. Enter password:
    //5. Click to login button
    //6. Print out count of all the links on landing page
    //7. Print out each link text on this page


    @BeforeClass
    public void SetupMethod(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));

        driver.manage().window().maximize();
        BrowserUtils.sleep(2);
        driver.get("http://library2.cybertekschool.com/login.html");

    }

    @Test
    public void login_link_count_test(){
        LibraryUtils.login_test(driver);

        BrowserUtils.sleep(2);

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        System.out.println("allLinks.size() = " + allLinks.size());

        for (WebElement each : allLinks){
            System.out.println(each.getText());
        }
    }

    @AfterClass
    public void afterMethod(){

        BrowserUtils.sleep(3);
        driver.close();
    }
}
