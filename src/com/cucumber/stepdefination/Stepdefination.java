package com.cucumber.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.pageobjects.HomepagePageobjects;
import cucumber.pageobjects.LoginPageobject;

public class Stepdefination {
	WebDriver driver;
	HomepagePageobjects homepage;
	LoginPageobject loginpage;
	Scenario scenario;

	/*@Before("@selenium")
	public void launchbrowser(Scenario scenario)
	{
		this.scenario=scenario;
		System.out.println("Execute scenario"+scenario.getName());
	}
	@After("@selenium")
	public void killbrowser()
	{
		scenario.write("finished scenario");
		if (scenario.isFailed()) 
		{
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "imgage/png");
			
		}
		driver.close();
		driver.quit();
		
	}*/
	@Given("^Launch the application$")
	public void launch_the_application() throws Throwable {
		System.out.println("Welcom to HCl");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khaja.h\\Desktop\\Bhanupratap_frameworks\\selenium\\lib\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.store.demoqa.com");
	}

	@And("click on signin button")
	public void click_on_sigin_button() {
		loginpage = new LoginPageobject(driver);
		loginpage.signinbutton();
	}

	@When("^enter username \"([^\"]*)\"$")
	public void enter_username(String username) throws Throwable {
		loginpage.setusername(username);
	}

	@When("^enter password \"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {
		loginpage.setpassword(password);
	}

	@When("^click on signin tab$")
	public void click_on_signin_tab() throws Throwable {
		loginpage.loginbutton();
	}

	@Then("^loin to the application successfully$")
	public void loin_to_the_application_successfully() throws Throwable {
		System.out.println("login into the application sccessfully");
	}

}
