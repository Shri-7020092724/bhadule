package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bmw car");
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/51LWAb1DFJL._AC_UL320_.jpg']")).click();
		
		
		driver.findElement(By.cssSelector("input[type='text']")).clear();
		
	}
	
}
