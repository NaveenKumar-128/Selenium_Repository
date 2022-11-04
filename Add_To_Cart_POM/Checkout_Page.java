package Add_To_Cart_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Page {
	WebDriver driver;
	By Checkout =By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a");

	public Checkout_Page(WebDriver driver) {
		this.driver=driver;
		
	}
	public void cart() {
		driver.findElement(Checkout).click();
		if(driver.findElement(Checkout).isEnabled()) {
			System.out.println(driver.findElement(Checkout).getText());
		}
		else {
			driver.navigate().back();
		}
	}
}
