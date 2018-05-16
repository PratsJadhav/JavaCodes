import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String args[]) throws MalformedURLException, IOException
	{
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		Iterator<WebElement> iterator = ele.iterator();
		int respCode = 200;
		String url;
		HttpURLConnection huc = null;
		
		while(iterator.hasNext())
		{
			WebElement element = iterator.next();
			url = element.getAttribute("href");
			
			if(url==null)
			{
				System.out.println("url not set....");
				continue;
			}
			try
			{
			huc = (HttpURLConnection) new URL(url).openConnection();
			huc.setRequestMethod("HEAD");
			huc.connect();
			respCode = huc.getResponseCode();
			
			if(respCode>=400)
				System.out.println(url+" is broken...");
			else
				System.out.println(url +" is valid");
			}catch(Exception e)
			{
				System.out.println(""+e.getMessage());
			}
		}
	}
}
