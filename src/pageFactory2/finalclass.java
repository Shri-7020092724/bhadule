package pageFactory2;

import org.openqa.selenium.chrome.ChromeDriver;

public class finalclass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(5000);
		
		firstclass fc=new firstclass(driver);
		
		Thread.sleep(5000);
		
		
		fc.clicklink();
		
		Thread.sleep(5000); 
		
		
		fc.firsname("jo");
		fc.lastname("disuza");

	}

}
