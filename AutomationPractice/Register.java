package AutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="http://automationpractice.com/index.php";
		driver.get(url);
		System.out.println("title is :"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Sign")).click();
//		JavascriptExecutor ex = (JavascriptExecutor)driver;
//		ex.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.id("email_create")).clear();
		driver.findElement(By.id("email_create")).sendKeys("hgdyrtyggxyk@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")).click();
		if(driver.findElement(By.xpath("//h3[contains(text(),'Create an account')]")).isDisplayed()) {
			System.out.println("the confirmation message :" +driver.findElement(By.xpath("//h3[contains(text(),'Create an account')]")).getText());
		}
		else {
			driver.navigate().back();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement radio = driver.findElement(By.id("id_gender1"));
		radio.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("customer_firstname")).sendKeys("Kumar");
		driver.findElement(By.id("customer_lastname")).sendKeys("Selenium");
		driver.findElement(By.id("passwd")).sendKeys("Naveen@123");
		Select dropd = new Select(driver.findElement(By.id("days")));
		dropd.selectByValue("31");
		Select dropm = new Select(driver.findElement(By.id("months")));
		dropm.selectByValue("12");
		Select dropy = new Select(driver.findElement(By.id("years")));
		dropy.selectByValue("2000");
		driver.findElement(By.id("address1")).sendKeys("how are you");
		driver.findElement(By.id("city")).sendKeys("hyderabad");
		
		Select s=new Select(driver.findElement(By.id("id_state")));
		s.selectByValue("5");
		
		driver.findElement(By.id("postcode")).sendKeys("90011");
		
		Select s1=new Select(driver.findElement(By.id("id_country")));
		s1.selectByValue("21");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("9000908158");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
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
