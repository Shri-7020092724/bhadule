package total_automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class start {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Demoqa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]/span")).click();
		driver.findElement(By.id("userName")).sendKeys("Shrikant babarao machnurkar");
		driver.findElement(By.id("userEmail")).sendKeys("srikantm@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("At post machnur tq.biloli.dist.nanded");
		driver.findElement(By.id("permanentAddress")).sendKeys("At post machnur tq.biloli.dist.nanded");
		
		js.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button")).click();
		
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]/span")).click();
		
	WebElement ele=driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
	Thread.sleep(5000);
	
	ele.click();
	Thread.sleep(5000);
		boolean b=ele.isSelected();
		System.out.println(b);
		
		WebElement isSelected = null;
		if(ele==isSelected)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		driver.findElement(By.xpath("//*[@id=\"item-2\"]/span")).click();
		
		System.out.println("user on redio button page");
		
		WebElement ele2=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		Thread.sleep(5000);
		ele2.click();
		System.out.println(ele2.isDisplayed());
		System.out.println(ele2.isEnabled());
		System.out.println(ele2.isSelected());
		
		if(ele2==isSelected)
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
	//	driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"item-3\"]/span")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("yogesh");;
		driver.findElement(By.id("lastName")).sendKeys("shirole");
		driver.findElement(By.id("userEmail")).sendKeys("yogesh@gmail.com");
		driver.findElement(By.id("age")).sendKeys("27");
		driver.findElement(By.id("salary")).sendKeys("5656565");
		driver.findElement(By.id("department")).sendKeys("science");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();  
		System.out.println("new person is added successfully");
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,400)");
		
		
		driver.findElement(By.xpath("//*[@id=\"item-4\"]/span")).click();
		
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		WebElement ele3=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Thread.sleep(3000);
		
		act.moveToElement(ele3).doubleClick().build().perform();
		
		WebElement notclicked = null;
		if(ele3==notclicked)
		{
			System.out.println("failed");
		}
		else
		{
			System.out.println("you have to clicked");
		}
		
		Thread.sleep(5000);
		
		WebElement ele4=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.moveToElement(ele4).contextClick().build().perform();
		
		if(ele4==notclicked)
		{
			System.out.println("failed");
		}
		else
		{
			System.out.println("you have to right clicke");
		}
		
		Thread.sleep(5000);
		WebElement ele5=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
		act.moveToElement(ele5).click().build().perform();
		
		if(ele5==notclicked)
		{
			System.out.println("failed");
		}
		else
		{
			System.out.println("you have to done a dynamic click");
		}
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//*[@id=\"item-5\"]/span")).click();
		
		
		String curentwindow=driver.getWindowHandle();
		System.out.println("curentwindw"+curentwindow);
		
		driver.findElement(By.id("simpleLink")).click();
		Thread.sleep(3000);
		
		Set<String> second_window=driver.getWindowHandles();
		
		System.out.println("second_window"+second_window);
		
		
		driver.switchTo().window(curentwindow);
		
		
		
		
		
		System.out.println("script is completed");   
	}
}