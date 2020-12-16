package com.RetrylogicAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
//retry logic will set in 2 ways. 1 test level time 2. run time

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int counter = 0;
	int retrylimit =3;
	
	public boolean retry(ITestResult result) {
		
		if (counter < retrylimit) {
			counter++;
			return true;
		}
		
		return false;
	}
	

}
