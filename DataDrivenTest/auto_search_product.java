package DataDrivenTest;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import au.com.bytecode.opencsv.CSVReader;

public class auto_search_product {
	static String driverPath = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe";
	public static void main(String[] args) throws IOException,  InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",driverPath);			
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		CSVReader reader = new CSVReader(new FileReader("./TestResources/Searchproduct.csv"));
		 
		 // this will load content into list
		  java.util.List<String[]> li=reader.readAll();
		  System.out.println("Total rows that we have is "+li.size());
		            
		 // create Iterator reference
		  Iterator<String[]>i1= li.iterator();
		    
		 // Iterate all values 
		 while(i1.hasNext()){
			 String[] str=i1.next();
		 
			 driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys(str[0]);
			 driver.findElement(By.name("submit_search")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/img[1]")).click();
			 Thread.sleep(3000);
			
			 System.out.println(driver.getTitle());
			 Thread.sleep(3000);
			 driver.navigate().back();
			 driver.findElement(By.xpath("//*[@id='search_query_top']")).clear();
		 }	   
		 driver.close();
		}

}
