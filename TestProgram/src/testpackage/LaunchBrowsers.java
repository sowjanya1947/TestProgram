package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1. Firefox driver - geckodriver
		
		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Personal\\Selenium\\Browsers\\FF\\geckodriver.exe");
		 * 
		 * WebDriver driver = new FirefoxDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.google.com"); Thread.sleep(20); //
		 * driver.findElement(By.partialLinkText("How Search wor")).click();
		 * driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Testing");
		 */
		  
		//  driver.close();
		 
		//2. IE Driver - IEDriverServer
		
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32\\chromedriver.exe"
				 );
				 
				 WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize(); driver.get("https://www.google.com");
		  String title = driver.getTitle(); System.out.println(title);
		  Thread.sleep(300);
		  driver.findElement(By.name("q")).sendKeys("Testing");
		  driver.close();
		 
		
		

	}

}
