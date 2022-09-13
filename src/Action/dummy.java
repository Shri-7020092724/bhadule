package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dummy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\jqueryui.com/");
		Actions act=new Actions(driver);
		
		WebElement mouseover=driver.findElement(By.linkText("Contribute"));
		act.moveToElement(mouseover).perform();
		WebElement jj=driver.findElement(By.linkText("CLA"));
		act.moveToElement(jj).click().build().perform();
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement Clickaction=driver.findElement(By.linkText("Droppable"));
		act.moveToElement(Clickaction).click().build().perform();
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		//act.clickAndHold(drag).release(drop).build().perform();
		act.dragAndDrop(drag, drop).build().perform();
		
		
		driver.navigate().back();
		
		WebElement slide=driver.findElement(By.linkText("Slider"));
		act.moveToElement(slide).click().build().perform();
		driver.switchTo().frame(0);
		
		WebElement slider=driver.findElement(By.xpath("//span[@tabindex='0']"));
		
		act.dragAndDropBy(slider, 300, 0).build().perform();
		
		
		System.out.println("completed");
		
		
	}

}
