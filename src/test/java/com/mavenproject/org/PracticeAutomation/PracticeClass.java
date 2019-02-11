package com.mavenproject.org.PracticeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class PracticeClass {
	
	WebDriver driver;
	@Test
	public void register()
	{
		LoginphpTravel login=new LoginphpTravel(driver);
		login.loginMethod();
		
		Sighin sign=new Sighin(driver);
		sign.signinMethod();
		
		TourDetails tour=new TourDetails(driver);
		tour.tourdetailsMethod();
	}
	 @Parameters("browser")
	  @BeforeTest
	  public void setupMethod(String browserName) 
	  {
		  String bro=browserName;
		  
		  if (bro.equalsIgnoreCase("chrome")) 
		  {
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver=new ChromeDriver();
		  }
		  else if (bro.equalsIgnoreCase("firefox")) 
		  {
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
			driver=new FirefoxDriver();
		  }
		  else if (bro.equalsIgnoreCase("ie")) 
		  {
			System.setProperty("webdriver.ie.driver", "Resource/IDEriverServer.exe");
			driver=new InternetExplorerDriver();
		  }
		  else 
		  {
			System.out.println("No such Browser");
			
		  }
		  driver.manage().window().maximize();
		  driver.get("http://newtours.demoaut.com/mercuryregister.php");
	  }
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	

}
