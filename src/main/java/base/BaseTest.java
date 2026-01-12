package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Log;

public class BaseTest {
    protected WebDriver driver;
 @BeforeMethod
 public void setUp(){
     Log.info("Starting Webdriver...");
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     Log.info("Navigate to the login page");
     driver.get("https://admin-demo.nopcommerce.com/login");
 }
 @AfterMethod
 public void tearDown(){
     if(driver!=null){
         Log.info("Closing browser...");
         driver.quit();
     }
 }

}
