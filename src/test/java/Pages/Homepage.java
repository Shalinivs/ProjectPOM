package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecificationMethod;

public class Homepage extends ProjectSpecificationMethod{
	
	//@FindBy(className = "ico-register") // Initialize the element want to find 
	// WebElement Register;
	
	public Homepage(WebDriver driver) // declare driver
	{
	
	this.driver=driver; // Contractor
//	PageFactory.initElements(driver,this); // using pageFactory initialize element passing argument 
	}
	
	// create method 
	public Registerpage Registerclick()
	{
		driver.findElement(By.className("ico-register")).click();
		return new Registerpage(driver); // contractor chaining - registor going to return return page 
	}
   
	public Loginpage clickloginbutton()
	{
		driver.findElement(By.className("ico-login")).click();
		return new Loginpage(driver);
	}
	
	public Homepage validatelogin(String testcase,String expected) 
	{
		if(testcase.equals("ValidEmailAndValidPassword"))
		{		
		// String Expectedid = "shalinivsec1@gmail.com";
			
		WebElement mailid=driver.findElement(By.className("account"));
		
		String actualid=mailid.getText();
	   
	   if(expected.equalsIgnoreCase(actualid))
	   {
		   System.out.println("Login successfull");
	   }
	   else 
	   {
		   System.out.println("Login failed");
	   }
		}
		else if(testcase.equals("inValidEmailAndValidPassword"))
		{
		String actual=driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful']")).getText();
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");

		}
		}
	   
	   return this;
	}
	
	
}
