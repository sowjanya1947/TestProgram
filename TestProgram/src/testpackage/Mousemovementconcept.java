package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovementconcept {

	public static void main(String[] args) throws InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32 (86)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 //dynamic wait
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 //in web page we need to do mouse movement operations then use Actions class. will assign driver reference to Actions class.
		 
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		 Thread.sleep(500);
		 driver.findElement(By.linkText("Extra Seat")).click();
		 
		 action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		 Thread.sleep(500);
		 action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		 Thread.sleep(500);
		 driver.findElement(By.linkText("Sign up")).click();
		 

	}

}
