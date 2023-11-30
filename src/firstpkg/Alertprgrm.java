package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgrm 
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
		driver.get("//D:/A%20Software%20Testing/Java%20programs/display_alert.html");
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		
		//To handle error
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText(); //To verify error messsage
		System.out.println(alerttext);
		a.accept(); //for accepting alert
		//a.dismiss(); //for decline alert
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("efg");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
