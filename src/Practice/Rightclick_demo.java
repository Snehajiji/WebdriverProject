package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclick_demo 
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rc=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(rc);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		
		//To handle alert
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText(); 
		System.out.println(alerttext);
		a.accept();
		
		WebElement dc=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dc);
		act.perform();
		//To handle alert
		Alert a1=driver.switchTo().alert();
		String alerttext1=a1.getText(); 
		System.out.println(alerttext1);
		a1.accept();
		
	}
}
