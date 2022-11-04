package AUtomationPF;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AutomationTest {
	
    WebDriver driver;

    AutomationLogin objLoginPage;

    AutomationHomepage objHomePage;
    AutomationSigin objsignpage;

    @BeforeTest

    public void setup(){
    	String driverPath = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver", driverPath);
        
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

    }

   
    @Test()

    public void login(){
    	//click on sign in object
   objsignpage = new AutomationSigin(driver);
   objsignpage.signin(); 	    
    	    

     //Create Login Page object

    objLoginPage = new AutomationLogin(driver);

    //login to application
    objLoginPage.setUserName("hgdyrtyggxyz3@gmail.com");
    objLoginPage.setPassword("Naveen@123");
    objLoginPage.clickLogin();
                                                      

    // go the next page

    objHomePage = new AutomationHomepage(driver);

    //Verify home page

    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().matches(".*"));
    driver.close();
    }
}
