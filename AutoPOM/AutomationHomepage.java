package AutoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationHomepage {
	WebDriver driver;

    By homePageUserName = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]/span[1]");

public AutomationHomepage(WebDriver driver){

    this.driver = driver;
    }

    //Get the User name from Home Page

public String getHomePageDashboardUserName(){

         return driver.findElement(homePageUserName).getText();

        }
}
