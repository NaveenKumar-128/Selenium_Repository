package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmp {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		if(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText());
		}
		else{
			driver.navigate().refresh();
		}
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("firstName")).sendKeys("naveen");
		driver.findElement(By.name("lastName")).sendKeys("k");
		driver.findElement(By.name("middleName")).sendKeys("kumar");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	WebElement plus =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/div/img"));
		//plus.click();	
		//plus.sendKeys("C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\pic.jpg");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		
	}

}
