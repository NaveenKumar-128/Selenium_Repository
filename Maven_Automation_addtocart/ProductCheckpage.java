package Maven_Automation_addtocart;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCheckpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	WebElement check_out;
	@FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[5]")
	WebElement no_products;
	public ProductCheckpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void checkout() throws Exception {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",check_out);
		
	}
	public String cartproduct() {
		return no_products.getText();
		
	}
	public void close() {
		driver.close();
	}
	
}
