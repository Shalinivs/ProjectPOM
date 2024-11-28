package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ProjectSpecificationMethod;

public class Registerpage extends ProjectSpecificationMethod {
	
	public Registerpage(WebDriver driver)
	{
		this.driver=driver;
	}
     public Registerpage gender()
     {
    	 driver.findElement(By.id("gender-female")).click();
    	 return this;
     }
     public Registerpage firstname()
     {
    	 driver.findElement(By.id("FirstName")).sendKeys("Shalini");
    	 return this;
     }
     public Registerpage Lastname()
     {
    	 driver.findElement(By.id("LastName")).sendKeys("VS");
    	 return this;
     }
     public Registerpage Email()
     {
    	 driver.findElement(By.id("Email")).sendKeys("shalinivsec1@gmail.com");
    	 return this;
     }
     public Registerpage password()
     {
    	 driver.findElement(By.name("Password")).sendKeys("Shalini@123");
    	 return this;
     }
     public Registerpage confirmpass()
     {
    	 driver.findElement(By.id("ConfirmPassword")).sendKeys("Shalini@123");
    	 return this;
     }
     public Registerpage Registerbutt()
     {
    	 driver.findElement(By.id("register-button")).click();
    	 return this;
     }
     
}
