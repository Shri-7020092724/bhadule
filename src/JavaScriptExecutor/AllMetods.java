package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMetods {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https:www.amazon.in/");
		
		JavascriptExecutor sc=(JavascriptExecutor)driver;
		
		WebElement send=driver.findElement(By.id("twotabsearchtextbox"));//sendKeys("shree");
		
		sc.executeScript("arguments[0].value='shree';", send);
		WebElement pass=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		sc.executeScript("arguments[0].click();", pass);
		
		sc.executeScript("history.go(0)");
		
		Thread.sleep(3000);
		String ss=sc.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(ss);
		
		System.out.println("--------------------------------");
		String title_of_webpage=sc.executeScript("return document.title;").toString();
		
		System.out.println(title_of_webpage);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		sc.executeScript("window.scrollBy(0,150)");
		
	}

}
