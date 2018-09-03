/**
 * 
 */
package practicStatement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author himesh
 * This Class will Verify the product
 */
public class Bluefly_Product_Verify {
	
	static WebDriver driver;
	
	public  static void VerifyProduct()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\himesh\\Desktop\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluefly.com/?cm_mmc");
	WebElement element = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/header/div/nav/ul/li[8]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"page-wrapper\"]/header/div/nav/ul/li[8]/a"));
		int count_element=list.size();
		System.out.println(count_element);
		for(int i=0; i<=count_element; i++) {
			System.out.println(i);
			
		}
	
		
	}
	public static void main(String[] args) {
		Bluefly_Product_Verify.VerifyProduct();
		
	}

}
