package login;

	import java.util.ResourceBundle;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import wait.Driver;


public class Login extends Driver
{
		
WebDriver driver;
ResourceBundle rb;
		
	public Login(WebDriver driver)
	{
		this.driver=driver;
		rb =ResourceBundle.getBundle("elements");
	}

	public void box()
	{
		driver.findElement(By.name(rb.getString("first"))).sendKeys("iphone");
	}

	public void search()
	{
	Actions act =new Actions(driver);
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys(Keys.ENTER).perform();
	act.sendKeys(Keys.PAGE_DOWN).perform();
	}
	
	public void buy()
	{
		driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
	}

	public void cart() throws InterruptedException
	{
		Thread.sleep(1000);
		//driver.findElement(By.id(rb.getString("cart"))).click();
		
		driver.findElement(By.xpath("//*[text()='1 item(s) - $123.20']")).click();
	}
}
