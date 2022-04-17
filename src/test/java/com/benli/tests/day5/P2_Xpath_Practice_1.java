package com.benli.tests.day5;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class P2_Xpath_Practice_1 {
    public static void main(String[] args) {

        //TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification
            //1. Open Chrome browser
            //2. Go to http://practice.cybertekschool.com/add_remove_elements
            //3. Click to “Add Element” button
            //4. Verify “Delete” button is displayed after clicking.
            //5. Click to “Delete” button.
            //6. Verify “Delete” button is NOT displayed after clicking.

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        if (driver.findElement(By.xpath("//button[@class='added-manually']")).isDisplayed()){
            System.out.println("delete button is displayed, PASSED");

        }else {
            System.out.println("not displayed");
        }

        try {
            driver.findElement(By.xpath("//button[@class='added-manually']")).click();
            if (!driver.findElement(By.xpath("//button[@class='added-manually']")).isDisplayed()){
                System.out.println("delete button didn't displayed, PASS!!");
            }else {
                System.out.println("delete button is displayed, FAILED!!");
            }

        }catch (StaleElementReferenceException exception){
            System.out.println("StaleElementReferenceException has been thrown.");
            System.out.println("It means element has been completely deleted from the HTML.");
            System.out.println("Delete button is not displayed. Verification PASSED!");
        }

        driver.close();

        //table//tbody/tr
    }
}
