package practicStatement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PomLogin {
public WebDriver driver;
	
	By username=By.id("identifierId");
	By next= By.xpath("//*[@id=\"identifierNext\"]/content/span");
	By password=By.xpath("//*[@id=\"identifierNext\"]/content/span");
	By next2=By.xpath("//*[@id=\"passwordNext\"]/content");
	By error=By.xpath("//*[@id=\"password\"]/div[2]/div[2]");
	
	public PomLogin(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void TypeEmailID(String emailid) 
	{
		driver.findElement(username).sendKeys(emailid);
	}
	
	public void ClearEmailID() 
	{
		driver.findElement(username).clear();
	}
	
	public String CaptureValue() 
	{
		return driver.findElement(username).getAttribute("value");
	}
	
	public void TypePassword(String pass) 
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void CNext() 
	{
		driver.findElement(next).click();
	}
	
	public void CNext1()
	{
		driver.findElement(next2).click();
	}
	public String ErrorMassege()
	{
		return driver.findElement(error).getText();
	}
	

}
