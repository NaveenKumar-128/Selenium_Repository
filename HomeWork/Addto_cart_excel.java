package HomeWork;

import java.io.FileInputStream;

import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Addto_cart_excel {
	public static void main(String args[]) throws  Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	  FileInputStream file = new FileInputStream("C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Testdata\\Cred.xlsx");
	  XSSFWorkbook workbook = new XSSFWorkbook(file);
	  XSSFSheet wbst = workbook.getSheetAt(1);
	  int rownum = wbst.getLastRowNum();
	  int colnum =wbst.getRow(0).getPhysicalNumberOfCells();
	  System.out.println(colnum);
		 System.out.println(rownum);
		 XSSFCell Username;
		 XSSFCell password;
		 XSSFCell product;
		 XSSFCell Size;
		 XSSFCell color;
		 Username =wbst.getRow(1).getCell(0);
		 password = wbst.getRow(1).getCell(1);
		 driver.get("http://automationpractice.com/index.php");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Sign in")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("email")).sendKeys(Username.toString());
			driver.findElement(By.id("passwd")).sendKeys(password.toString());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("SubmitLogin")).click();
			Thread.sleep(2000);
			if(driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")).isDisplayed()) {
				System.out.println("The confirmation message says- "+driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")).getText());
			}
			else {
				driver.navigate().back();
			}
			driver.findElement(By.linkText("Sign out")).click();
		 for(int i=1;i<=rownum;i++) {
			 product =wbst.getRow(i).getCell(2);
			 Size = wbst.getRow(i).getCell(3); 
			 color = wbst.getRow(i).getCell(4); 
			 driver.findElement(By.name("search_query")).sendKeys(product.toString());
			 Thread.sleep(1000);
			 driver.findElement(By.name("submit_search")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id='best-sellers_block_right']/div/ul/li[5]/a/img")).click();
			 Thread.sleep(3000);
			 Select size = new Select(driver.findElement(By.name("group_1")));
			 size.selectByVisibleText(Size.toString());
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.findElement(By.name(color.toString())).click();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
			 Thread.sleep(3000);
			 WebElement pcheckout =driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));
				JavascriptExecutor excut =(JavascriptExecutor)driver;
				excut.executeScript("arguments[0].click();",pcheckout);
				Thread.sleep(1000);
				driver.navigate().back();
				driver.navigate().back();
				driver.navigate().back();
				Thread.sleep(2000);
		 }
		 driver.close();
		 
		 
		 
		 
	 }
}
