package WebDriverPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitdriver {
	public static void main(String args[])  {
		WebDriver driver =new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Ghost browser");
		element.submit();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println("title is :" +driver.getTitle());
		driver.quit();
	}

}
