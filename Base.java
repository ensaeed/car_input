package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ehsun on 31/01/201.
 */
public  abstract class Base {

    public static WebDriver driver;

@BeforeClass
    public void initiliseWebDriver() {
    //Initialise the webdriver
        driver= new FirefoxDriver();

    }

    public static WebDriver getURL(){

        driver.get("https://cartaxcheck.co.uk/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    }



