package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\shrikant/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
		TakesScreenshot src=(TakesScreenshot)driver;
		File f=src.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\shrikant/defect45.jpg");
		FileUtils.copyFile(f, dest);
		
		System.out.println("completed");

	}

}
