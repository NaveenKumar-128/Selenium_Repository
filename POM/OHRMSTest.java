package POM;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRMSTest {
String driverPath = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe";

    WebDriver driver;

    OHRMSLoginPage objLoginPage;

    OHRMHomePage objHomePage;

    @BeforeTest

    public void setup(){

	System.setProperty("webdriver.chrome.driver", driverPath);
        
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    /**

     * This test case will login in https://opensource-demo.orangehrmlive.com/

     * Login to application

     * Verify the home page using Dashboard message

     */

    @Test(priority=0)

    public void test_Home_Page_Appear_Correct(){

     //Create Login Page object

    objLoginPage = new OHRMSLoginPage(driver);

    //login to application

    objLoginPage.loginToOHRM("Admin", "admin123");

    // go the next page

    objHomePage = new OHRMHomePage(driver);

    //Verify home page

    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().matches(".*"));
    driver.close();
    }
        

}
