package Maven_Automation_addtocart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectedProductpage {
	WebDriver driver;
	Select dpsize;
	@FindBy(id="group_1")
	WebElement dropsize;
	@FindBy(name="Black")
	WebElement color;
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement addtocart;
	public SelectedProductpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void size_color() throws Exception {
		dpsize=new Select(dropsize);
		dpsize.selectByValue("2");
		Thread.sleep(2000);
		color.click();
		Thread.sleep(2000);
	}
	public void addcar() throws Exception {
		addtocart.click();
		Thread.sleep(2000);
	}

}
