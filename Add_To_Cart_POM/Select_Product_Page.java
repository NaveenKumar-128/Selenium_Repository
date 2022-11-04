package Add_To_Cart_POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Select_Product_Page  {
	WebDriver driver;
	By search =By.name("search_query");
	By submit=By.name("submit_search");
	
	By clickPdt=By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img");
	By textpdt=By.xpath("//*[@id='center_column']/div/div/div[3]/h1");
	By quantity=By.id ("quantity_wanted");
	By size=By.id("group_1");
	By color=By.name("Black");
	By addtocart=By.xpath("//span[contains(text(),'Add to cart')]");
	By check_out =By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
	public Select_Product_Page(WebDriver driver) {
		this.driver=driver;
	}
	 
		
		public void searchpdt(String searchproduct) {	
			// search product
			driver.findElement(search).sendKeys(searchproduct);

		}
			public void enter() {
				driver.findElement(submit).click();	
			}
			public void clickpt() {
				driver.findElement(clickPdt).click();	
			}
			public void txtpdt() throws Exception {
			if(driver.findElement(textpdt).isDisplayed()) {
				System.out.println(driver.findElement(textpdt).getText());
			}
			else {
				driver.navigate().back();
			}
			Thread.sleep(2000);
			}
			public void Quantity(String Quantity) throws Exception {
			///Quantity updated
			driver.findElement(quantity).clear();
			driver.findElement(quantity).sendKeys(Quantity);
			Thread.sleep(2000);
			}
			public void siz(String Size) {
			///Size updated
			Select dpsize=new Select(driver.findElement(size));
			dpsize.selectByVisibleText(Size);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// add to cart
			}
			public void addtocart() throws Exception{
			driver.findElement(addtocart).click();
			Thread.sleep(2000);
			}
			public void procced() throws Exception{
				WebElement checkout = driver.findElement(check_out);
			JavascriptExecutor js =(JavascriptExecutor)driver;
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();",checkout);
			Thread.sleep(20000);
//			
//			driver.navigate().back();
//			driver.navigate().back();
//			driver.navigate().back();
//			driver.findElement(search).clear();
}		 

}
