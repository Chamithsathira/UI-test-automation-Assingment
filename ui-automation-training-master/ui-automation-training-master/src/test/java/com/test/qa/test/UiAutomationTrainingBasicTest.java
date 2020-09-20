package com.test.qa.test;

import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.LoginSecurePage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.testdata.UserDetailsDataProvider;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * UiAutomationTrainingBasicTest.java - class to execute Tests Created by
 * SrirankanK on 10/3/2018.
 */
public class UiAutomationTrainingBasicTest extends TestBase {

	/**
	 * Verify Home Page Displayed
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 1)
	public void testVerifyHomePage() {
		//Todo - Verify HomePage is displayed
		//Todo - Click Home Page Link
		//Todo - Wait Till Page Loads
		//Todo - Verify ABTest Page is displayed
		//Todo - Navigate Back to Home Page
		//Todo - Verify HomePage is displayed
	}

	/**
	 * Verify Home Page Displayed Slow
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 2)
	public void testVerifyHomePage2() {
		//Todo - Static wait
		//Todo - Verify HomePage is displayed
		//Todo - Static wait
		//Todo - Click Home Page Link
		//Todo - Static wait
		//Todo - Wait Till Page Loads
		//Todo - Static wait
		//Todo - Verify ABTest Page is displayed
		//Todo - Static wait
		//Todo - Navigate Back to Home Page
		//Todo - Static wait
		//Todo - Verify HomePage is displayed
		//Todo - Static wait
	}

	/**
	 * Verify Check Box
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 3)
	public void testVerifyCheckBox() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Check Box Link
        //Todo - Wait Till Page Loads
        //Todo - Verify Check Box 1 is displayed
        //Todo - Verify Check Box 2 is displayed
        //Todo - Check Check Box 1
        //Todo - Verify Check Box 1 is Checked
        //Todo - Uncheck Check Box 1
        //Todo - Verify Check Box 1 is Unchecked
        //Todo - Check Check Box 2
        //Todo - Verify Check Box 2 is Checked
        //Todo - Uncheck Check Box 2
        //Todo - Verify Check Box 2 is Unchecked
        //Todo - Navigate Back to Home Page
        //Todo - Verify HomePage is displayed
	}

	/**
	 * Verify Drop Down
	 */
	@Test(groups = { "test", "regression"}, priority = 4)
	public void testVerifyDropDown() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Drop Down Link
        //Todo - Wait Till Page Loads
        //Todo - Verify Drop Down is displayed
        //Todo - Select Drop Down Option 1
        //Todo - Verify Drop Down Option 1 selected
        //Todo - Select Drop Down Option 2
        //Todo - Verify Drop Down Option 2 selected
	}

	/**
	 * Verify Forgot Password
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 5)
	public void testVerifyForgotPassword() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Forgot Password Link
        //Todo - Set Sample Mail
        //Todo - Click Submit
        //Todo - Verify Forgot Password Message
	}

	/**
	 * Verify Login Valid Scenario
	 */
	@Test(groups = "test", priority = 6)
	public void testVerifyLogin() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Login Link
        //Todo - Set Username and Password
        //Todo - Click Submit
        //Todo - Verify Login Secure Page Displayed
        //Todo - Verify Login Alert Displayed
        //Todo - Verify Login  Alert Message
        //Todo - Click Logout
        //Todo - Verify Login Page Displayed
        //Todo - Verify Logout Alert Displayed
        //Todo - Verify Logout  Alert Message

		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
		HomePage.clickLink(Constants.LOGIN_LINK);
		LoginPage.setUnamePass(Constants.LOGIN_USER_NAME,Constants.LOGIN_PASSWORD);
		LoginPage.clickSubmit();
		softAssert.assertTrue(LoginSecurePage.isLoginSecurePageDisplayed(),"Login Secure Page is not Displayed");
		softAssert.assertTrue(LoginSecurePage.isAlertDisplay(),"Login Alert is not Displayed");
		softAssert.assertTrue(LoginSecurePage.getAlertTest().contains(Constants.LOGIN_SUCCESS_MSG),"Login Message is incorrect");
		LoginSecurePage.clickLogout();
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Page is not Displayed");
		softAssert.assertTrue(LoginPage.isAlertDisplayed(),"Logout Alert is not Displayed");
		softAssert.assertTrue(LoginPage.getAlertTest().contains(Constants.LOGOUT_SUCCESS_MSG),"Logout Message Text is incorrect!");
		softAssert.assertAll();
	}

	/**
	 * Verify Login Invalid Scenario
	 */
	@Test(groups = { "test", "regression"}, priority = 7, dataProvider = "MultipleUserDetails", dataProviderClass = UserDetailsDataProvider.class)
	public void testVerifyInvalidLogin(String username, String password) {
        //TODO- SAME ACTION SHOULD BE REPEATED FOR MULTIPLE USERS
        //Todo - Verify HomePage is displayed
        //Todo - Click Login Link
        //Todo - Set Invalid Username and Password
        //Todo - Click Submit
        //Todo - Verify Login Alert Displayed
        //Todo - Verify Login  Alert Message

		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
		HomePage.clickLink(Constants.LOGIN_LINK);
		LoginPage.setUnamePass(username,password);
		LoginPage.clickSubmit();
		softAssert.assertTrue(LoginPage.isAlertDisplayed(),"Invalid Login Alert is not Displayed");
		softAssert.assertTrue(LoginPage.getAlertTest().contains(Constants.LOGIN_INVALID_MSG),"Invalid Message Text is incorrect!");
		softAssert.assertAll();
	}
}
