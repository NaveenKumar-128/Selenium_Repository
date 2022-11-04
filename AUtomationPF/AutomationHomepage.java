package AUtomationPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationHomepage {
	WebDriver driver;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]/span[1]")
    WebElement homePageUserName;

public AutomationHomepage(WebDriver driver){

    this.driver = driver;
    
    
    PageFactory.initElements(driver, this);
    }

    //Get the User name from Home Page

public String getHomePageDashboardUserName(){

         return homePageUserName.getText();

        }
}
