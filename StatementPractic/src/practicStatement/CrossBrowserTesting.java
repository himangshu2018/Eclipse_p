package practicStatement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting{
	public static WebDriver driver;
	
	public static int browsers;
	
	public static String browserName;
	

	public static void main(String[] args) {
		
		for ( int browsers=1; browsers<=3; browsers++)
		{
			if(browsers==1)
				
			{

				System.setProperty("webdriver.chrome.driver",  "C:\\Users\\himesh\\Desktop\\selenium\\chromedriver.exe");
				
				driver= new ChromeDriver();
				browserName="Chrome Browser Opened";
				
			}
			
			else if(browsers==2)
			{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\himesh\\Desktop\\selenium\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				browserName="IE Browser Opened";
			
			}
			
			else if(browsers==3)
			{
				driver=new FirefoxDriver();
				browserName="Firefox Browser Opened";
			}
			driver.get("https://www.google.com");
		
			
		}
		

	}

}
