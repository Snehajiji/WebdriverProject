package testngPrgrm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingDemo 
{
	@BeforeTest
	public void setUp()
	{
		System.out.println("open browser");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("URL details"); 
	}
	@Test(groups={"smoke","sanity"})
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(groups={"smoke"})
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(groups={"sanity"})
	public void test3()
	{
		System.out.println("Test 3");
	}
	@AfterMethod
	public void methodclose()
	{
		System.out.println("After method");
	}
	@AfterTest
	public void testclose()
	{
		System.out.println("Browser close");
	}

}
