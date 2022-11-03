package WebDriverPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowserTest {
	WebDriver driver;
	String baseUrl = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\selenium html\\Hotel Booking.html";
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
	//Check if parameter passed from TestNG is 'firefox'
	if(browser.equalsIgnoreCase("Firefox")){
	//create firefox instance
	System.setProperty("webdriver.gecko.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	System.out.println("Running on Firefox browser.");
	}
	
	else if(browser.equalsIgnoreCase("Edge")){
	//set path to Edge.exe
	System.setProperty("webdriver.edge.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	driver = new EdgeDriver();
	System.out.println("Running on Edge browser.");
	}
	else if(browser.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Running on Chrome browser.");
					}
	/*else if(browser.equalsIgnoreCase("Safari")){
		WebDriver driver = new SafariDriver();
		System.out.println("Running on Safari browser.");
					}*/
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void ParallelLogin() throws InterruptedException{
		String baseUrl = "C:\\\\Users\\\\NaveenKumarKollimarl\\\\OneDrive - Hallmark Health Care Solutions, Inc\\\\Desktop\\\\Selenium  Web\\\\selenium html\\\\Hotel Booking.html";
		driver.get(baseUrl);
		//driver.navigate().to(baseUrl);
							
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Implicit Wait without condition
		
		String Title=driver.getTitle();
		System.out.println("The title of the page is "+Title);
		// Displaying page title
		
		String url=driver.getCurrentUrl();
		System.out.println("The URL of the page is "+url);
		//Displaying page url
		
		driver.findElement(By.id("txtFirstName")).sendKeys("APARNA");
		driver.findElement(By.id("txtLastName")).sendKeys("SAHA");
		driver.findElement(By.id("txtEmail")).sendKeys("aparna@supermail.com");
		driver.findElement(By.id("txtPhone")).sendKeys("9807654321");
		
		driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys("Skyline Apt,Newtown");
		
			
		Select drpCity= new Select(driver.findElement(By.name("city")));
		drpCity.selectByVisibleText("Hyderabad");
		
		Select drpState= new Select(driver.findElement(By.name("state")));
		drpState.selectByIndex(4);
		
		Select drpGuest= new Select(driver.findElement(By.name("persons")));
		drpGuest.selectByValue("4");
				
		WebElement TxtGuestCount = driver.findElement(By.id("rooms"));
		System.out.println("Total number of rooms booked is "+TxtGuestCount.getText());
	
		driver.findElement(By.id("txtCardholderName")).sendKeys("APARNA");
		driver.findElement(By.id("txtDebit")).sendKeys("345678945678");
		driver.findElement(By.id("txtCvv")).sendKeys("123");
		driver.findElement(By.id("txtMonth")).sendKeys("09");
		driver.findElement(By.id("txtMonth")).sendKeys("09");
		driver.findElement(By.id("txtYear")).sendKeys("2030");
		driver.findElement(By.id("btnPayment")).click();
		
	
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("/html/body/h1")).isDisplayed()) {
			System.out.println("The confirmation message says- "+driver.findElement(By.xpath("/html/body/h1")).getText());
			driver.navigate().back();
			baseUrl = null;
			//driver.close();
			Thread.sleep(2000);
			driver.quit();
		}
	
	}
	}
