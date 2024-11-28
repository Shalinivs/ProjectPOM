package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.UtilityClass;

public class ProjectSpecificationMethod extends UtilityClass {

	@BeforeMethod
	
	public void launchandloadurl()
	{
		 browserlaunch(prop.getProperty("browser"),prop.getProperty("url"));
	}
	
	private void browserlaunch(String property, String property2) {
		// TODO Auto-generated method stub
		
	}

	@AfterMethod
	public void browserclose()
	{
		closebrowser();
	}
}
