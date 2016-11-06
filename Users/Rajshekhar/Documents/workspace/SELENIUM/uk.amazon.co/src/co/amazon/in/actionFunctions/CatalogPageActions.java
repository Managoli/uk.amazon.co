package co.amazon.in.actionFunctions;

import org.openqa.selenium.WebDriver;

import co.amazon.in.genericLibrary.GenericLibrary;
import co.amazon.in.objectRepository.CartPageObjects;
import co.amazon.in.objectRepository.ProductslistObjects;

public class CatalogPageActions 
{
	public static void addIphoneToCart(WebDriver driver) throws InterruptedException
	{
		String s;
		s = GenericLibrary.getText(driver, 3, ProductslistObjects.xpath_Product);
		System.out.print(s);
		if(s.contains("Apple iPhone 6"))
		{
			System.out.print("Inside");
			GenericLibrary.click(driver, 3, ProductslistObjects.xpath_Product);
			Thread.sleep(5000);
			GenericLibrary.click(driver, 3, ProductslistObjects.ID_AddToCartButton);
		//	GenericLibrary.javascriptClick(driver, ProductslistObjects.ID_AddToCartButton);
			GenericLibrary.click(driver, 3, CartPageObjects.xpath_cartView);
			Thread.sleep(5000);
		//	GenericLibrary.selectOnHover(driver, 2, CartPageObjects.class_qty);
//			GenericLibrary.javascriptClick(driver, CartPageObjects.xpzth_qty);
//			GenericLibrary.click(driver, 1, CartPageObjects.id_qty);
		}		
	}
}
