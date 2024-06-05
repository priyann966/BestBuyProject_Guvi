package baseBestBuy;

import org.testng.annotations.Test;
import java.time.Duration;

import org.testng.annotations.Test;

import pagesBestBuy.AddItemByDeptMenu;
import pagesBestBuy.HomePage;
import pagesBestBuy.SearchAddItem;

public class TC_07_AddItemDeptTest extends BaseClassBB {
	
	@Test(priority = 8)

	public void addItemShopByDep() throws InterruptedException {
		
		
		HomePage homePage = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		homePage.clickOnCountry();
		AddItemByDeptMenu deptitem = new AddItemByDeptMenu(driver);
		deptitem.clickMenuButton();
		deptitem.clickTvInMenu();
		deptitem.clickTvsByBrandInnerMenu();
		deptitem.clickSonyTvsInnerMenu2();
		deptitem.scrollDeptElement();

		deptitem.clickonDeptCartElement();
		deptitem.cartButton();

		
	}

}
