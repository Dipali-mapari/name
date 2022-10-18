package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookLogin {
	WebDriver driver;
	@FindBy(xpath="")
	private WebElement userName;
	
	@FindBy(xpath="")
	private WebElement password;
	
	@FindBy(xpath="")
	private WebElement LoginButton;
	
	public void FacebookLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName()
	{
		userName.sendKeys("Dipali");
	}
	
	public void enterPassword()
	{
		password.sendKeys("Dipali@123");
	}
	
	public void clickOnlLginButton()
	{
		LoginButton.click();
	}

}
