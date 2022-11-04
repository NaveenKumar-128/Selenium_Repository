package PFLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMHomePage {
	WebDriver driver;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")
    WebElement homePageUserName;

public OHRMHomePage(WebDriver driver){

    this.driver = driver;
    
    //
    PageFactory.initElements(driver, this); }

    //Get the User name from Home Page

public String getHomePageDashboardUserName(){

         return homePageUserName.getText();

        }

}
