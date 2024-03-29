package window_handles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class WINDOW_HANDLE {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\demoqa.com/");
		
		
		   
		String  title_of_the_page =  driver.getTitle();
		   
	 System.out.println("Title of the page is => " + title_of_the_page);
			
		   Thread.sleep(2000);
		   
		  String url =  driver.getCurrentUrl();
		  
		   System.out.println(" The url of the page is => " + url);
		   
		   Thread.sleep(2000);
		   
		   if(driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed()) {
			   
			   System.out.println("Correct link has been opened here successfully...");
		   }else {
			   
			   System.out.println(" Wrong url is filled , Please check the corect url ");
		   }
		 
			 
		   Thread.sleep(5000);

		   driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]")).click();

		   Thread.sleep(1000);
		   
		  driver.findElement(By.xpath("(//div[@class='icon'])[1]")).click();
		   
		  Thread.sleep(1000);

		   driver.findElement(By.xpath("(//div[@class='header-wrapper'])[3]")).click();	
	       
		   Thread.sleep(3000);
		   
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0, 800)");
		   
		   
		   driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[1]")).click();
		   
		String id_windoe_first =   driver.getWindowHandle();
		System.out.println(id_windoe_first);   
		
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		   
		Set<String> second_window =   driver.getWindowHandles();
		   System.out.println(second_window);
		   
		Object[] windows =   second_window.toArray();
		   
		  String first_window = windows[0].toString();
		   String  second_windows = windows[1].toString();
		   
		  driver.switchTo().window(first_window);
		  
		  Thread.sleep(3000);
		  
		  driver.switchTo().window(second_windows);
		   
		  Thread.sleep(2000);
		  
		  if(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).isDisplayed()){
			  
			  System.out.println(" Pass");
		  }else {
			  
			  System.out.println(" Fail");
		  }
		   
		  
		  
		   driver.quit();
		   
		   
		   
	
		   
		   

		
	}

}
