package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Mobiles");
		//driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
	}
}

