package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class UtilityClass {

	//declaring common files
	public static WebDriver driver;
	public static Properties prop; // declare the obj in public 
	// public String filename;
	
	// cross browser testing 
	public void browserLaunch(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("headless-chrome"))
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--headless");
			driver = new ChromeDriver(option);
		}
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public void closebrowser()
	{
		driver.close();
	}
	
	public static void readFrompropFile(String fileName) throws IOException
	{
		FileReader file = new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\poms\\src\\test\\resources\\testData\\"+fileName+".properties");
		prop = new Properties();
		prop.load(file);
		
	}
}
