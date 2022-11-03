package WebDriverPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="file:///C:/Users/NaveenKumarKollimarl/OneDrive%20-%20Hallmark%20Health%20Care%20Solutions,%20Inc/Desktop/Selenium%20%20Web/selenium%20html/windowhandles.html";
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String parentwindow =driver.getWindowHandle().toString();
		driver.findElement(By.name("Open")).click();
		driver.switchTo().window("PopupWindow");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("selenium interview");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindow);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.close();

}
}
