package com.cbt.utilities;


import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerification3 {
    public static void main(String[] args) {


        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/",
                "https://walmart.com", "https://www.westelm.com");



            for (int i = 0; i < urls.size() ; i++) {

                WebDriver driver = BrowserFactory.getDriver("chrome");

                driver.get(urls.get(i));

                String title = driver.getTitle().replace(" ", "").toLowerCase();

                String urlTitle = driver.getCurrentUrl().substring(driver.getCurrentUrl().indexOf(".") + 1, driver.getCurrentUrl().lastIndexOf("."));

                System.out.println(title.contains(urlTitle));

                driver.quit();

            }

    }
}
