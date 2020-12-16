package com.commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	
	public static WebDriver driver ;
	
	
	public static void Initialization() {
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32 (86)\\chromedriver.exe");
		
		          driver = new ChromeDriver();
		          driver.get("http://www.google.com");
		
	}
	
	public void FailTCscreenshot(String TCMethodname) {
		
		              File SourceFile    =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		              try {
						FileUtils.copyFile(SourceFile , new File ("C:\\Users\\sowja\\eclipse-workspace\\TestProgram\\src\\com\\testng\\TestScreenshots\\"+TCMethodname+"_"+".jpg"));
					} catch (IOException e) {
						
						e.printStackTrace();
					}
		
	}

}
