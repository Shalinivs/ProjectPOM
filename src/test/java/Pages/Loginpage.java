package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecificationMethod;

public class Loginpage extends ProjectSpecificationMethod {
	

	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Loginpage mail(String emailId) 
	{
	  driver.findElement(By.id("Email")).sendKeys(emailId);
		
		return this;
	}
	
	public Loginpage password(String pass) {
		
		 driver.findElement(By.id("Password")).sendKeys(pass);
		 return this;
	}
	
	public Homepage loginButton() {
		
		driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
		return new Homepage(driver);
	}

	
	}


