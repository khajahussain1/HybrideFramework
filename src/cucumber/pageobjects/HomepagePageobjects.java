package cucumber.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePageobjects {
	
	WebDriver driver;
	
	public HomepagePageobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	private WebElement myaccount_button;
	
	public void clickonmyaccountbutton()
	{
		myaccount_button.click();
	}
	

}
