package com.benli.tests.day6;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class checkBox {
    public static void main(String[] args) {

        //Practice Cybertek Checkboxes
        //1. go to http://practice.cybertekschool.com/checkboxes
        //2.confirm checkbox #1 is not selected by default
        //3.confirm checkbox #2 is selected by default
        //4. click checkbox #1 to select it
        //5. click checkbox #2 to deselect it
        //6. confirm checkbox #1 is selected
        //7. confirm checkbox #2 is not selected

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

        //2.step
        System.out.println(checkbox1.isSelected());

        //3.step
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        System.out.println(checkbox2.isSelected());

        //4.step
        checkbox1.click();
        //6.step
        System.out.println(checkbox1.isSelected());

        //5.step
        checkbox2.click();
        //7.step
        System.out.println(checkbox2.isSelected());

        driver.close();

    }
}
