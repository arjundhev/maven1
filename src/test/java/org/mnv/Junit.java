package org.mnv;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Junit extends LibGlobal{
	static WebDriver driver;
	
	@BeforeClass
	public static void BeforeClass() {
		LibGlobal global=new LibGlobal();
		global.getdriver("chrome");
		global.launchUrl("https://adactinhotelapp.com/");
		
			
	}
	@AfterClass
	public void afterclass() {
		driver.quit();
		

	}
	@Before
	public void beforemethod() {
		Date date=new Date();
		System.out.println(date);
	}
	@Test
	public static void test1() {
		LoginPage page=new LoginPage();
		WebElement findById = page.findById("id", "username");
		findById.sendKeys("arjundhev");
		WebElement findById2 = page.findById("id", "password");
		findById2.sendKeys("sathvika");
		

	
	}
	
	@After
	private void afterMethod() {
		Date date=new Date();
		System.out.println(date);
		
	}
	

}
