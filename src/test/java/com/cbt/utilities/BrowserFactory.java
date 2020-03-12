package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
public static WebDriver getDriver(String browser){
    if(browser.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().version("79.0").setup();;
        return new ChromeDriver();
    }else if(browser.equalsIgnoreCase("firefox")){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }else if (browser.equalsIgnoreCase("Safari")){

        return new SafariDriver();
    }else{
        return null;
    }

}

}
