/**
 * 
 */
package com.wordpress.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;
import com.wordpress.pages.LoginPage2;

import holder.Browsers;

/**
 * @author himesh
 * This class will Verify the login page
 */
public class VerifyLoginPage {
	
	
	@Test
	public void VerifyValidLoginPage() throws InterruptedException
	{
		WebDriver driver=Browsers.startBrowser("chrome", "https://www.google.com");
		PageFactory.initElements(driver, LoginPageNew.class);
	}

}
