import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleeniumGridTest {

	public static void main(String args[]) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setPlatform(Platform.ANY);
		capability.setBrowserName("chrome");
		String nodeURL = "http://192.168.100.56:4444/wd/hub";
		WebDriver driver;
		ChromeOptions opt = new ChromeOptions();
	//	opt.
		driver = new RemoteWebDriver(new URL(nodeURL), capability);
		
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(6000);
	}
}
