package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {
	
	static public WebDriver driver;

	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		
		
		driver=new ChromeDriver();
	}
	
	public static void openUrl(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}

}
