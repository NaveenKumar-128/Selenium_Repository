package Maven_Automation_addtocart;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationTest {
	WebDriver driver;
	AutomationHomepage objhomepage;
	SelectedProductpage objproductpage;
	ProductCheckpage objcheckpage;
	
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
	public void searchproduct() throws Exception {
		 objhomepage = new  AutomationHomepage(driver);
		 objhomepage.search_txt();
		 objhomepage.click();
		 objhomepage.product();
		
		 
		 
		 objproductpage = new SelectedProductpage(driver);
		 objproductpage.size_color();
		 objproductpage.addcar();
		 
		 objcheckpage = new  ProductCheckpage(driver);
		 objcheckpage.checkout();
		 objcheckpage.cartproduct();
		 objcheckpage.close();
	 }
	 

}
