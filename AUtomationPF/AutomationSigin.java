package AUtomationPF;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationSigin {
	WebDriver driver;
	 @FindBy(xpath="//a[@class='login']")
	 WebElement sign;
public AutomationSigin(WebDriver driver) {
		this.driver=driver;
		
		
		 PageFactory.initElements(driver, this);
	}

public void signin(){
    sign.click();
    }

}
