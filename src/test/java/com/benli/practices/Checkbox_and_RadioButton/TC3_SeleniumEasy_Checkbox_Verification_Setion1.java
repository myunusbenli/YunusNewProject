package com.benli.practices.Checkbox_and_RadioButton;

import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TC3_SeleniumEasy_Checkbox_Verification_Setion1 {

    //TC #3: SeleniumEasy Checkbox Verification – Section 1
    //1. Open Chrome browser
    //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    //3. Verify “Check All” button text is “Check All”
    //4. Click to “Check All” button
    //5. Verify all check boxes are checked
    //6. Verify button text changed to “Uncheck All”

    WebDriver driver;

    @BeforeClass
    public void setUpMethod() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    @Test
    public void checkBoxVerification(){

        WebElement checkAllButton = driver.findElement(By.xpath("//input[@id='check1']"));

        if (checkAllButton.getAttribute("value").equals("Check All")){
            System.out.println("Button text verification PASSED!!!");
        }else {
            System.out.println("Button text verification FAILED!!!");
        }
        checkAllButton.click();

        List<WebElement> checkBoxList = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement checkbox : checkBoxList){
            if (checkbox.isSelected()){
                System.out.println("PASS!!");
            }else {
                System.out.println("FAILED!!!");
            }
        }

        String buttonTextAfterClick = checkAllButton.getAttribute("value");
        String expectedValueAfterClick = "Uncheck All";

        if (buttonTextAfterClick.equals(expectedValueAfterClick)){
            System.out.println("Final verification PASSED!");
        }else {
            System.out.println("Final verification FAILED!");
        }
    }

    @AfterClass
    public void afterClass(){

        driver.close();
    }
}
