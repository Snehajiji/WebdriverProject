package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Fbloginpage;

public class Fblogintest 
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setValues("sa123@gmail.com", "sa123");
		ob.loginClick();
	}
	
}
