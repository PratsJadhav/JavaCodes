import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\NewJobWorkSpace\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[2]/ul/li[1]/a/img"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).contextClick().perform();
	}
}
