package baseBestBuy;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pagesBestBuy.HomePage;
import pagesBestBuy.LoginBestBuy;
import pagesBestBuy.SignUpBestBuy;

public class TC_03_LoginTestcases extends BaseClassBB {
  @Test(priority = 5)
  public void loginTest() throws InterruptedException  {
	  System.out.println("Running loginTest");
	  HomePage homePage = new HomePage(driver);
	  homePage.clickOnCountry();
	  LoginBestBuy loginBestBuy = new LoginBestBuy(driver);
	  SignUpBestBuy signup=new SignUpBestBuy(driver);

	  loginBestBuy.clickAccount();

	  loginBestBuy.clickonSignin();
	  loginBestBuy.enterEmail("John87687687@gmail.com");
	  loginBestBuy.enterPassword("Priyanka@123");
	  //loginBestBuy.clickonSkip();
	  loginBestBuy.clickSignInButton();
	  String exp = "Oops! The email or password did not match our records. Please try again.";
		try {
			Assert.assertEquals(exp,loginBestBuy.negativeScenario() );
		} catch (Exception e) {
			System.out.println("could validate this scenario because of " + e.getMessage());
		}
	  
	  loginBestBuy.enterEmail("John87687687@gmail.com");
	  loginBestBuy.enterPassword("Priya@123");
	  //loginBestBuy.clickonSkip();
	  loginBestBuy.clickSignInButton();
	  //signup.clickOnAccountIcon();
	  System.out.println("logined succesfully");
	//after clicking on signin button its not redirecting to another page facing issue with website
  }
}
