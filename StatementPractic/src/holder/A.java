package holder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class A {
	static WebDriver driver;
	public static void BitTech()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\himesh\\Desktop\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bluefly.com/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//button[@class='nIK3n']"));
		WebElement ele1=driver.findElement(By.xpath("//button[text()='Women']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	}
	public static void main(String[] args) {
		A.BitTech();
	

	}

}
