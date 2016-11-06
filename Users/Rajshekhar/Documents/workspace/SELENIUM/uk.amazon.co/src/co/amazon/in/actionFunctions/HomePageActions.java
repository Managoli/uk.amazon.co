package co.amazon.in.actionFunctions;

import org.openqa.selenium.WebDriver;

import co.amazon.in.objectRepository.HomePageObjects;
import co.amazon.in.genericLibrary.*;

public class HomePageActions extends HomePageObjects 
{
	public static void searchProduct(WebDriver driver, String text)
	{
		GenericLibrary.inputText(driver, 3, HomePageObjects.xpath_searchTextBox, "IPHONE 6");
		GenericLibrary.click(driver, 3, HomePageObjects.xpath_submitButton);
	}

}
