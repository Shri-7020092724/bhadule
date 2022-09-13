package page_object_model2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class second_class {
	
	WebDriver driver;
	
	By fname=By.name("firstname");
	By lname=By.name("lastname");
	
	
	public void clickfname(String fn)
	{
		driver.findElement(fname).sendKeys(fn);
	}

	
	
	public void clicklname(String ln)
	{
		driver.findElement(lname).sendKeys(ln);
	}
	
	
	public second_class(WebDriver d)
	{
		this. driver=d;
	}
}
