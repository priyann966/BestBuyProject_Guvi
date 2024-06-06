package baseBestBuy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pagesBestBuy.HomePage;

public class TC_01_URLLinkHomepageBestBuy extends BaseClassBB {

	@Test(priority = 2)
	public void testHomepage() {
		HomePage homePage = new HomePage(driver);
		final String title = homePage.getTitle();
		final String actualtitle = "Best Buy International: Select your Country - Best Buy";
		AssertJUnit.assertEquals(actualtitle, title);

	}

	@Test(priority = 3)
	public void selectLocation() throws IOException {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnCountry();
	}

	@Test(priority = 1)
	public void verifyingUrl() throws IOException {
		String url = "https://www.bestbuy.com/";

//		URI uri= new URI(urlString);
//		URL url =uri.toURL();
		URL link = new URL(url);

		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000);
		httpURLConnection.connect();
		int rescode = httpURLConnection.getResponseCode();

		if (rescode >= 400) {
			System.out.println(url + " is broken link");

		} else {
			System.out.println(url + " is valid link");

		}

	}

}
