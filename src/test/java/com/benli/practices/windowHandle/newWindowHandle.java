package com.benli.practices.windowHandle;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class newWindowHandle {

    WebDriver driver;

    @BeforeClass
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

    }

    @Test
    public void windows(){
        WebElement windowH = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[36]/a"));
        windowH.click();
        System.out.println(driver.getWindowHandle());
    }

    @AfterClass
    public void afterClass(){

        driver.close();
    }

}
