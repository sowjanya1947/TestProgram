package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileuploadpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver",
				  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32 (86)\\chromedriver.exe");
				  
		  WebDriver driver = new ChromeDriver();
		
		  driver.get("https://html.com/input-type-file/");
		  //type = file should mention so that send keys option will work for file uploads
		  driver.findElement(By.id("fileupload")).sendKeys("C:\\Personal\\Job Names.docx");
   
	}

}
