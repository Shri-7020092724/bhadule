package testNGpackage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assettiion {

	
	SoftAssert soft=new SoftAssert();
	
	@Test
	
	public void shri()
	{
		System.out.println("opent browser");
		Assert.assertEquals(true, true);
		System.out.println("login name");
		System.out.println("enter mail");
		
		soft.assertEquals(false, false);
		System.out.println("enter pass");
		System.out.println("log out");
		
	}


}
