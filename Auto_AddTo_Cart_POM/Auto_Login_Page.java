package Auto_AddTo_Cart_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auto_Login_Page {
	WebDriver driver;
	@FindBy(name="email")
	WebElement username;
	@FindBy(name="passwd")
	WebElement password;
	@FindBy(xpath="//*[@id='SubmitLogin']/span")
	WebElement log;
	public Auto_Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login() throws IOException, Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\NaveenKumarKollimarl\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium  Web\\Testdata\\Cred.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet wbst = workbook.getSheetAt(0);
		XSSFCell un;
		XSSFCell pd;
		un =wbst.getRow(1).getCell(0);
		pd =wbst.getRow(1).getCell(1);
		//USERNAME
		username.sendKeys(un.toString());
		//PASSWORD
		password.sendKeys(pd.toString());
		Thread.sleep(2000);
		///LOGIN
		log.click();
		Thread.sleep(2000);
		System.out.println("login is completed");
				}
	
	}


