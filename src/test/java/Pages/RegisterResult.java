package Pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.ProjectSpecificationMethod;
import Utils.UtilityClass;

public class RegisterResult extends ProjectSpecificationMethod {
	
	public RegisterResult(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public RegisterResult result()
 
	{
		String Expectedid = "shalinivsec1@gmail.com";
		WebElement mailid=driver.findElement(By.className("account"));
		
		String actualid=mailid.getText();
	   
	   if(Expectedid.equalsIgnoreCase(actualid))
	   {
		   System.out.println("Regitertion successfull");
	   }
	   else 
	   {
		   System.out.println("Registertion failed");
	   }
	   return this;
	}
	


}
