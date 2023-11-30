package firstpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo 
{
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleverification()
	{
		String actualresult=driver.getTitle(); //Title verification
		String expectedresult="Google";
		
		if(actualresult.equals(expectedresult))
		{
			System.out.println("Test is passed");
		}
		else     
		{
			System.out.println("Fail");
		}
	}
	@Test
	public void pagesource()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
