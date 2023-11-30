package testngPrgrm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingDemo 
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
	@Test(priority=2,dependsOnMethods= {"test2"}) //Test1 is depends on test2  
	                                              //enabled=false ---> means the method is skipped
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(priority=1)
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(priority=3,invocationCount=3)  //the method should be executed 3 times(invocationCount)
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
