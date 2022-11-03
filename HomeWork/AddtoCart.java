package HomeWork;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("Dresses");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/h5[1]/a[1]")).click();
		Thread.sleep(1000);
	    Select s=new Select(driver.findElement(By.id("group_1")));
        s.selectByValue("2");
        Thread.sleep(2000);
        driver.findElement(By.name("Yellow")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		Thread.sleep(3000);
		WebElement check =driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",check);
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[5]")).getText());
		Thread.sleep(2000);
		//driver.close();
	
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[2]/a/img")).click();
		Thread.sleep(2000);
		Select s1=new Select(driver.findElement(By.id("group_1")));
        s1.selectByValue("3");
        Thread.sleep(2000);
        driver.findElement(By.name("Blue")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		Thread.sleep(2000);
		WebElement check1 =driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));
		JavascriptExecutor js1 =(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",check1);
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]")).isDisplayed()) {
			System.out.println("Number of products in the cart- "+driver.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]")).getText());
			
		}
		else
		{
			driver.navigate().back();
			
		}
		Thread.sleep(1000);
        
	}

}