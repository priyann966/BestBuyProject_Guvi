package baseBestBuy;

import org.testng.annotations.Test;
import java.time.Duration;


import pagesBestBuy.HomePage;
import pagesBestBuy.SignUpBestBuy;

public class TC_02_SignUpTest extends BaseClassBB {
	@Test(priority = 4)
	public void signupTest()  {
		HomePage homePage = new HomePage(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  homePage.clickOnCountry();

		  SignUpBestBuy signup=new SignUpBestBuy(driver);
		  signup.clickAccount();

		  signup.clickonCreateAccount();

		  signup.setFirstName("Gami");
		  signup.setLastName("D");
		  signup.setEmail("priyageddi98765660@gmail.com");
		  signup.setPassword("Gammi@1234");
		  signup.setConfirmPassword("Gammi@1234");
		  signup.setMobileNumber("5555559819");
		  signup.clickCreatAccount();
		  signup.clickOnAccountIcon();
		  
	}

}
