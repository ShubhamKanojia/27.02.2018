package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google {
	
	ChromeDriver driv;
		
	@BeforeTest
	public void ab()
		{
			System.out.println("Before Test");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChInX\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
			driv = new ChromeDriver();
			driv.get("https://www.google.com");
			driv.manage().window().maximize();
		}
	
	@Test
	public void mail()
		{
			WebElement username = driv.findElement(By.xpath("//input[@name='empcode']"));
			username.sendKeys("qeqwe@qdq.com");
			
			WebElement pass = driv.findElement(By.xpath("//input[@name='emppassNTL']"));
			pass.sendKeys("qweqasda");
			
			Actions ac = new Actions(driv);
			ac.sendKeys(Keys.ENTER).perform();
			
			WebElement cross = driv.findElement(By.xpath("//a[@title='close popup']"));
			cross.click();
			
			
			
		}
	
	
}
