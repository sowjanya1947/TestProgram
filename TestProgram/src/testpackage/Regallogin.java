package testpackage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Regallogin {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32 (86)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.regalbeloit.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.xpath("//a[@data-target='#loginModal' and text()='Login']")).click();
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("okta-signin-submit")).click();
		 Thread.sleep(12000);	 
		 driver.findElement(By.xpath("//input[@placeholder='Filter by Account # or Name']")).sendKeys("LOREN COOK CO");
		 Thread.sleep(800);
		 driver.findElement(By.xpath("//button[@class='btn']/child::*")).click();
		 Thread.sleep(300);
	List<WebElement>  Accountnum	= driver.findElements(By.xpath("//span[@class='checkbox__visual']/following::div[2]"));
	for(int i=0;i<Accountnum.size();i++)
	{
		if(Accountnum.get(i).getText().contains("Cancel"))
				{}
		else
		{
        int value = Integer.parseInt(Accountnum.get(i).getText());
        if(value == 5000619) {
        System.out.println("Account num:"+ value);
        Accountnum.get(i).click();
        }
		
        System.out.println("Account num:"+ value);
		
	}
	}
	
		 
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click(); 
		Thread.sleep(300);
		driver.findElement(By.xpath("(//span[@class='checkbox__visual'])[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
        Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//i[@class='fas fa-user']"))).build().perform();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		

	}

}
