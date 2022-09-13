package javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.name("uid")).sendKeys("shravani");
		driver.findElement(By.name("password")).sendKeys("shrikant");
		WebElement ele=driver.findElement(By.name("btnLogin"));
		
		js.executeScript("arguments[0].click();",ele);
		driver.switchTo().alert().accept();
		
		js.executeScript("alert('shinge sir');");
		driver.switchTo().alert().accept();
		js.executeScript("history.go[0]");   
		String ss=js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(ss);
		System.out.println("title of web page");
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("completed");
	
	}

}
