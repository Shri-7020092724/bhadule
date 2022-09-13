package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		firstclass fc=new firstclass(driver);
		
		fc.clicklink();
		
		
		second_class sc=new second_class(driver);
		
		
		sc.setfirstname("shrikant");
		sc.setlastname("machnurkar");
		System.out.println("completed");
	}

}
