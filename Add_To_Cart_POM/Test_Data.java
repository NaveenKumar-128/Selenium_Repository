package Add_To_Cart_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AutoPOM.AutomationHomepage;
import AutoPOM.AutomationLogin;
import AutoPOM.AutomationSigin;

public class Test_Data {
	 WebDriver driver;

	    AutomationLogin objLoginPage;

	    AutomationHomepage objHomePage;
	    AutomationSigin objsignpage;
	    Select_Product_Page productpage;
	    Checkout_Page checkoutpage;
	    Signout_page signoutpage;

	    @BeforeTest

	    public void setup(){
	    	String driverPath = "C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Drivers\\chromedriver_win32\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver", driverPath);
	        
	        driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	        driver.get("http://automationpractice.com/index.php");
	        driver.manage().window().maximize();

	    } 
	    @Test()

	    public void login() throws Exception {
	    	//click on sign in object
	   objsignpage = new AutomationSigin(driver);
	   objsignpage.signin(); 	    
	    	    

	     //Create Login Page object

	    objLoginPage = new AutomationLogin(driver);

	    //login to application
	    objLoginPage.setUserName("hgdyrtyggxyz3@gmail.com");
	    objLoginPage.setPassword("Naveen@123");
	    objLoginPage.clickLogin();
	    
			FileInputStream file = new FileInputStream("C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Testdata\\Cred.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet wbst = workbook.getSheetAt(1);
			int rownum= wbst.getLastRowNum();
			int colnum = wbst.getRow(0).getPhysicalNumberOfCells();
			System.out.println(colnum);
			System.out.println(rownum);
			XSSFCell searchproduct;
	         XSSFCell Size;
			XSSFCell color;
			XSSFCell Quantity;
			 for(int i=1;i<4;i++) {
				 searchproduct =wbst.getRow(i).getCell(2);
				 Size = wbst.getRow(i).getCell(3); 
				//color =wbst.getRow(i).getCell(3);
				Quantity =wbst.getRow(i).getCell(4);	    
	    productpage = new Select_Product_Page(driver);
	    productpage.searchpdt(searchproduct.toString());
	    productpage.enter();
	    productpage.clickpt();
	    productpage.txtpdt();
	    productpage.Quantity(Quantity.toString());
	    productpage.siz(Size.toString());
	    productpage.addtocart();
	    productpage.procced();
	   
	    
	    
	    checkoutpage = new Checkout_Page(driver);
	    checkoutpage.cart();
	      
			 }
	    signoutpage = new Signout_page(driver);
	    signoutpage.signout();
	    
	    }
}
