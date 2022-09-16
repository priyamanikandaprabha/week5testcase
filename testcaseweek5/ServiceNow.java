package testcaseweek5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	public RemoteWebDriver driver;
	public void PreCondition(String browser, String url, String username, String password) {
		//	if(browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			//}else if(browser.equalsIgnoreCase("edge")) 
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			
			
			driver.manage().window().maximize();
			driver.get("url");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.id("username")).sendKeys("username");
			driver.findElement(By.id("password")).sendKeys("password");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			}
			
	}
	

}
