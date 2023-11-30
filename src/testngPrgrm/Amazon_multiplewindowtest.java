package testngPrgrm;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_multiplewindowtest 
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        String parentwindow1=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
	    Set<String>allwindowhandles=driver.getWindowHandles();
	    for(String handle1:allwindowhandles)
		{
			if(!handle1.equalsIgnoreCase(parentwindow1))
			{
				driver.switchTo().window(handle1);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")));
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				
			}
			//driver.switchTo().window(parentwindow1);
		}
	}
}


