package firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourceprgrm {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		

	}

}
