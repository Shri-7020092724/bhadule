package window_handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https:\\www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		String parentTitle=driver.getTitle();
		System.out.println(parentTitle);
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/51UhwaQXCpL._AC_UL320_.jpg']")).click();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		
		Iterator <String> it=s.iterator();
		
	}

}
