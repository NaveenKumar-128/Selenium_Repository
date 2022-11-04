package Auto_AddTo_Cart_POM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Auto_Test_Data {
	WebDriver driver;
	Auto_Signin_Page signinpage;
	Auto_Login_Page loginpage;
	Auto_Home_Select_Page homepage;
	Auto_Chectout_page checkoutpage;
	Auto_Signout_page signoutpage;
	@BeforeTest
	 public void setup(){
	    	String driverPath = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver", driverPath);
	        
	        driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	        driver.get("http://automationpractice.com/index.php");
	        driver.manage().window().maximize();
	 }
	@Test
	public void automation() throws Exception {
		
		///sigin app
		signinpage = new Auto_Signin_Page(driver);
		signinpage.signin();
		
		// login application
		loginpage = new Auto_Login_Page(driver);
		loginpage.login();
		
		// search product and select product
		homepage = new Auto_Home_Select_Page(driver);
		homepage.searchproduct();	
		
		// search product and select product
	checkoutpage = new Auto_Chectout_page(driver);
		checkoutpage.cart();
		
		signoutpage = new Auto_Signout_page(driver);
		signoutpage.signout();
	}
	@AfterClass
	public void close() {
		driver.close();
	}
	
}
