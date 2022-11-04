package Add_To_Cart_POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout_page {
	WebDriver driver;
	By logout =By.linkText("Sign out");
	WebElement sign_out;
	public Signout_page(WebDriver driver) {
		this.driver=driver;
		
	}
	public void signout() {
		driver.findElement(logout).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
