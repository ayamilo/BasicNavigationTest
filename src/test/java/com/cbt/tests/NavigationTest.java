package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;




public class NavigationTest {


    public static void main(String[] args) throws InterruptedException {
       chrome();
       firefox();
       safari();

    }
    public static void chrome() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        String expectedTitle = "Google";
        System.out.println("Title is..." + title);

        driver.get("http://etsy.com");
        driver.navigate().back();

        verifyEquals(driver.getTitle(), "Google");
        driver.navigate().forward();
        verifyEquals(driver.getTitle(), "Google");

         Thread.sleep(3000);
        driver.quit();
    }
    public static void firefox() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        Thread.sleep(3000);

        String title = driver.getTitle();
        String expectedTitle = "Google";
        System.out.println("Title is..." + title);
        Thread.sleep(3000);
        driver.get("http://etsy.com");
        driver.navigate().back();
        Thread.sleep(3000);
        verifyEquals(driver.getTitle(), "Google");
        driver.navigate().forward();
        verifyEquals(driver.getTitle(), "Google");
        Thread.sleep(3000);
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

         Thread.sleep(3000);
        driver.quit();
    }
    public static void safari() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("http://google.com");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String title = driver.getTitle();
        String expectedTitle = "Google";
        System.out.println("Title is..." + title);
        Thread.sleep(3000);
        driver.get("http://etsy.com");
        driver.navigate().back();
        Thread.sleep(3000);
        verifyEquals(driver.getTitle(), "Google");
        driver.navigate().forward();
        verifyEquals(driver.getTitle(), "Google");
        Thread.sleep(3000);
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.quit();
        verifyEquals(expectedTitle, title);
    }
    public static void verifyEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }


}
