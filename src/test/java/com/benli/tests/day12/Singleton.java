package com.benli.tests.day12;

    /*
        we will create similar logic we created in Driver utility class.
        But it will be for a String
    */

public class Singleton {

    //Create private constructor
    private Singleton(){}

    //by making the string private, we will ensure we create access only through our getter method
    private static String word;

    //we allow user to access to 'word' in the way we want them to have
    public static String getWord(){

        if (word==null){
            System.out.println("first time call. word object is null" +
                    " Assigning value to it now");
            word="something";
        }else {
            System.out.println("we already has a value");
        }

        return word;

    }
}
