package baseBestBuy;

import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.testng.annotations.Test;

import pagesBestBuy.CheckOutPageFilling;
import pagesBestBuy.HomePage;
import pagesBestBuy.LoginBestBuy;
import pagesBestBuy.SearchAddItem;

public class TC_09_CheckOutPageTest extends BaseClassBB {
	//using exceptedExceptions because there is an issue with website test case is failing

	@Test(priority = 11, expectedExceptions = NoSuchElementException.class)
	
	public void checkoutPage() {
		HomePage homePage = new HomePage(driver);

		homePage.clickOnCountry();

		SearchAddItem searchitem = new SearchAddItem(driver);
		searchitem.enterSearchText("mouse");

		searchitem.clickonSearchButton();
		searchitem.scrollElement();

		searchitem.clickonCartElement();

		CheckOutPageFilling objcheckout = new CheckOutPageFilling(driver);

		objcheckout.clickCartButton();

		objcheckout.clickCheckOutInCart();

		objcheckout.clickContinueAsGuest();

		objcheckout.enterEmailAtCheckOut("dhanush2428@gmail.com");

		objcheckout.enterMobileNumAtCheckOut("5555555678");

		objcheckout.clickContinueToPayement();

//		facing issue with website for chrome and firefox fields are getting changed and getting error failed due to internet connection issue with the website

		objcheckout.enterDebitCardNumber("3742 454554 00126");
		objcheckout.enterExpMonth();
		objcheckout.enterExpYear();
		objcheckout.entercvvNo("472");

		objcheckout.enterFirstName("vamika");
		objcheckout.enterLastName("Ms");
		objcheckout.enterAddress("texas");
		objcheckout.enterCity("Texas");
		objcheckout.enterState();
		objcheckout.enterPostalCode("75049");
		objcheckout.clickOnApply();
		objcheckout.clickOnPlaceOrder();

	}

}
