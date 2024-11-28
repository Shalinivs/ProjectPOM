package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.ProjectSpecificationMethod;
import Pages.Homepage;

public class TC_03_LoginInvalid extends ProjectSpecificationMethod {
	
	@Test

	public void invalidlogin() throws IOException {
		// TODO Auto-generated method stub
			
		readFrompropFile("LoginTestData");
		Homepage obj = new Homepage(driver);
		obj.launchandloadurl(prop.getProperty("browser1"));
		obj.clickloginbutton()
		.mail(prop.getProperty("invalidemail"))
		.password(prop.getProperty("invalidpassword"))
		.loginButton()
		.validatelogin("inValidEmailAndValidPassword","Login was unsuccessful. Please correct the errors and try again");

	}

}
