package dataproviderwithexceltestcasewise;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Testbase
{
	public static ExtentReports extent;
	public static ExtentTest test;
	public ITestResult result;
	static WebDriver driver;
	
	static {
		Calendar d = Calendar.getInstance();
		//Date d = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("YYYY_MM_DD-hh-mm-ss");
		extent = new ExtentReports(System.getProperty("user.dir") + "/extentreports/test_" + formater.format(d.getTime()) + ".html", false);
	}
	
	public static void getresult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(LogStatus.PASS, result.getName() + " test is pass");
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, result.getName() + " test is skipped and skip reason is:-" + result.getThrowable());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getName() + " test is failed" + result.getThrowable());
			String screen = getScreenShot("");
			test.log(LogStatus.FAIL, test.addScreenCapture(screen));
		} else if (result.getStatus() == ITestResult.STARTED) {
			test.log(LogStatus.INFO, result.getName() + " test is started");
		}
	}
	
	@BeforeMethod()
	public void beforeMethod(Method result) {
		test = extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName() + " test Started");
	}
	
	@AfterClass(alwaysRun = true)
	public void endTest() {
		//driver.quit();
		extent.endTest(test);
		extent.flush();
	}
public static String getScreenShot(String imageName) throws IOException{
		
//		if(imageName.equals("")){
//			imageName = "blank";
//		}
		File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String imagelocation = System.getProperty("user.dir")+"/screenshots/";
		Date d = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("YYYY_MM_DD-hh-mm-ss");
		String actualImageName = imagelocation+imageName+"_"+formater.format(d.getTime())+".png";
		File destFile = new File(actualImageName);
		FileUtils.copyFile(image, destFile);
		return actualImageName;
	}

}
