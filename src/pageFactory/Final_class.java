package pageFactory;

import org.openqa.selenium.chrome.ChromeDriver;

public class Final_class {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		first_class f=new first_class(driver);
		
		f.clicklink();
		
		Thread.sleep(5000);
		
		f.setpass("ssssss");
		f.setlogin("mmmmmmm");
		
		
	}

}
