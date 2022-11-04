package Auto_AddTo_Cart_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Auto_Home_Select_Page {
	WebDriver driver;
	@FindBy(name ="search_query")
	WebElement search;
	@FindBy(name="submit_search")
	WebElement submit;;
	@FindBy(xpath="//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")
	WebElement clickPdt;
	@FindBy(xpath="//*[@id='center_column']/div/div/div[3]/h1")
	WebElement textpdt;
	@FindBy(id ="quantity_wanted")
	WebElement quantity;
	@FindBy(id="group_1")
	WebElement size;
	@FindBy(name="Black")
	WebElement color;
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement addtocart;
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	WebElement check_out;
	public Auto_Home_Select_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void searchproduct() throws IOException, Exception {
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
			
			
			// search product
			search.sendKeys(searchproduct.toString());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			submit.click();
			Thread.sleep(2000);
			clickPdt.click();
		Thread.sleep(2000);
			if(textpdt.isDisplayed()) {
				System.out.println(textpdt.getText());
			}
			else {
				driver.navigate().back();
			}
			Thread.sleep(2000);
			///Quantity updated
			quantity.clear();
			quantity.sendKeys(Quantity.toString());
			Thread.sleep(2000);
			
			///Size updated
			Select dpsize=new Select(size);
			dpsize.selectByVisibleText(Size.toString());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// add to cart
			addtocart.click();
			Thread.sleep(2000);
			JavascriptExecutor js =(JavascriptExecutor)driver;
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();",check_out);
			Thread.sleep(20000);
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();
			search.clear();
			
		}
		

	}

}
