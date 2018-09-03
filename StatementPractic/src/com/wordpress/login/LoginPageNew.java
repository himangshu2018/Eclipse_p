package com.wordpress.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.wordpress.pages.LoginPage;

public class LoginPageNew {
	
	
	static WebDriver driver;
	public LoginPageNew(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using="identifierId")
	WebElement userid;
	
	@FindBy(how=How.NAME) 
	WebElement password;
	
	@FindBy(how=How.LINK_TEXT,using="//span[text()='Next']")
	WebElement nextButton;
	
	
	

	}


