package Test;

import org.testng.annotations.Test;

public class Attributesample {

	@Test(priority = 1)
	public void loginTest()
	{
		System.out.println("login test");
	}
	
	@Test(priority = 0) // Attributes
	public void signinTest()
	{
		System.out.println("Signin test");
	}
	
}
