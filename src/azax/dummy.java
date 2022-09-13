package azax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dummy {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("jon cena");
		
		Actions act=new Actions(driver);
		WebElement mouseover=driver.findElement(By.linkText("John Cena"));
		act.moveToElement(mouseover).build().perform();
		System.out.println("shrikant machnurkar");
			
		
		
		
	}

}
