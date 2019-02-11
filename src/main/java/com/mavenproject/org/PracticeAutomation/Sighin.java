package com.mavenproject.org.PracticeAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Sighin {

	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'sign-in')]")
	WebElement signsite;
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginbutton;
	
	public Sighin(WebDriver driver3) 
	{
		driver=driver3;
		PageFactory.initElements(driver, this);
	}

	
	public void signinMethod() 
	{
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals(driver.getTitle(), "Register: Mercury Tours");
		
		signsite.click();
		username.sendKeys("jacks@gmail.com");
		password.sendKeys("password123");
		loginbutton.click();
		
		assert1.assertAll();
	}
}
