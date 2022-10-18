package TestClasses;

import org.testng.annotations.Test;

public class class1 
{
	
	@Test(groups="regression1")
	public void Test1()
	{
		System.out.println("Class 1, Test 1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Class 1, Test 2");
	}
	
	@Test(groups="regression3")
	public void Test3()
	{
		System.out.println("Class 1, Test 3");
	}
	

}
