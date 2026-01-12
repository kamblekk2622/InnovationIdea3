package tests;

import base.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import utils.ExtentReportManager;
import utils.Log;

public class LoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test(priority = 1)
    public void testValidLogin() {
        Log.info("starting login test...");
        test = ExtentReportManager.createTest("Login Test");
        test.info("Nevigating to URL");
        LoginPage loginpage = new LoginPage(driver);
        test.info("Adding creadentails");
        loginpage.enterUsername("admin@yourstore.com");
        loginpage.enterPassword("admin");
        test.info("Clicking login button");
        loginpage.clickOnLoginButton();
        Log.info("Title of the page " + driver.getTitle());
        test.pass("Login Successful");
    }
    @Test(priority = 2)
    public void testLoginWithInValid() {
        Log.info("starting login test...");
        test = ExtentReportManager.createTest("Login Test With Invalid credential");
        test.info("Nevigating to URL");
        LoginPage loginpage = new LoginPage(driver);
        test.info("Adding creadentails");
        loginpage.enterUsername("admin@yourstore.com");
        loginpage.enterPassword("admin43254324");
        test.info("Clicking login button");
        loginpage.clickOnLoginButton();
        Log.info("Title of the page " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"hjdvsv");
        test.pass("Login Successful");
    }
}
