package ssOfFailedTestCases;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ssOfFailedTestCases1 
{
	public class TestClass
	{
		@Test
		public void TC01()
		{
			
		}
		@AfterMethod()
		public void afterMethod(ITestResult result)
		{
			if(result.getStatus()==ITestResult.FAILURE)
			{
				//call to screenshot method
			}
		}
	}

}
