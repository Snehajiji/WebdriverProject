package firstpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelocator {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver(); //Browser launch
		driver.get("https:www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Chatgpt",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();

	}

}
