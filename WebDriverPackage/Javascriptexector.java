package WebDriverPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Javascriptexector {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="http://automationpractice.com/index.php";
		driver.get(url);
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("alert('Welcome to Automation Practice')");
		Alert alt = driver.switchTo().alert();

		alt.accept();
		js.executeScript("document.getElementsByName('search_query')[0].value='dresses'");
		js.executeScript("document.getElementsByName('submit_search')[0].click()");
		
		Thread.sleep(2000);
		String stext = js.executeScript("return document.title;").toString();
		System.out.println(stext);
		
		driver.close();
		
		

	}

}
