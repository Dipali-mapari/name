package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG1 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@Test
	public void beforeMethod()
	{
		System.out.println("Test");
	}
	
	@AfterClass
	public void beforeTest()
	{
		System.out.println("After Class");
	}

}
