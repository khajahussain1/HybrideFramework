package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataproviderwithexceltestcasewise.Readdatatestcasewise;

public class LoginTest {
	WebDriver driver;

	public LoginTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='account']/a")
	WebElement myaccountlogin_button;

	@FindBy(id = "log")
	WebElement username_txtbox;

	@FindBy(id = "pwd")
	WebElement password_txtbox;

	@FindBy(id = "login")
	WebElement sigin_button;

	public void myaccountlogin() {
		myaccountlogin_button.click();
	}

	public void setusername(String username) {
		username_txtbox.sendKeys(username);
	}

	public void setpassword(String password) {
		password_txtbox.sendKeys(password);
	}

	public void clickonsigninbutton() {
		sigin_button.click();
	}

	public void logintotheapplication(String username, String password) throws IOException {
		try {
			myaccountlogin();
			setusername(username);
			setpassword(password);
			clickonsigninbutton();
		} catch (Exception e) {
			Readdatatestcasewise.getScreenShot(driver, this.getClass().getSimpleName());
		}

	}

}
