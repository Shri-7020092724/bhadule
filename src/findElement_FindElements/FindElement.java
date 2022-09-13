package findElement_FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https:\\www.amazon.in/");
		List<WebElement> list=driver.findElements(By.tagName("div"));
		System.out.println(list.size());
		System.out.println(list.get(0).getText());
		
		
	}

}