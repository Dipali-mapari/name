package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 
{
	public static void main(String[] args) throws InterruptedException
	{

   	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ekade\\Downloads\\chromedriver_win32\\chromedriver.exe");
   		
		WebDriver driver=new ChromeDriver();      //Browser launch
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		
	}
}
