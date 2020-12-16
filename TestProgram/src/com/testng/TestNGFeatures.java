package com.testng;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	@Test
	public void loginTest() {
		System.out.print("Login test");
		int i=1/0;
	}

	//if logintest case is fail then Homepagetest is skiped not execute
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		System.out.print("HomePage test");
	}
	//invocationCount is used to execute same test case in 'N' times . Will mention 'N' value here
	@Test(invocationCount=3)
	public void searchpage() {
		
		System.out.print("Searchpage test");
	}
	//invocationTimeOut if test case is in infinite loop if we mention this test case stopped in 2 seconds.
	@Test(invocationTimeOut=2)
	public void infinitelooptest() {
		int i=1;
		while(i==1) {
			System.out.print(i);
		}
	}
	//expectedExceptions - if we know this test case will get exception then if mention this in results status of test case 
	// is passed.
	@Test(expectedExceptions=NumberFormatException.class)
	public void Expectedexception() {
		String x = "100A";
		Integer.parseInt(x);
				
	}
	
}
