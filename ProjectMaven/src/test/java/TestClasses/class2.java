package TestClasses;

import org.testng.annotations.Test;

public class class2 
{
	@Test
	public void Test1()
	{
		System.out.println("Class 2, Test 1");
	}
	
	@Test(groups="regression2")
	public void Test2()
	{
		System.out.println("Class 2, Test 2");
	}
	
	@Test(groups="regression3")
	public void Test3()
	{
		System.out.println("Class 2, Test 3");
	}
	

}
