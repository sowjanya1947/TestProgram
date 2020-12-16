package com.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.commonmethods.Baseclass;

@Listeners(com.commonmethods.CustomListener.class)
public class Screenshottest extends Baseclass {

	
	
	@BeforeMethod
	
	public void setup() {
		Initialization();
	}
	
	@Test
	
	public void titile() {
		
		  String title = driver.getTitle();
		  Assert.assertEquals(title, "Google123");
	}
	
@AfterMethod
	
	public void teardown() {
		driver.quit();
	}
	
}
