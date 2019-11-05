package cucumber.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageobject 
{
	WebDriver driver;
	
	public LoginPageobject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//[@id='account']/a")
	private WebElement signin_button;
	
	@FindBy(id="log")
	private WebElement username_txtbox;
	
	@FindBy(id="pwd")
	private WebElement password_txtbox;
	
	@FindBy(id="login")
	private WebElement login_button;
	
	public void signinbutton()
	{
		signin_button.click();
	}
	
	public void setusername(String username)
	{
		username_txtbox.sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	
	public void loginbutton()
	{
		login_button.click();
	}

}
