package com.benli.utilities;

public class BrowserUtils {

    /*
    Method that accept int arg
    Wait for given second duration
     */


    public static void sleep(int second){

        second*=1000;

        //1 sec = 1000 milli seconds
        //1 * 1000 = 1000
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in there");
        }
    }
}
