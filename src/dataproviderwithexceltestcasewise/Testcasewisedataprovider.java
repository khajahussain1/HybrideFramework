package dataproviderwithexceltestcasewise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcases.LoginTest;

public class Testcasewisedataprovider extends Testbase {

	private String sTestCaseName;

	private int TestCaseRownumber;
	
	private int TestCaseresultRownumber;

	public static WebDriver driver;

	LoginTest loginpage;

	@BeforeMethod

	public void beforeMethod() throws Exception {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.store.demoqa.com");

	}

	@Test(dataProvider = "Authontication")

	public void f(String sUserName, String sPassword, String sPassword1, String sPassword2) throws Exception {

		System.out.println(sUserName + " : " + sPassword + " : " + sPassword1 + " : " + sPassword2);

		loginpage = new LoginTest(driver);

		try {
			// loginpage.logintotheapplication(sUserName, sPassword);
			loginpage.myaccountlogin();
			loginpage.setusername(sUserName);
			// loginpage.setpassword(sPassword);
			loginpage.clickonsigninbutton();
			driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

			// System.out.println(sPassword1+sPassword2);
			//
			// driver.findElement(By.xpath(".//*[@id='account']/a")).click();
			//
			// driver.findElement(By.id("log")).sendKeys(sUserName);
			//
			// System.out.println(sUserName);
			//
			// driver.findElement(By.id("pwd")).sendKeys(sPassword);
			//
			// System.out.println(sPassword);
			//
			// driver.findElement(By.id("login")).click();
			//
			// System.out.println(" Login Successfully, now it is the time to Log Off
			// buddy.");

			Readdatatestcasewise.setresults("PASS", TestCaseresultRownumber);
			
		} catch (Exception e) {

			Readdatatestcasewise.setresults("FAIL", TestCaseresultRownumber);
			
			Readdatatestcasewise.getScreenShot(driver, sTestCaseName);

		}

		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

	}

	@AfterMethod

	public void afterMethod() {

		driver.close();

	}

	@DataProvider

	public Object[][] Authontication() throws Exception {

		Readdatatestcasewise.setExcelFile("TestCaseData", "TestCaseResults");

		sTestCaseName = this.getClass().getSimpleName();
		
		System.out.println(sTestCaseName);

		TestCaseRownumber = Readdatatestcasewise.getTestCaseRownumber(sTestCaseName);
		
		TestCaseresultRownumber = Readdatatestcasewise.getTestCaseresults(sTestCaseName); 

		Object[][] testdata = Readdatatestcasewise.getcelldata(TestCaseRownumber);

		return testdata;

	}

}