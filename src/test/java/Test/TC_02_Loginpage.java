package Test;

import java.io.IOException;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationMethod;
import Pages.Homepage;

public class TC_02_Loginpage extends ProjectSpecificationMethod {

	@BeforeTest
	public void setup() throws IOException {
		
		readFrompropFile("LoginTestData");
		}
	@Test	
	public void loginTest()
	{
		Homepage obj=new Homepage(driver);
		//obj.launchandloadurl(prop.getProperty("browser"),prop.getProperty("url"));
		obj.clickloginbutton()
		.mail(prop.getProperty("validemail"))
		.password(prop.getProperty("validpassword"))
		.loginButton()
		.validatelogin("ValidEmailAndValidPassword","Login was unsuccessful");
		

	}

}
