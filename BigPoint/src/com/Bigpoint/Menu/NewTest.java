package com.Bigpoint.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest 
{
	 WebDriver webDriver;	
  
  /**
 * 
 */
@Test(priority = 0)
  public void loadURL() 
  {
	  
	  webDriver.get("http://beta.seafight.com/");
	  webDriver.get("http://ext_vadlamudi:mRDXJRN2zgzcx9@beta.seafight.com");
  }
  @Test(priority = 1)
  public void Signin()
  {
	  WebElement signinButton = webDriver.findElement(By.linkText("Log In"));
  }
  
  @BeforeTest
  public void LoadDriver() 
  {
	  /*System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   webDriver = new ChromeDriver();
	  
	  FirefoxProfile ffprofile = new FirefoxProfile();*/
	  webDriver = new FirefoxDriver();
  }

  @AfterTest
  public void afterClass() 
  {
	  webDriver.close();
  }

}
