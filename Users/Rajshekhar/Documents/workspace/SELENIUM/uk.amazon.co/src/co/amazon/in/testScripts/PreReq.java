package co.amazon.in.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PreReq
{
	WebDriver driver;
	@BeforeTest
	public void openApp()
	{	
//		System.setProperty("webdriver.chrome.driver", "C://2016Workspace//EXEs//chromedriver.exe");
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.co.uk");
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
}
