package com.benli.practices.Dropdown;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dropDownPractice_3 {

    //TC #3: Selecting date on dropdown and verifying
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Select “December 1st, 1922” and verify it is selected.
            //Select year using  : visible text
            //Select month using   : value attribute
            //Select day using  : index number

    WebDriver driver;

    @BeforeClass
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdownPractice3() throws InterruptedException {

        Thread.sleep(1000);

        //-----------------YEAR----------------------------

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select select2 = new Select(year);
        select2.selectByVisibleText("1923");

        if (select2.getFirstSelectedOption().getText().equals("1923")){
            System.out.println("year 1923 is selected");
        }else {
            System.out.println("year 1923 is not selected");
        }

        Thread.sleep(1000);

        //------------------------MONTH----------------------------

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select select = new Select(month);
        select.selectByValue("11");

        if (select.getFirstSelectedOption().getText().equals("December")){
            System.out.println("December is selected");
        }else {
            System.out.println("month is not selected");
        }

        Thread.sleep(1000);

        //-------------------DAY----------------------

        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select select1 = new Select(day);
        select1.selectByIndex(0);

        if (select1.getFirstSelectedOption().getText().equals("1")){
            System.out.println("day 1st is selected");
        }else {
            System.out.println("day 1st is not selected");
        }


    }

    @AfterClass
    public void afterClass(){
        driver.close();
    }
}
