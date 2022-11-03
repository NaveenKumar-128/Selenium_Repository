package New;



    import java.time.Duration;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class VMS {



       public static void main(String[] args) throws Exception {
            // TODO Auto-generated method stub
    	   System.setProperty("webdriver.chrome.driver","C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
            
            String baseUrl = "https://einstein2.us/VMSUNITest/Account/Login";
            driver.get(baseUrl);
            driver.findElement(By.name("ctl00$MainContent$Email")).clear();
            driver.findElement(By.name("ctl00$MainContent$Email")).sendKeys("trinitysol@yopmail.com");
            driver.findElement(By.name("ctl00$MainContent$Password")).clear();
            driver.findElement(By.name("ctl00$MainContent$Password")).sendKeys("Hgt@123");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));    
            
            driver.findElement(By.name("ctl00$MainContent$btnlogin")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
            Actions Org = new Actions(driver);
            
            Org.moveToElement(driver.findElement(By.xpath("//body/form[@id='ctl01']/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"))).perform();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//a[contains(text(),'Create Order')]")).click();
            driver.findElement(By.xpath("//span[contains(text(),'New Order')]")).click();
            Thread.sleep(10000);
            
            driver.findElement(By.xpath("//input[@id='ctl00_MainContent_RadJobTile']")).click();
            driver.findElement(By.xpath("//input[@id='ctl00_MainContent_RadJobTile']")).sendKeys("Job001");
            Thread.sleep(30000);
            driver.findElement(By.xpath("//span[@id='ctl00_MainContent_rdcomboxRegion_Arrow']")).click();
            Thread.sleep(2000);
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeSelected(By.id("ctl00_MainContent_rdcomboxRegion_Arrow")));
          
            driver.findElement(By.id("ctl00_MainContent_rdcomboxRegion_Arrow")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//li[@class='rcbHovered']")).click();
            Thread.sleep(2000);
            
       }
}
