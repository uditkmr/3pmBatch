package wait;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Driver {
	public WebDriver driver;
	
	ResourceBundle r= ResourceBundle.getBundle("Driver");
	
	@BeforeClass
	public void init() throws InterruptedException
	{
		if(r.getString("Driver").equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		}
			else if(r.getString("Driver").equals("IE"))
			{
			System.setProperty("webdriver.IE.driver", "./Driver/IEdriverServer.exe");
			driver = new InternetExplorerDriver();
			
			}
		
		driver.get(r.getString("URL"));
		driver.manage().window().maximize();
		
	} 
	
	@AfterClass
	public void cls()
	{
		//driver.close();
	}
}
