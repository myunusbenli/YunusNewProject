package com.benli.tests.base;

import com.benli.utilities.BrowserUtils;
import com.benli.utilities.ConfigurationReader;
import com.benli.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class TestBase {


    public WebDriver driver;        //we do this public so it can be readable in other classes

    @BeforeClass
    public void setupMethod(){

        String browser = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        BrowserUtils.sleep(2);



    }
    @AfterClass
    public void afterMethod(){
        driver.close();

    }
}
