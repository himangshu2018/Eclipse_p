/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author himesh
 * This class will store all locator and methods of the login page
 */
public class LoginPage 
{
	WebDriver driver;
	
  By usreid=By.id("identifierId");
  By nextButton=By.xpath("//span[text()='Next']");
  By password=By.name("password");
  
  public LoginPage (WebDriver driver)
  {
	  this.driver=driver;
  }
  
  public void TypeuserId(String email) 
  {
	driver.findElement(usreid).sendKeys(email);
  }
  
  public void TypePassword(String pass)
  {
	driver.findElement(password).sendKeys(pass);
  }
  
  public void ClickNextButton() 
  {
	driver.findElement(nextButton).click();
  }
  
  
}
