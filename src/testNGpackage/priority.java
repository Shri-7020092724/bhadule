package testNGpackage;

import org.testng.annotations.Test;

public class priority {
	
	
	//we can give negative priority in testNG
	
	@Test(priority=-3)
	
	public void setup()
	{
		System.out.println("this is setup method");
	}
	
	
	@Test(priority=-2)
	
	public void login()
	{
		System.out.println("this is login method");
		
	}
	
	
	@Test(priority=-1,enabled=false)
	
	public void tesrdown()
	{
		
		System.out.println("this is tear down method");
	}

}
