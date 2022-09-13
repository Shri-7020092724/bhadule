package Action_class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\jqueryui.com/");
		Actions act=new Actions(driver);
		
		WebElement ele=driver.findElement(By.linkText("Contribute"));
		act.moveToElement(ele).build().perform();
	WebElement ele2=	driver.findElement(By.linkText("CLA"));
	act.moveToElement(ele2).click().build().perform();
	driver.navigate().back();
	
	WebElement ele3=driver.findElement(By.linkText("Droppable"));
	Thread.sleep(3000);
	act.moveToElement(ele3).click().build().perform();
	
	driver.switchTo().frame(0);
	
	Thread.sleep(3000);
	WebElement drag=driver.findElement(By.id("draggable"));
	Thread.sleep(3000);
	WebElement drop=driver.findElement(By.id("droppable"));
	Thread.sleep(3000);
	//act.dragAndDrop(drag, drop).build().perform();
	act.clickAndHold(drag).release(drop).build().perform();
	driver.switchTo().defaultContent();
	
	WebElement ele5=driver.findElement(By.linkText("Slider"));
	act.moveToElement(ele5).click().build().perform();
	
	Thread.sleep(3000); 
	driver.switchTo().frame(0);
	
	WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	Thread.sleep(3000);
	act.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform();
	Thread.sleep(3000);
	
	driver.navigate().back();
	
	WebElement acc=driver.findElement(By.linkText("Accordion"));
	act.moveToElement(acc).contextClick().build().perform();
	System.out.println("completed");
	
		
		
	}

}
