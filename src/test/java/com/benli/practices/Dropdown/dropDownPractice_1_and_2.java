package com.benli.practices.Dropdown;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dropDownPractice_1_and_2 {

    //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
    //1. Open Chrome browser
    WebDriver driver;
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Verify “Simple dropdown” default selected value is correct
    //          Expected: “Please select an option”
    //4. Verify “State selection” default selected value is correct
    //          Expected: “Select a State”

    @BeforeClass
    public void setUpClass() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
        Thread.sleep(2000);
        //driver.manage().timeouts().getImplicitWaitTimeout(5, TimeUnit.SECONDS);
    }

    @Test
    public void tc1_simple_dropdown_test(){
        Select simpleDropdown = new Select((driver.findElement(By.xpath("//select[@id='dropdown']"))));

        String actualOutput = simpleDropdown.getFirstSelectedOption().getText();
        String expected = "Please select an option";

        System.out.println(actualOutput);

        Assert.assertTrue(actualOutput.equals(expected));


    }
    @Test
    public void defaultSelected(){
        Select stateDropdown = new Select((driver.findElement(By.xpath("//select[@id='state']"))));

        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDropdown = "Select a State";

        Assert.assertEquals(actualStateDropdownText, expectedStateDropdown);
    }

    @Test
    public void tc2_state_dropdown_test() throws InterruptedException {

        //TC #2: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        //3. Select Illinois
        //4. Select Virginia
        //5. Select California
        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)

        Select stateDropdown = new Select((driver.findElement(By.xpath("//select[@id='state']"))));

        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Virginia");

        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("California");

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText, "this message print out only if it is failed");
    }
    @AfterClass
    public void afterClassDropdown(){

        driver.close();
    }

}
