package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*  We can pass data driven in multiple forms
     1. Excel file
     2. Config.properties file
     3. Testng.xml file
     4. XML file
     5. DB (Data Base)*/


public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"Username","Password"})
	public void Regallogin(String Username,String Password) {
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32 (86)\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.regalbeloit.com/");
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.xpath("//a[@data-target='#loginModal' and text()='Login']")).click();
		 driver.findElement(By.id("okta-signin-username")).sendKeys(Username);
		 driver.findElement(By.id("okta-signin-password")).sendKeys(Password);
		 driver.quit();
		
	}

}
