package Maven_Automation_addtocart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationHomepage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='search_query_top']")
	WebElement search;
	@FindBy(name="submit_search")
	WebElement enter;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/img[1]")
	WebElement clickproduct;
	public AutomationHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void search_txt() {
		search.sendKeys("Dresses");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void click() throws Exception {
		enter.click();
		Thread.sleep(2000);
	}
	public void product() throws Exception {
		clickproduct.click();
		Thread.sleep(2000);
	}
	

}
