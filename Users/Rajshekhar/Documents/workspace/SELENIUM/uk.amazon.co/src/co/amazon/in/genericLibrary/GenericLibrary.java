package co.amazon.in.genericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenericLibrary
{
	public final static int ID = 1;
	public final static int classname = 2;
	public final static int xpath = 3;
	public final static int css = 4;

	public static WebElement we;
	public static WebElement locator(WebDriver driver, int type, String locatorString)
	{
		/*switch(type)
		{
			case ID : return driver.findElement(By.id(locatorString));
			break;
			
			case classname : return driver.findElement(By.className(locatorString));
			break;
			
			case xpath: return driver.findElement(By.xpath(locatorString));
			break;
			
			case css: return driver.findElement(By.cssSelector(locatorString));
			break;
			
			default : return null;
			break;
		}*/
		
		if(type==xpath)
			return driver.findElement(By.xpath(locatorString));
		else
			return null;
	}

	public static void inputText(WebDriver driver, int type, String locatorString, String text)
	{	try
		{
			we=locator(driver, type, locatorString);
			we.sendKeys(text);
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}
	}
	
	public static void click(WebDriver driver, int type, String locatorString)
	{
		try
		{
			we=locator(driver, type, locatorString);
			we.click();
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}
	}
	
	public static String getText(WebDriver driver, int type, String locatorString)
	{
		try
		{
			we=locator(driver, type, locatorString);
			return we.getText();
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			return "";
		}
	}
	
	public static void selectOnHover(WebDriver driver, int type, String locatorString)
	{
		try
		{
			we=locator(driver, type, locatorString);
			Actions a = new Actions(driver);
			a.moveToElement(we).click().build().perform();
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}
	}
	
	public static void javascriptClick(WebDriver driver, String locatorString)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", locatorString);
	}
	// add other actions methods
	// you can also add remoteWebdriver as a option
}
