package testngPrgrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fb_valuepassinXml 
{
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Parameters({"email","password"})
	@Test
	public void test1(String s,String s1)
	{
		
		WebElement r=driver.findElement(By.xpath("//input[@ placeholder='Email address or phone number']"));
		WebElement t=driver.findElement(By.xpath("//input[@ placeholder='Password']"));
		r.sendKeys(s);
		t.sendKeys(s1);
		
	}

}
