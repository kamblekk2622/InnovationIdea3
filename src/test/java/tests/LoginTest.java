package tests;

import base.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import utils.Log;

public class LoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void testValidLogin(){
        Log.info("starting login test...");
        LoginPage loginpage=new LoginPage(driver);
        loginpage.enterUsername("admin@yourstore.com");
        loginpage.enterPassword("admin");
        loginpage.clickOnLoginButton();
        Log.info("Title of the page "+driver.getTitle());
//        Assert.assertEquals(driver.getTitle(),"Dashboard / nopCommerce administration");
    }
}
