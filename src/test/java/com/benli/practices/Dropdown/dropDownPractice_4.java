package com.benli.practices.Dropdown;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class dropDownPractice_4 {

    //TC #4: Selecting value from multiple select dropdown

    //5. Deselect all values.
    WebDriver driver;

    @BeforeClass
    public void setUpMethod(){

        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void dropDownPractice4(){

        WebElement allOptions = driver.findElement(By.xpath("//select[@id='state']"));
        Select select = new Select(allOptions);

        List<WebElement> selectAllOptions = select.getOptions();

        //List<WebElement> selectAllOptions = driver.findElements(By.xpath("//select[@id='state']/option"));


        //3. Select all the options from multiple select dropdown.
        //4. Print out all selected values.
        for(WebElement options:selectAllOptions){
            select.selectByVisibleText(options.getText());
            System.out.println(options.isSelected());
            System.out.println("options.getText() = " + options.getText());

        }







    }

    @AfterClass
    public void afterClass(){
        driver.close();
    }
}
