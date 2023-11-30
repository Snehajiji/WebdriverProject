package firstpkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotprgrm 
{
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()throws Exception
	{
		driver.get("https://www.facebook.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D://Screenshot.png"));
		
		WebElement searchbutton=driver.findElement(By.name("login"));
		File elementscreenshot=searchbutton.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(elementscreenshot,new File("./Screenshot/searchbutton.png"));
		
	}

}
