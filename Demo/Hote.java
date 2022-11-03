package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hote {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String url = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\selenium html\\Hotel Booking.html";
	    driver.get(url);
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("title is :" +title);
	    String pageurl = driver.getCurrentUrl();
	    System.out.println(pageurl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    if(driver.findElement(By.xpath("/html/body/div/h2")).isDisplayed()) {
	    	System.out.println((driver.findElement(By.xpath("/html/body/div/h2"))).getText());
	    }
	    else {
	    	driver.navigate().refresh();
	    }
	    driver.findElement(By.name("txtFN")).sendKeys("APARNA");
	    driver.findElement(By.name("txtLN")).sendKeys("SAHA");
	    driver.findElement(By.id("txtEmail")).sendKeys("aparna@supermail.com");
	    driver.findElement(By.name("Phone")).sendKeys("9807654321");
	    driver.findElement(By.xpath("/html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("Skyline Apt,Newtown");
	    Select citydrop = new Select(driver.findElement(By.name("city")));
	    citydrop.selectByIndex(4);
	    Select statedrop = new Select(driver.findElement(By.name("state")));
	    statedrop.selectByValue("Telangana");
	    Select noper = new Select(driver.findElement(By.name("persons")));
	    noper.selectByVisibleText("5");
	    if(driver.findElement(By.id("rooms")).isDisplayed()) {
	    	System.out.println((driver.findElement(By.id("rooms"))).getText());
	    }
	    else {
	    	driver.navigate().refresh();
	    }
	    driver.findElement(By.id("txtCardholderName")).sendKeys("APARNA");
	    driver.findElement(By.name("debit")).sendKeys("345678945678");
	    driver.findElement(By.name("cvv")).sendKeys("123");
	    driver.findElement(By.name("month")).sendKeys("09");
	    driver.findElement(By.name("year")).sendKeys("2025");
	    Thread.sleep(5000);
	    driver.findElement(By.id("btnPayment")).click();
	    Thread.sleep(2000);
	    driver.close();
	    
	}

}
