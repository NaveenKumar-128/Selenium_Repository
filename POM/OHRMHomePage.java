package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRMHomePage {
	WebDriver driver;

    By homePageUserName = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p");

public OHRMHomePage(WebDriver driver){

    this.driver = driver;}

    //Get the User name from Home Page

public String getHomePageDashboardUserName(){

         return driver.findElement(homePageUserName).getText();

        }

}
