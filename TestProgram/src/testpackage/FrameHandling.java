package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32 (86)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 //dynamic wait
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		 driver.findElement(By.id("name")).sendKeys("Framestesting");
		 // if frame is available and if we not mention then "no such element: Unable to locate element" exception should display.
		 
		 driver.switchTo().frame("frm2");
		 Thread.sleep(500);
		 driver.findElement(By.id("firstName")).sendKeys("Insideframe2"); 
		 Thread.sleep(500);
		 // Move swithch frame to  normal web page
		 driver.switchTo().defaultContent();
		 //Nested frame means inside frame another frame is exits.
		 
		 driver.switchTo().frame("frm3");
		 Thread.sleep(500);
		 driver.switchTo().frame("frm1");//inside frame3 again go to frame 1
		 Thread.sleep(500);
		 
		 Select Coursename = new Select(driver.findElement(By.id("course")));
		 Thread.sleep(500);
		// Coursename.selectByVisibleText("java");
		 Coursename.selectByIndex(1); 
		 Thread.sleep(500);
		 
		 //again go back to frame 3 means parent frame
		 
		 driver.switchTo().parentFrame();
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("name")).sendKeys("frame3textbox");
		 
          // Move swithch frame to  normal web page
		 
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("name")).sendKeys("Switchback");
		 driver.quit();
		 
		 
		 
		 
		 
		 
		 
		 
		 
	     
	
	
	
	
	}

}
