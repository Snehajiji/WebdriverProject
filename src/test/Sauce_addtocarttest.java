package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Page.Sauce_addtocart;

public class Sauce_addtocarttest extends Sauce_logintest
{
	WebDriver driver;
	@Test
	public void test1() throws Exception
	{
		driver.navigate().refresh(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    Sauce_addtocart ob3=new Sauce_addtocart(driver);
	    ob3.addtocart_click();
	}

}
