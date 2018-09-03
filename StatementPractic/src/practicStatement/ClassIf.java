package practicStatement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassIf {
	static WebDriver driver;
	public static void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\himesh\\Desktop\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.eshopper24.com/");
		driver.manage().window().maximize();
		// verifyCurrentUrl
		if(driver.getCurrentUrl().contains("https://www.eshopper24.com/")) {
			System.out.println("Home page is displayed -passed");
        }
		else
		{
			System.out.println("Home page is not displayed -passed");
		}
	
	 }
	public static void VerifyTitle() {
		String title=driver.getTitle();
		if(driver.getTitle().contains(title)) {
			System.out.println("Title contains Eshopper24");
		}
		else 
		{
			System.out.println("Title not contains Eshopper24");
		}
	}
		public static void  isElementPresent() {
			WebElement element= driver.findElement(By.xpath("//a[text()='New products']"));
			if(element.isDisplayed()){
				System.out.println("True");
				
			       }
			else 
			       {
				System.out.println("False");
			}
		}
		public static void CloseBrowser() {
			driver.quit();
		}
		public static void VerifyText() {
			WebElement element=driver.findElement(By.xpath("//a[text()='Home page']"));
			if(element.isDisplayed() && element.isEnabled()) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
		public static void  isElementVisible() {
			WebElement element= driver.findElement(By.xpath("//a[text()='Boishakhi Collection']"));
			if(element.isEnabled()){
				element.click();
				System.out.println("Element Clicked");
				
			       }
			else 
			       {
				System.out.println("Element not Clicked");
			}
		}
	}


