package testNGpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency {
	
	
	
	@Test 
	public void startbmw()

	{
		
		System.out.println("bmw is started");
		Assert.fail();
	}
	
	
	@Test(dependsOnMethods= {"startbmw"})
	
	public void drivebmw()
	{
		System.out.println("bmw is drive");
	}
	
	
	
	@Test(dependsOnMethods= {"drivebmw"},alwaysRun=true)
	public void parkbmw()
	{
		System.out.println("bmw is parked");
	}
	
	
	@Test(dependsOnMethods= {"parkbmw"})
	
	public void stopbmw()
	{
		System.out.println("bmw is stoped");
	}
}
