package exceldatareading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Newtest {
WebDriver driver;
	@Test
	public void main() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://spicejet.com/");
		  driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		  
	}

}
