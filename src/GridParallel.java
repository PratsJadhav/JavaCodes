import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class GridParallel {
	
   WebDriver driver;
 
  @Parameters("browser")
  @Test
  public void beforeClass(String browser) throws MalformedURLException {
	  
	  if(browser.equals("firefox"))
	  {
		  DesiredCapabilities dp = DesiredCapabilities.firefox();
		  dp.setPlatform(Platform.ANY);
		  dp.setBrowserName("firefox");
		  driver = new RemoteWebDriver(new URL("http://192.168.100.56:4444/wd/hub"), dp);
		  
	  }
	  else if(browser.equals("chrome"))
	  {
		  DesiredCapabilities dp = DesiredCapabilities.chrome();
		  dp.setPlatform(Platform.ANY);
		  dp.setBrowserName("chrome");
		  driver = new RemoteWebDriver(new URL("http://192.168.100.56:4444/wd/hub"), dp);
	  }
	  
	  driver.get("https://www.seleniumhq.org/download/");
  }

  @AfterTest
  public void afterClass() {
  }

}
