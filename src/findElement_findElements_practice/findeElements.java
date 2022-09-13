package findElement_findElements_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findeElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\\\www.amazon.in/");
		String ss=driver.getTitle();
		System.out.println(ss);
		
		List<WebElement> tt=driver.findElements(By.tagName("a"));
		int list=tt.size();
		System.out.println(list);
		
		for(int i=0;i<tt.size();i++)
		{
			String pp=tt.get(i).getText();
			
			System.out.println(pp);
		}

	}

}
