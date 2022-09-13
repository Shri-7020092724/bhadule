package new_chromedriver_path;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {

	public static void main(String[] args) throws InterruptedException {
		

		
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https:\\www.google.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println("completed");
		
		Thread.sleep(5000);
		
		//driver.close();
		//driver.quit();
		
		Dimension dim=new Dimension(200,300);
		
		driver.manage().window().setSize(dim);
		
		Point p=new Point(300,400);
		
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
				
				
	}
	
}