package com.benli.tests.day10;

import com.benli.tests.base.TestBase;
import com.benli.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class Table_Task3 extends TestBase {


    @Test
    public void task3_return_tims_due_amount(){
        String url = ConfigurationReader.getProperty("url");
        driver.get(url);

    }

}
