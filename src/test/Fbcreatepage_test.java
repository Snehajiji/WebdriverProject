package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Fbcreatepage;

public class Fbcreatepage_test 
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
	}
	@Test
	public void test()
	{
		Fbcreatepage ob1=new Fbcreatepage(driver);
		ob1.getStartedClick();
	}

}
