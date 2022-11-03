package WebDriverPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
///prompt poup


public class AlertPoup {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		driver.get(url);
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.alertIsPresent());
			String tr = driver.switchTo().alert().getText();
			System.out.println(tr);
			
			driver.switchTo().alert().accept();
			
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		driver.switchTo().defaultContent();
		driver.close();
		
}
}