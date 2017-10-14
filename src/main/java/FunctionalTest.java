import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by clovisolivier on 03/01/2017.
 */
public class FunctionalTest
{
 protected static WebDriver driver;

 @BeforeClass
    public static void setUp(){

     System.out.println("Launching");
     driver = new ChromeDriver();
     System.out.println("Driver creation");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("http://www.google.com");
 }

 @After
 public void cleanUp(){
     driver.manage().deleteAllCookies();
 }

 @AfterClass
 public static void tearDown(){
     driver.close();
 }

}
