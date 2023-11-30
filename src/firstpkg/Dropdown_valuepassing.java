package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_valuepassing 
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
		WebElement dropdownElement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select dropdown=new Select(dropdownElement);
		dropdown.selectByValue("03");
		
		//SelectbyValue
		//selectbyIndex
		//selectbyVisibleText
		
		
		WebElement Monthelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select month=new Select(Monthelement);
		month.selectByVisibleText("JAN");
		
		WebElement Yearelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select year=new Select(Yearelement);
		year.selectByVisibleText("2002");
	}

}
