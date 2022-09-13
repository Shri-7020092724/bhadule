package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class anotations {
	
	@Test
	
	public void test()
	{
		System.out.println("this is testcase1 menthod");
	}
	
	
	@BeforeTest
	public void beforsuit()
	{
		
		System.out.println("thid is before test");
	}
	
	@BeforeClass
	public void beforclass()
	{
		System.out.println("this is before class");
	}
	
	@BeforeMethod
	public void beformethod()
	{
		System.out.println("thid is before method method");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("thid is aftermethod method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("thid is after class");
	}
	
	
	@AfterTest
	
	public void aftertest()
	{
		System.out.println("this is after test methot");
	}
	
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("this is after suite");
	}
	
	
	
	@BeforeSuite
	public void befordsuit()
	{
		System.out.println("this is beforsuite method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
