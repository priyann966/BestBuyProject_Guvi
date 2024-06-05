package baseBestBuy;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pagesBestBuy.HomePage;
import pagesBestBuy.LoginBestBuy;
import pagesBestBuy.SearchAddItem;

public class TC_06_SearchAddIteamTestBB extends BaseClassBB {
	@Test(priority = 7)
	public void addToCart() throws InterruptedException {
		HomePage homePage = new HomePage(driver);

		homePage.clickOnCountry();

		SearchAddItem searchitem = new SearchAddItem(driver);
		searchitem.enterSearchText("mouse");

		searchitem.clickonSearchButton();
		searchitem.scrollElement();

		searchitem.clickonCartElement();
		
		searchitem.cartButton();
	}

}
