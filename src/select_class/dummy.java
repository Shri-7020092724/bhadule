package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dummy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select sc=new Select(ele);
		
		sc.selectByIndex(10);
		List<WebElement>list=sc.getOptions();
		System.out.println(list.size());
		Thread.sleep(5000);
		for(int i=0;i<list.size();i++) {
			
			String nn=list.get(i).getText();
			System.out.println(nn);
			
			Thread.sleep(5000);
			if(nn.equals(15)) {
				
				list.get(i).click();
				break;
			}
			
			
			//driver.findElement(By.linkText("Male")).click();
		 
		
			
		}
		
		
		
	
			
		
	}}
	

	