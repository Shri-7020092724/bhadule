 package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class first_class {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	WebElement idlink;
	
	@FindBy(how=How.NAME,using="firstname")
	WebElement passlink;
	
	@FindBy(how=How.NAME,using="lastname")
	WebElement loginlink;

	
	public void clicklink()
	{
		idlink.click();
		
	}
	
	
	public void setpass(String ps)
	{
		passlink.sendKeys(ps);
	}
	
	public void setlogin(String lg)
	{
		
		loginlink.sendKeys(lg);
	}
	
	first_class (WebDriver d)
	{
		driver =d;
		
		PageFactory.initElements(driver,this);
		
		
	}
	
}
