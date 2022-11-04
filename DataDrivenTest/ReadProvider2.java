package DataDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadProvider2 {
	WebDriver driver;
	@BeforeClass
	public void launch() {
	  String driverPath = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	}
	@DataProvider(name="testdata")
	public Object[] getdata(){
		Object[] data = new Object[3];
		//1st row
		data[0]="Women casual dresses";
		data[1]="Dresses";
		data[2]="Blouse";
		
		return data;
		
	}
@Test(dataProvider="testdata")
	
	public void login(String productname) throws Exception {
		
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys(productname);
		 driver.findElement(By.name("submit_search")).click();
		 Thread.sleep(3000);
		 System.out.println(driver.getTitle());
		 Thread.sleep(3000);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//*[@id='search_query_top']")).clear();
}
@AfterClass
public void close() {
	driver.close();
}
}
