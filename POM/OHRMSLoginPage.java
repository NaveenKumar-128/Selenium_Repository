package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRMSLoginPage {
	WebDriver driver;
	  
    By userName = By.name("username");
    By password = By.name("password");
    By login = By.xpath("//button[@type='submit']");

    public OHRMSLoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Set user name in textbox

    public void setUserName(String strUserName){
    driver.findElement(userName).sendKeys(strUserName);
    }

    //Set password in password textbox

    public void setPassword(String strPassword){
    driver.findElement(password).sendKeys(strPassword);
    }

    //Click on login button

    public void clickLogin(){
    driver.findElement(login).click();
    }

    public void loginToOHRM(String strUserName,String strPasword){
    //Fill user name
    this.setUserName(strUserName);
    //Fill password
    this.setPassword(strPasword);
    //Click Login button
    this.clickLogin();        
    }

}
