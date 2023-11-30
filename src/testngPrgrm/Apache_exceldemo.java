package testngPrgrm;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Data Driven Test
public class Apache_exceldemo 
{
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test() throws IOException, Exception
	{
		FileInputStream f=new FileInputStream("D:\\A Software Testing\\Apache_Excel\\Demoexcel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f); //workbook
		XSSFSheet sh=wb.getSheet("sheet1");
		int row=sh.getLastRowNum();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		for(int i=1;i<=row;i++)
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Email : "+email);
			
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password : "+password);
			
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(email);
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			
			driver.navigate().refresh();
		
		}
	}

}
