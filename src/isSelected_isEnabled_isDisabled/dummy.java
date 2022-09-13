package isSelected_isEnabled_isDisabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		  
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement redio=driver.findElement(By.xpath("//input[@name='webform']"));
	  redio.click();
	  Thread.sleep(5000);
		System.out.println(redio.isDisplayed());
		System.out.println(redio.isEnabled());
		System.out.println(redio.isSelected());
		

	}

}
