package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_checkradiobutton 
{
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test1()
	{
		boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();//Male button in Gender field
		boolean b1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).isSelected();//Female button in Gender field
		if(b||b1)
		{
			System.out.println("RadioButton is selected");
		}
		else
		{
			System.out.println("Radiobutton is not selected");
		}
	
	}
	@Test
	public void test2()
	{
		boolean b2=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
		if(b2)
		{
			System.out.println("The button id enabled");
		}
		else
		{
			System.out.println("The button is not enabled");
		}
		
	}
		

}
