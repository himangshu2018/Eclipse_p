/**
 * 
 */
package com.wordpress.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author himesh
 * This class will store all locator and methods of the login page
 */
public class LoginPage2 
{
	WebDriver driver;
	
  By userid=By.id("identifierId");
  By nextButton=By.xpath("//span[text()='Next']");
  By password=By.name("password");
  
  public LoginPage2 (WebDriver driver)
  {
	  this.driver=driver;
  }
  
  public void TypeuserId() 
  {
	driver.findElement(userid).sendKeys("ripon.laskar2017@gmail.com");
  }
  
  public void TypePassword()
  {
	driver.findElement(password).sendKeys("Laskar2017");
  }
  
  public void ClickNextButton() 
  {
	driver.findElement(nextButton).click();
  }
  
  public void loginpage(String uid, String pass)
  {System.setProperty("webdriver.chrome.driver", "C:\\Users\\himesh\\Desktop\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/signin/v2");
	driver.findElement(userid).sendKeys(uid);
	driver.findElement(nextButton).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(nextButton).click();
  }
  
}
