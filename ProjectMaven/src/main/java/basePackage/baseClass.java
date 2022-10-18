package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass {
	static WebDriver driver;
	public static void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase(browser))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ekade\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   		driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ekade\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   		driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
	}
}
