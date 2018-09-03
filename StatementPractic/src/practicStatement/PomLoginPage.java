package practicStatement;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PomLoginPage {
	public static WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"identifierId\"]")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"identifierNext\"]/content/span")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"identifierNext\"]/content/span") 
	WebElement next;
	
	public PomLoginPage (WebDriver driver) {
		this.driver=driver;
	}
	
	public void logingmail(String uid,String pass)
	{
		username.sendKeys(uid);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		next.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		password.sendKeys(pass);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		next.click();
	}

}
