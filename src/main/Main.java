package main;

import org.testng.annotations.Test;

import login.Login;
import wait.Driver;


public class Main extends Driver
{
	
	@Test
	public void tcase1() throws InterruptedException
	{
		Login log = new Login(driver);
		
		log.box();
		log.search();
		log.buy();
		log.cart();
		
	}
}


