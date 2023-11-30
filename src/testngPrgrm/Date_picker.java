package testngPrgrm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Date_picker 
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();	
		
		driver.get("https://www.booking.com/");
		driver.navigate().refresh();
		;
	}
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();
		
		while(true)
		{
			String monthtext=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
			System.out.println("Month = "+monthtext);
			if(monthtext.equals("October 2023"))
			{
				System.out.println("Month Selected");
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span/svg/path")).click();
			}
		}
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
		
		for(WebElement dateelement:alldates)
		{
			String date=dateelement.getText();
			System.out.println(date);
			
			if(date.equals("20"))
			{
				dateelement.click();
				break;
			}
		}
	}
}
