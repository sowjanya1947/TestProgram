package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32 (86)\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
	}
   
	@Test(priority=4,groups="homepage")
	
	public void Googletitletest() {
		String title = driver.getTitle();
		System.out.println(title);
		// here if text is not matched that time "title is not matched" is displayed in results.
		Assert.assertEquals(title, "Google","title is not matched");
	}
	
	@Test(priority=3,groups="homepage")
	
	public void GoogleLogotest() {
	boolean logo	= driver.findElement(By.xpath("//img[@alt ='Google']")).isDisplayed();
	System.out.println(logo);
	Assert.assertTrue(logo);
	Assert.assertEquals(logo, true);
	}
	
	@Test(priority=2,groups="links")
	
	public void Gmaillink() {
		
		boolean Gmaillink	= driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(Gmaillink);
	}
	
	@Test(priority=1,groups="Search page")
	public void serachpage() {
		System.out.println("Search page");
	}
	
	@AfterMethod
	
	public void teardown() {
		driver.close();
	}
}
