package holder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browser,String url)
	{
		if(browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\himesh\\Desktop\\selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\himesh\\Desktop\\selenium\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
public static void main(String[] args) {
	Browsers.startBrowser("ie", "http://www.google.com");
}
}
