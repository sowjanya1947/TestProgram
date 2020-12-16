package com.testngDataDriventest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtility;

public class Regalmultiplelogintest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32 (86)\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.regalbeloit.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.xpath("//a[@data-target='#loginModal' and text()='Login']")).click();
		
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		   ArrayList<Object[]> testdata = TestUtility.getDataFromExcel();
		   return  testdata.iterator();
		
	}
	
	@Test(dataProvider = "getTestData")
	public void Login(String Username,String Password) {
		driver.findElement(By.id("okta-signin-username")).sendKeys(Username);
		driver.findElement(By.id("okta-signin-password")).sendKeys(Password);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
