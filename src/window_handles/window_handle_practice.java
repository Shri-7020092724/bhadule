package window_handles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handle_practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\\\demoqa.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String title=js.executeScript("return document.title;").toString();
		System.out.println("title of web page is "+title);
		
		Thread.sleep(3000);
		
		String url=driver.getCurrentUrl();
		
		System.out.println("current url is "+url);
		
		
		 if(driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed()) {
			   
			   System.out.println("Correct link has been opened here successfully...");
		   }else {
			   
			   System.out.println(" Wrong url is filled , Please check the corect url ");
		   }
		 
		 
		 Thread.sleep(5000);

		   WebElement ele=driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));

		 js.executeScript("arguments[0].click();",ele);
			
		}

}
