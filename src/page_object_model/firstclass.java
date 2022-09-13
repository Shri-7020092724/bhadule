package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class firstclass {

	WebDriver driver;
	By link=By.linkText("REGISTER");
	
	public void clicklink()
	{
		
		driver.findElement(link).click();
		
	}
	
	public firstclass(WebDriver driver)
	{
		this.driver=driver;
	}
	
}
