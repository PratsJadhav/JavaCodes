import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrokenLink {

	public static void main(String args[])
	{
		WebDriver driver;
		String url;
		HttpURLConnection huc = null;
		int respCode = 200;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\workspace\\SeleniumBasics\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		Iterator<WebElement> iterator = ele.iterator();
		
		while(iterator.hasNext())
		{
			
			url = iterator.next().getAttribute("href");
			System.out.println(url);
			
			if(url==null || url.isEmpty())
			{
				System.out.println("url not configured... \n");
				continue;
			}
			
			try
			{
				huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				respCode = huc.getResponseCode();
				
				if(respCode>=400)
					System.out.println("url is broken \n");
				else
					System.out.println("url is valid \n");
			}
			catch(Exception e)
			{
				
			}
		}	
	}
}
