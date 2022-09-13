package pageFactory2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class firstclass {
	
	
	

	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	WebElement click;
	
	@FindBy(how=How.NAME,using="firstname")
	WebElement fname;
	
	@FindBy(how=How.NAME,using="lastname")
	WebElement lname;
	
	
	public void clicklink()
	{
		click.click();
	}
	
	public void firsname(String fn)
	{
		fname.sendKeys(fn);
	}
	
	public void lastname(String ln)
	{
		lname.sendKeys(ln);
	}
	
	
	public firstclass(WebDriver driver)
	{
		driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	

}
