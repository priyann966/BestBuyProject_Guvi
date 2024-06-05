package pagesBestBuy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchAddItem {

	final WebDriver driver;

	public SearchAddItem(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "gh-search-input")
	WebElement search;

	public void enterSearchText(String searchtxt) {
		search.sendKeys(searchtxt);
	}

	@FindBy(xpath = "//button[@title='submit search']")
	WebElement searchButton;

	public void clickonSearchButton() {
		searchButton.click();
	}

	@FindBy(xpath = "//a[text()='Logitech - MX Master 3S Wireless Laser Mouse with Ultrafast Scrolling - Black']")
	WebElement element;

	public void scrollElement() {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		//element.click();
	}

	@FindBy(xpath = "//button[@data-sku-id='6502577'][1]")
	WebElement cartelement;

	public void clickonCartElement() {
//		Actions a = new Actions(driver);
//		a.sendKeys(Keys.PAGE_DOWN).build().perform();
//		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-sku-id=\\\"6502577\\\"][1]"))).click();	

		cartelement.click();
	}
	public void cartButton() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement cartbutton = w
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Cart']")));
		cartbutton.click();
	}
}
