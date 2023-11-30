package firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver(); //Browser launch
		driver.get("https:www.google.com"); //Open Application
		
		String actualresult=driver.getTitle(); //Title verification
		String expectedresult="Google";
		
		if(actualresult.equals(expectedresult))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close(); //Close any tab 
		//driver.quit();  //Close entire browser

	}

}
