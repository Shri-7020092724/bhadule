package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class second_class {
	
	WebDriver driver;
	
	By fname=By.name("firstName");
	By lname=By.name("lastName");
	
	
	public void setfirstname(String fn)
	{
		driver.findElement(fname).sendKeys(fn);
	}
	
	
	public void setlastname(String ln)
	{
		driver.findElement(lname).sendKeys(ln);
		
	}

     public second_class(WebDriver d)
     {
    	 driver=d;
     }
}
