package Test;

import Base.ProjectSpecificationMethod;
import Pages.Homepage;

public class TC_01_Registartiontest extends ProjectSpecificationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		readFrompropFile("LoginTestData");

		 Homepage obj = new Homepage(driver);
			obj.launchandloadurl.(prop.getProperty("browser"));
			obj.Registerclick()
			.gender()
			.firstname()
			.Lastname()
			.Email()
			.password()
			.confirmpass()
			.Registerbutt();
	}

}
