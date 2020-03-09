package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {



    public static void main(String[] args) {


        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/",
                "https://walmart.com", "https://www.westelm.com");


        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (int i = 0; i < urls.size(); i++) {


            driver.get(urls.get(i)); //open each URL using loop

            String title = driver.getTitle().replace(" ", "").toLowerCase();
            //System.out.println(title);
            String urlTitle = driver.getCurrentUrl().substring(driver.getCurrentUrl().indexOf(".") + 1, driver.getCurrentUrl().lastIndexOf("."));

            System.out.println(title.contains(urlTitle));
        }


        driver.quit();


    }


    }





