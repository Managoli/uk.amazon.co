package co.amazon.in.testScripts;

import org.testng.annotations.Test;

import co.amazon.in.actionFunctions.CatalogPageActions;
import co.amazon.in.actionFunctions.HomePageActions;

public class SearchTest extends PreReq
{
@Test
public void search() throws InterruptedException
{
	HomePageActions.searchProduct(driver, "IPHONE 6");
	CatalogPageActions.addIphoneToCart(driver);
}
}
