import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolling {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\NewJobWorkSpace\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@id='java_technologies']"))));
		
		//scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[text()='Execute Python']")));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		Thread.sleep(4000);
		js.executeScript("window.scroll(0, document.body.scrollHeight)");
	
		
	}
}
