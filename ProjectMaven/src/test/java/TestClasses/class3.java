package TestClasses;

import org.testng.annotations.Test;

public class class3 
{
	@Test
	public void Test1()
	{
		System.out.println("Class 3, Test 1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Class 3, Test 2");
	}
	
	@Test(groups="regression3")
	public void Test3()
	{
		System.out.println("Class 3, Test 3");
	}
	

}
