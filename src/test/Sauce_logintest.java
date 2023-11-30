package test;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import Page.Sauce_addtocart;
import Page.Sauce_backhome_logout;
import Page.Sauce_cart;
import Page.Sauce_checkoutdetails;
import Page.Sauce_loginpage;
import basepkg.Saucedemo_baseclass;

public class Sauce_logintest extends Saucedemo_baseclass
{
	@Test
	public void test() throws Exception
	{
		Sauce_loginpage ob2=new Sauce_loginpage(driver);
		Sauce_addtocart ob3=new Sauce_addtocart(driver);
		Sauce_cart ob4=new Sauce_cart(driver);
		Sauce_checkoutdetails ob5=new Sauce_checkoutdetails(driver);
		Sauce_backhome_logout ob6=new Sauce_backhome_logout(driver);
		
		FileInputStream f=new FileInputStream("D:\\A Software Testing\\Apache_Excel\\Sauce_logindetails.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f); //workbook
		XSSFSheet sh=wb.getSheet("sheet1");
		int row=sh.getLastRowNum();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username : "+username);
			
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password : "+password);
			
			ob2.setValues1(username, password);
			ob2.loginClick();
			Thread.sleep(2000);
			driver.navigate().refresh();
			
		}
		ob3.addtocart_click();
		ob4.cart_checkoutclick();
		ob5.details("Sneha", "Jiji", 689699);
		
		ob5.finishbutton();
		ob6.backhome();
	
		ob6.logout();
		
		
		
		
			
	}
}
