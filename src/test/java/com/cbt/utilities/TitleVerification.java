package com.cbt.utilities;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerification {
    public static void main(String[] args) throws Exception{


        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");

        //open chrome browser
        WebDriver driver = BrowserFactory.getDriver("chrome");

        //Visit all the websitesfrom step 3and verify that they all have the same title
        //loop through each and copy the titles inside separate HashSet

        Set<String> titleSet = new HashSet<>();
        List <String > eachURL = new ArrayList<>();

        for ( String each : urls) {
            driver.get(each);
            Thread.sleep(2000);
            titleSet.add(driver.getTitle() ); //adding inside HashMap
            eachURL.add(driver.getCurrentUrl() ) ; //adding inside ArrayList
        }

        if (titleSet.size()==1) {
            System.out.println("Title of all URLs is: " + driver.getTitle());
        } else {
            System.out.println("Verification test has failed. URLs do not have the same title");
        }

        //Verify that all URLs of all pages start with http://practice.cybertekschool.com.

        for (String each : eachURL) {
             if (each.startsWith("http://practice.cybertekschool.com") ) {
                 System.out.println("Each URL starts with http://practice.cybertekschool.com");
             } else {
                 System.out.println("Each URL is different!! TEST FAILED");
             }
        }


        driver.quit();
    }
}
