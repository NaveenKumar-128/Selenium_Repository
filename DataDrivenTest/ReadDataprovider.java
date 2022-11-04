package DataDrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataprovider {
	WebDriver driver;
	@BeforeTest
	public void launch() {
	  String driverPath = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	}
	
	@DataProvider(name="testdata")
	public Object[][] getdata(){
		Object[][] data = new Object[3][2];
		//1st row
		data[0][0]="hgdyrtyggxyz3@gmail.com";
		data[0][1]="Naveen@123";
		//2st row
		data[1][0]="hgdyrtyggxyz2@gmail.com";
		data[1][1]="Naveen@123";
		//3st row
		data[2][0]="hgdyrtyggxyk@gmail.com";
        data[2][1]="Naveen@123";
		return data;
		
	}
	@Test(dataProvider="testdata")
	
	public void login(String username,String password) throws Exception {
		
		driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
		
		
	}
	@AfterClass
	public void close() {
		driver.close();
	}
	

}
