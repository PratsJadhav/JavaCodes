import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWaitEg {

	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\NewJobWorkSpace\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.get("https://uat.parcelplatform.com/");
	    Wait<WebDriver> w = new FluentWait<WebDriver>(driver).pollingEvery(5, TimeUnit.SECONDS).withTimeout(15, TimeUnit.SECONDS);
	    
	}
}
