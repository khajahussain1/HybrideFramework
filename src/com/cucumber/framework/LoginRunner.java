package com.cucumber.framework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = { "./featurefile/Loginlogin.feature" }, glue = {
		"classpath:com.cucumber.stepdefination" }, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-reports/extentreport.html",
				"html:target/cucumber-html-report" })

public class LoginRunner 

//extends AbstractTestNGCucumberTests 
{
	private TestNGCucumberRunner testngcucumberrunner;
	String time;
	
	@BeforeClass
	public void setup()
	{
		Calendar cal =Calendar.getInstance();
		SimpleDateFormat formate = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
		time = formate.format(cal.getTime());
		
		testngcucumberrunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(dataProvider = "features")
	public void maintest(CucumberFeatureWrapper cucumberFeature)
	{
		testngcucumberrunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	@DataProvider
	public Object[][] features()
	{
		return testngcucumberrunner.provideFeatures();
		
	}

	@AfterClass
	public void teardown() throws IOException {
		Reporter.loadXMLConfig(new File("target/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
		testngcucumberrunner.finish();
		

	}

}
