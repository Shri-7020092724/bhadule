package select_class_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class by_using_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//select[@name='birthday_day']//option"));
		
		System.out.println(ele.size());
		
		for(int i=0;i<ele.size();i++)
		{
			String ss=ele.get(i).getText();
			
			System.out.println(ss);
			
			if(ele.get(i).getText().equals("22")) {
				
				ele.get(i).click();
				break;
				
			}
		}
		
	}

}
