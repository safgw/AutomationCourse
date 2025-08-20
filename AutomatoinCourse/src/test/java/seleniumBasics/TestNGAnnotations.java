package seleniumBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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

}
