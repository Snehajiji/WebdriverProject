package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay 
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
	
	}
	@Test
	public void test1()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links : "+li.size());
	}
	@Test
	public void test2()
	{
		boolean b1=driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).isEnabled();
		if(b1)
		{
			System.out.println("The search button is enabled");
		}
		else
		{
			System.out.println("The search button is not enabled");
		}
	}
	@Test
	public void test3()
	{
		boolean b2=driver.findElement(By.xpath("//*[@id=\"gh-logo\"]")).isDisplayed();
		   if(true)
		   {
			   System.out.println("Logo is displayed");
		   }
		   else
		   {
			   System.out.println("Logo is not displayed");
		   }
	}
	@Test
	public void test4()
	{
		String fullcode=driver.getPageSource();
		String neededtext="Daily Deals";
		if(fullcode.contains(neededtext))
		{
			System.out.println("Daily deals text is prsent");
		}
		else
		{
			System.out.println("Daily deals is not present");
		}
	}
		

}
