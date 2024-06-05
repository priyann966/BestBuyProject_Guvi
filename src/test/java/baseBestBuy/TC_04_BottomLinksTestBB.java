package baseBestBuy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import pagesBestBuy.BottomLinksBB;
import pagesBestBuy.HomePage;
import pagesBestBuy.SearchAddItem;

public class TC_04_BottomLinksTestBB extends BaseClassBB {
	@Test(priority = 10)
	public void toVerifyBottomLinks() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnCountry();
		
		BottomLinksBB bottomlinks = new BottomLinksBB(driver);
		bottomlinks.totalBottomlinks();
		
		AssertJUnit.assertEquals( bottomlinks.getBottomLinksText(),"Accessibility - Best Buy");
	

		
	}

}
