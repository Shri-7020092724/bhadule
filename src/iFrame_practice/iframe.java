package iFrame_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		WebElement element =driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(element);
		
	WebElement ele=	driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	ele.click();
		
	driver.switchTo().parentFrame();
	
	}

	

}
