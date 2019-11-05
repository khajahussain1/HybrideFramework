package dataproviderwithexceltestcasewise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import junit.framework.Assert;

public class Extentreportdemo {
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./extentreports/Extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		logger = extent.createTest("logintest");
	}

	@Test
	public void Logintest() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		System.out.println("title is" + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("khaja"));

	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String temp = Utility.getscreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),
					MediaEntityBuilder.createScreenCaptureFromPath(temp).build());

		}
		extent.flush();
		driver.quit();
	}

}
