package testpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Alertandpopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32 (86)\\chromedriver.exe"
		  );
		  
		  WebDriver driver = new ChromeDriver();
		 

			/*
			 * System.setProperty("webdriver.ie.driver",
			 * "C:\\Personal\\Selenium\\Browsers\\IE\\IEDriverServer.exe");
			 * 
			 * WebDriver driver = new InternetExplorerDriver();
			 */

		driver.manage().window().maximize();

		driver.get("https://www.browserstack.com/users/sign_up");
		
		  driver.findElement(By.id("user_full_name")).sendKeys("test");
		  driver.findElement(By.id("user_email_login")).sendKeys("test2@gmail.com");
		  driver.findElement(By.id("user_password")).sendKeys("test");
		 
		driver.findElement(By.id("user_submit")).click();
		Thread.sleep(500);
		/*
		 * Alert alert = driver.switchTo().alert(); System.out.println(alert.getText());
		 * alert.accept();
		 */

		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage = driver.switchTo().alert().getText(); // capture alert message

		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(5000);
		alert.accept();
		

	}

}
