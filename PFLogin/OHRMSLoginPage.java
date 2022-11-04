package PFLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMSLoginPage {
	WebDriver driver;
	  
    @FindBy(name="username")
    WebElement username;
    @FindBy(name="password")
    WebElement password;
    @FindBy(xpath="//button[@type='submit']")
    WebElement login;

    public OHRMSLoginPage(WebDriver driver){
        this.driver = driver;
    PageFactory.initElements(driver, this);   
    }

    
    //Set user name in textbox

    public void setUserName(String strUserName){
    	username.sendKeys(strUserName);
    }

    //Set password in password textbox

    public void setPassword(String strPassword){
    	password.sendKeys(strPassword);
    }

    //Click on login button

    public void clickLogin(){
    login.click();
    }

   

}
