package DataDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ReadXML {
	static String driverPath = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	
	@Test
	@Parameters({"productname"})
	public void search(@Optional("Women casual dresses")String productname) throws Exception {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys(productname);
		 driver.findElement(By.name("submit_search")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/img[1]")).click();
		 Thread.sleep(3000);
		
		 System.out.println(driver.getTitle());
		 Thread.sleep(3000);
		 driver.close();
	}
	
	

}
