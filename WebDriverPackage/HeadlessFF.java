package WebDriverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessFF {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		  options.setHeadless(true);
		  WebDriver driver = new ChromeDriver(options);
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  System.out.println("executing chrome driver in headless mode >>");
		  System.out.println(driver.getCurrentUrl());
		  System.out.println(driver.getTitle());
		  driver.close();
		  
		
		
	}
	

}
