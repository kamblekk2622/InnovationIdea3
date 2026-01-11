package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin(){
        LoginPage loginpage=new LoginPage(driver);
        loginpage.enterUsername("admin@yourstore.com");
        loginpage.enterPassword("admin");
        loginpage.clickOnLoginButton();
        System.out.println("Title of the page "+driver.getTitle());
//        Assert.assertEquals(driver.getTitle(),"Dashboard / nopCommerce administration");
    }
}
