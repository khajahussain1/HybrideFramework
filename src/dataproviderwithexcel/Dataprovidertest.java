package dataproviderwithexcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest {
	
	WebDriver driver;

    @BeforeMethod

    public void beforeMethod() throws Exception {

	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.store.demoqa.com");	 

	}
    @Test
    public void test()
    {
    	
    }

@Test(dataProvider="Authentication")

public void Registration_data(String sUserName,String sPassword, String sPassword1)throws  Exception{

    driver.findElement(By.xpath(".//*[@id='account']/a")).click();

    driver.findElement(By.id("log")).sendKeys(sUserName);

	System.out.println(sUserName);

    driver.findElement(By.id("pwd")).sendKeys(sPassword);

	System.out.println(sPassword);

    driver.findElement(By.id("login")).click();

    System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

    driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

	}

@DataProvider
public Object[][] Authentication() throws Exception{

     Object[][] testObjArray = ExcelUtils.setexcel(System.getProperty("user.dir")+"/src/testData/demo.xlsx","TestData");

     return (testObjArray);
	

	}

@AfterMethod

public void afterMethod() {

	    driver.close();

	}

}