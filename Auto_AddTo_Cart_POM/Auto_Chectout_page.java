package Auto_AddTo_Cart_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auto_Chectout_page {
	WebDriver driver;
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/a")
	WebElement No_of_products_cart;
	public Auto_Chectout_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void cart() {
		No_of_products_cart.click();
		if(No_of_products_cart.isEnabled()) {
			System.out.println(No_of_products_cart.getText());
		}
		else {
			driver.navigate().back();
		}
	}
}
