package Demo;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jhg {
	@Test
	public void naveen() throws Exception {
	//public static void main(String args[]) throws IOException, Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	  FileInputStream file = new FileInputStream("C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Testdata\\Cred.xlsx");
	  XSSFWorkbook workbook = new XSSFWorkbook(file);
	  XSSFSheet wbst = workbook.getSheetAt(0);
	  int rownum = wbst.getLastRowNum();
	  int colnum =wbst.getRow(0).getPhysicalNumberOfCells();
	  System.out.println(colnum);
		 System.out.println(rownum);
		 XSSFCell Username;
		 XSSFCell password;
		 
	 for(int i=1;i<rownum;i++) {
		 
		 Username =wbst.getRow(i).getCell(0);
		 password = wbst.getRow(i).getCell(1);
		 driver.get("http://automationpractice.com/index.php");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Sign in")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("email")).sendKeys(Username.toString());
			driver.findElement(By.id("passwd")).sendKeys(password.toString());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("SubmitLogin")).click();
			Thread.sleep(4000);
			if(driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")).isDisplayed()) {
				System.out.println("The confirmation message says- "+driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")).getText());
			}
			else {
				driver.navigate().back();
			}
			driver.findElement(By.linkText("Sign out")).click();
	 }
	 Thread.sleep(2000);
	 driver.close();
	 
	  
	  
	}

}



