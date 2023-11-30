package Practice;

// TO CHECK THE LOGO IS PRESENT

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff 
{
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		Boolean logo=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
	   if(true)
	   {
		   System.out.println("Logo is displayed");
	   }
	   else
	   {
		   System.out.println("Logo is not displayed");
	   }
	}

}
