package baseBestBuy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pagesBestBuy.HomePage;
import pagesBestBuy.NavigationOfAllMenu;

public class TC_05_TestNavigationOfAllMenu extends BaseClassBB {
	@Test(priority = 6)
	public void testNavigationAllMenuTitle() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnCountry();
		NavigationOfAllMenu allmenu = new NavigationOfAllMenu(driver);

		AssertJUnit.assertEquals(allmenu.topDealsMenu(), "Top Deals and Featured Offers on Electronics - Best Buy");

		AssertJUnit.assertEquals(allmenu.dealsOfTheDayMenu(), "Deal of the Day: Electronics Deals - Best Buy");

		AssertJUnit.assertEquals(allmenu.bestbuyMemberships(), "My Best Buy Memberships");

		AssertJUnit.assertEquals(allmenu.bestbuySells(), "Yes, Best Buy Sells That – Best Buy");

		AssertJUnit.assertEquals(allmenu.creditCardsMenu(), "Best Buy Credit Card: Rewards & Financing");

		AssertJUnit.assertEquals(allmenu.giftCardsMenu(), "Gifts Cards and E-Gift Cards - Best Buy");

		AssertJUnit.assertEquals(allmenu.giftIdeasMenu(), "Gift Ideas 2024: Best Gifts to Give This Year - Best Buy");

		AssertJUnit.assertEquals(allmenu.shopWithanExpert(), "Shop with an Expert - Best Buy");

		AssertJUnit.assertEquals(allmenu.bestBuyBusinessMenu(), "Best Buy for Business - Best Buy");

		AssertJUnit.assertEquals(allmenu.bestBuyOutletMenu(), "Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");

		AssertJUnit.assertEquals(allmenu.cartButton(), "Cart - Best Buy");

		AssertJUnit.assertEquals(allmenu.yardBird(), "Yardbird: Beautiful, High-Quality Outdoor Furniture");

	}

}
