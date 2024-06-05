package baseBestBuy;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pagesBestBuy.HomePage;
import pagesBestBuy.LoginBestBuy;
import pagesBestBuy.SignUpBestBuy;

public class TC_03_LoginTestcases extends BaseClassBB {
  @Test(priority = 5)
  public void loginTest()  {
	  System.out.println("Running loginTest");
	  HomePage homePage = new HomePage(driver);
	  homePage.clickOnCountry();
	  LoginBestBuy loginBestBuy = new LoginBestBuy(driver);
	  SignUpBestBuy signup=new SignUpBestBuy(driver);

	  loginBestBuy.clickAccount();

	  loginBestBuy.clickonSignin();
	  loginBestBuy.enterEmail("John87687687@gmail.com");
	  loginBestBuy.enterPassword("Priya@123");
	  //loginBestBuy.clickonSkip();
	  loginBestBuy.clickSignInButton();
	  signup.clickOnAccountIcon();
	  System.out.println("logined succesfully");

  }
}
