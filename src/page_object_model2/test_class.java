package page_object_model2;

import org.openqa.selenium.chrome.ChromeDriver;

public class test_class {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(5000);
				
				login_page lp=new login_page(driver);
				
				Thread.sleep(5000);
				
				lp.clicklink();
				
				Thread.sleep(5000);
				
				
				
				second_class sc=new second_class(driver);
				
				
				sc.clickfname("shrikant");
				sc.clicklname("machnurkar");
				
						
	}

}
