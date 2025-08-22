package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@Test
	public void testCase()
	{
		System.out.println("From testCase Method");
	}
	
	@BeforeMethod
		public void beforeMethod()
	{
		System.out.println("From beforeMethod Method");
	}
	
	
	@AfterMethod
	public void afterMethod()
{
	System.out.println("From afterMethod Method");
}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("From beforeClass Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("From afterClass Method");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("From beforeTest Method");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("From afterTest Method");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("From beforeSuite Method");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("From afterSuite Method");
	}
	
	
}




