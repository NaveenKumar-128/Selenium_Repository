package Add_To_Cart_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	WebDriver driver;
	 By userName = By.id("email");
	    By password = By.id("passwd");
	    By login = By.id("SubmitLogin");

	    public Login_Page(WebDriver driver){
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
}
