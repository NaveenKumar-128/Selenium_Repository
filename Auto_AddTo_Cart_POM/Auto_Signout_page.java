package Auto_AddTo_Cart_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auto_Signout_page {
	WebDriver driver;
	@FindBy(linkText="Sign out")
	WebElement sign_out;
	public Auto_Signout_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void signout() {
		sign_out.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
