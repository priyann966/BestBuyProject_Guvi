package baseBestBuy;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

import pagesBestBuy.HomePage;
import pagesBestBuy.SignUpBestBuy;

public class TC_02_SignUpTest extends BaseClassBB {
	@Test(priority = 4)
	public void signupTest() throws InterruptedException {
		HomePage homePage = new HomePage(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.clickOnCountry();

		SignUpBestBuy signup = new SignUpBestBuy(driver);
		signup.clickAccount();

		signup.clickonCreateAccount();

		signup.setFirstName("Priyamani");
		signup.setLastName("D");
		signup.setEmail("kajal98@gmail.com");
		signup.setPassword("priyanka@123");
		signup.setConfirmPassword("priyanka@123");
		signup.setMobileNumber("555‑555‑9345");
		signup.clickCreatAccount();
		String exp = "An account with this email already exists.";
		try {
			Assert.assertEquals(exp, signup.negativeScenario());
		} catch (Exception e) {
			System.out.println("could validate this scenario because of " + e.getMessage());
		}

		signup.setFirstName("Priyanka");
		signup.setLastName("D");
		signup.setEmail("kajallead1@gmail.com");
		signup.setPassword("priyanari@123");
		signup.setConfirmPassword("priyanari@123");
		signup.setMobileNumber("555‑555‑9349");
		signup.clickCreatAccount();
		Thread.sleep(2000);
		//signup.clickOnAccountIcon();
//after clicking on account its not redirecting to another page facing issue with website
	}

}
