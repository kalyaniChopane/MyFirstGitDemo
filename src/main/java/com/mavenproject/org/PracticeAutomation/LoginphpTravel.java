package com.mavenproject.org.PracticeAutomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginphpTravel 
{
	WebDriver driver;
	
	@FindBy(name="firstName")
	WebElement Firstname;
	
	@FindBy(name="lastName")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(id="userName")
	WebElement userid;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(id="email")
	WebElement emailid;
	
	@FindBy(name="password")
	WebElement passwordnew;
	
	@FindBy(name="confirmPassword")
	WebElement confirmpass;
	
	@FindBy(name="register")
	WebElement register;

	public LoginphpTravel(WebDriver driver2) {
		driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public void loginMethod()
	{
		Firstname.sendKeys("nicks");
		LastName.sendKeys("jonhs");
		phone.sendKeys("12345658434");
		userid.sendKeys("jacks@gmail.com");
		address.sendKeys("karve road");
		city.sendKeys("Nagpur");
		state.sendKeys("maharashtra");
		emailid.sendKeys("jacks@gmail.com");
		passwordnew.sendKeys("password123");
		confirmpass.sendKeys("password123");
		register.click();
	}
}