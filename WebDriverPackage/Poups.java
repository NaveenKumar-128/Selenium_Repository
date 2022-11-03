package WebDriverPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poups {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="http://output.jsbin.com/usidix/1";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/input")).click();
		String go = driver.switchTo().alert().getText();
		System.out.println(go);
		driver.switchTo().alert().accept();
		driver.close();
	}	

}
