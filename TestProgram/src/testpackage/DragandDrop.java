package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {

		
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32 (86)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 //dynamic wait
		 // pageloadtimeout is used to wait 40 seconds to load entire page. if page loaded 2 sec remaining 38 seconds will be ignored. 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 //implicitlywait is used to load the webelements in to the page. if all elements loaded in page taken 2 secs remaining time will ignore.
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 
		 driver.switchTo().frame(0);
		 Actions action = new Actions(driver);
		 action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		 
		 
		 
		 
		 

	}

}
