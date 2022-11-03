package AutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sigin {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url ="http://automationpractice.com/index.php";
	driver.get(url);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	driver.findElement(By.partialLinkText("Sign")).click();
	driver.findElement(By.id("email")).sendKeys("hgdyrtyggy@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("Naveen@123");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("SubmitLogin")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	if(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]/span[1]")).isDisplayed()) {
		System.out.println("The confirmation message says- "+driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]/span[1]")).getText());
		
	}
	else
	{
		driver.navigate().back();
		
	}
	driver.findElement(By.linkText("Sign out")).click();
	driver.close();
}
}




//
