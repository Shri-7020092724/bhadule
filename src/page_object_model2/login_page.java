package page_object_model2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {
	
	WebDriver driver;
	By link=By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']");
	
	
	public void clicklink()
	{
	driver.findElement(link).click();
		
	}
	
	
	public login_page(WebDriver driver)
	{
		this.driver=driver;
	}

}
