package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	//precondition annotations -- starting with @Before
	
	@BeforeSuite //1
	public void setup() {
		System.out.println("Setup system properties for chrome");
	}
	
	@BeforeClass //3
	public void LaunchBrowser() {
		System.out.println("Launch chrome Browse");		
	}
	
    @BeforeTest //2
	public void Enterurl() {
		System.out.println("Enter URL");	
	}
    @BeforeMethod //4
    public void login() {
    	System.out.println("Login from app");
    }
    
    //test-cases -- starting with @Test
    
    @Test //5
    public void googletitletest() {
    	System.out.println("Google Title Test");
    }
    
    @Test 
    public void searchtest() {
    	System.out.println("Search Test");
    }
	

    @Test 
    public void GoogleLogotest() {
    	System.out.println("Google Logo Test");
    }
    //post conditions -- starting with @After
    
    @AfterMethod //6
    public void logout() {
    	System.out.println("Logout from app");
    }
    
    @AfterTest //8
    public void deleteallcookies() {
    	System.out.println("Delete all cookies");
    }
    
    @AfterClass //7
    public void closebrowser() {
    	System.out.println("Close Browser");
    }
    
    @AfterSuite //9
    public void createreports() {
    	System.out.println("Testng reports generated");	
    }
}
