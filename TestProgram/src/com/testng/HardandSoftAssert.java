package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// in Hard assertion if assert condition fail the next sequence steps will not execute test case will terminate and result is failed.
// in login1 test case mentioned soft assert thats why if assertion failed it will execute next sequence steps of test case.
// for soft assertion in test case end sa.assertall() should mention otherwise test case will mark pass even soft assertion failed. 
// if you want you can create soft assertion in test case level and use it for that test case.
//enabled=false means this Test case is not execute if mention true then TestCase will execute.

public class HardandSoftAssert {
	
	
	SoftAssert sa = new SoftAssert();
	
	
	@Test
	
	public void login() {
		System.out.println("Login page opened");
		Assert.assertEquals(true, true);
		System.out.println("Enter user name");
		System.out.println("Enter Password");
		Assert.assertEquals(false, true);
		System.out.println("click sign in button");
		System.out.println("Home page open");
		
		
	}
	
	@Test(enabled=false)
	
	    public void login2() {
		
		System.out.println("This TC will not execute");
	}
	
@Test
	
	public void login1() {
		System.out.println("Login1 page opened");
		Assert.assertEquals(true, true);
		System.out.println("Enter user name1");
		System.out.println("Enter Password1");
		sa.assertEquals(false, true);
		System.out.println("click sign1 in button");
		System.out.println("Home page1 open");
		sa.assertAll("failed steps");
		
	}

}
