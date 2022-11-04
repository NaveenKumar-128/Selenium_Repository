package AUtomationPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationLogin {
	WebDriver driver;
	 @FindBy(id="email")
	 WebElement userName;
	    @FindBy(id="passwd")
	    WebElement password;
	    @FindBy(id="SubmitLogin")
	    WebElement login;
	    public AutomationLogin(WebDriver driver){
	        this.driver = driver;
	        
	        PageFactory.initElements(driver, this);
	    }

	    //Set user name in textbox

	    public void setUserName(String strUserName){
	    userName.sendKeys(strUserName);
	    }

	    //Set password in password textbox

	    public void setPassword(String strPassword){
	    password.sendKeys(strPassword);
	    }

	    //Click on login button

	    public void clickLogin(){
	    	login.click();
	    }

//	    public void loginToAutomation(String strUserName,String strPasword){
//	    //Fill user name
//	    this.setUserName(strUserName);
//	    //Fill password
//	    this.setPassword(strPasword);
//	    //Click Login button
//	    this.clickLogin();        
//	    }

}
