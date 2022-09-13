package testNGpackage;

import org.testng.annotations.Test;

public class grouping {
	
	@Test(groups= {"sanity"})
	public void testcase1()

	{
		System.out.println("this is  testcase1");
	}
	
	
	@Test(groups= {"sanity"})
	public void testcase2()
	{
		System.out.println("this is  testcase2");
	}
	
	
	@Test(groups= {"regression"})
	public void testcase3()
	{
		System.out.println("this is testcase3");
	}
	
	
	@Test(groups= {"regression"})
	public void testcase4()
	{
		System.out.println("this is testcase4");
	}
	
	@Test(groups= {"sanity","regression"})
	public void testcase5()
	{
		System.out.println("this is test case5");
	}
}
