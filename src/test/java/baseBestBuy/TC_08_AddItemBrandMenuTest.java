package baseBestBuy;

import org.testng.annotations.Test;

import pagesBestBuy.AddItemByBrandMenu;
import pagesBestBuy.HomePage;

public class TC_08_AddItemBrandMenuTest extends BaseClassBB {
	@Test(priority = 9)
	public void addItemFromBrands() throws InterruptedException {
		HomePage homePage = new HomePage(driver);

		homePage.clickOnCountry();
		AddItemByBrandMenu branditem = new AddItemByBrandMenu(driver);

		branditem.clickMenuButton();

		branditem.clickBrandsInMenu();
		branditem.clicklenovoInBrandsMenu();
		branditem.clickThinkPadLaptopsAtLenovoProdPage();

		branditem.clickLenovoThinkPad4TitleAtProdPage();

		branditem.clickaddToCartLenovoThinkPad();
		branditem.cartButton();

	}

}
