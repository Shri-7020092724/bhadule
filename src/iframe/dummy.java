package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		//driver.switchTo().frame(1);        //by index
		//driver.switchTo().frame("a077aa5e");  by id or name
	//	driver.switchTo().frame("a077aa5e");    
		
	//	driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();

	}

}
