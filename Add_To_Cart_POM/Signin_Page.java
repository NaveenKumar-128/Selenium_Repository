package Add_To_Cart_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signin_Page {
	WebDriver driver;
	 By sign = By.xpath("//a[@class='login']");
public Signin_Page(WebDriver driver) {
		this.driver=driver;
	}

public void signin(){
   driver.findElement(sign).click();
   }
}
