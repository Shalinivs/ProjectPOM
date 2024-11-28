package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite");
	}
@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test");
	}
@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	@org.testng.annotations.Test
	public void Test()
	{
		System.out.println("test");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("After suite");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("After test");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("After class");
	}
	
}
