package com.test.qa.pageobjects.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by SrirankanK on 10/3/2018.
 */
public class PageBase {
	private static WebDriver driver;

    private static String baseUrl = "http://the-internet.herokuapp.com/";
	private static String webDriverLocation = "src"+File.separator+"test"+File.separator+"resources"+File.separator+"drivers"+File.separator;
    protected static String downloadFilepath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"fileDownload";
    protected static String uploadFilepath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"fileUpload";
    protected static String osType = System.getProperty("os.type", Constants.UBUNTU);
    protected static String driverType = System.getProperty("browser.type", Constants.CHROME);

	/**
     * Initialize webdriver, set driver path and maximize chrome browser window
     */
    public static void initiateDriver() throws MalformedURLException {
        switch (driverType) {
            case Constants.CHROME:
                //Todo
                break;
            case Constants.FIREFOX:
                //Todo
                break;
        }
        getDriver().manage().window().maximize();
        getDriver().get(baseUrl);
    }

    /*
     * Get web driver instance
     */
    public static WebDriver getDriver() {
        return driver;
    }

    /**
     * Close web driver instances
     */
    public static void closeDriver() {
        //Todo
    }
    
    /**
     * Refresh web driver instances
     */
    public static void refreshDriver() {
        //Todo
    }
    
    /**
     * Navigate Back
     */
    public static void navigateBack() {
        //Todo
    }

    /**
     * GetCurrent Window Details
     */
    public static String getCurrentWindow() {
        //Todo
        return "";
    }

    /**
     * Navigate to Window By Title
     * @param windowName
     */
    public static void navigateToWindow(String windowName) {
        //Todo
    }
    
    /**
     * Static Wait
     */
    public static void staticWait(int seconds) {
        //Todo
    }
    
    /**
     * Implicit Wait
     */
    public static void implicitWait(int seconds) {
        //Todo
    }
    
    /**
     * Explicit Wait Clickable
     */
    public static void waiTillClickable(By element ,int seconds) {
        //Todo
    }
    
    /**
     * Explicit Wait Visible
     */
    public static void waiTillVisible(By element ,int seconds) {
    	//Todo
    }
}
