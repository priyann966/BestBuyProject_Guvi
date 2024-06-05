package pagesBestBuy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage{

	final WebDriver driver;
	
	public HomePage(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//h4[text()='United States'][1]")
	 WebElement country;

	public void clickOnCountry() { 
        country.click(); 
	}
	public String getTitle() {
		return driver.getTitle();
	}
}
