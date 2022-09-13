package ajax_call;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dummy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.className("dropbtn")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement fboption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		
		fboption.click();
		
		System.out.println("successfully handle the ajax calls");
		
		System.out.println("this is modified class");
	
	}

}
