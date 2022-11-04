package AutoPOM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationSigin {
	WebDriver driver;
	 By sign = By.xpath("//a[@class='login']");
public AutomationSigin(WebDriver driver) {
		this.driver=driver;
	}

public void signin(){
    driver.findElement(sign).click();
    }

}
