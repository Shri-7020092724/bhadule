package select_class;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_select_class_dropdown_handle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		List<WebElement> daylist=driver.findElements(By.xpath("//select[@name='birthday_day']//option"));
		
		System.out.println(daylist.size());
		for(int i=0;i<daylist.size();i++)
		{
		System.out.println(daylist.get(i).getText());
			
		}

	}

}
