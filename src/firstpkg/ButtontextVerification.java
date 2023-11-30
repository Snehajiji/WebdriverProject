package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtontextVerification 
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
		WebElement button=driver.findElement(By.xpath("//input[@type='button']"));
		
		if(button.getAttribute("value").equals("Check availability"))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("Fail");
		}
		
		 
	}

}
