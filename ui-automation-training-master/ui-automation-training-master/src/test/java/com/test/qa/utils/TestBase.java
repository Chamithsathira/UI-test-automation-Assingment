package com.test.qa.utils;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * TestBase.java - class to verify TestBase Page functions
 * Created by SrirankanK on 10/3/2018.
 */
public class TestBase {
	public SoftAssert softAssert;
}
