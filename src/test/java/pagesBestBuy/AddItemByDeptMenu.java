package pagesBestBuy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemByDeptMenu {

	final WebDriver driver;

	public AddItemByDeptMenu(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Menu']")
	WebElement menuButton;

	public void clickMenuButton() {
		menuButton.click();
	}

	@FindBy(xpath = "//button[@data-lid='ubr_tv']")
	WebElement tvInMenu;

	public void clickTvInMenu() {
		tvInMenu.click();
	}

	@FindBy(xpath = "//button[text()='TVs by Brand']")
	WebElement tvsByBrandInnerMenu;

	public void clickTvsByBrandInnerMenu() {
		tvsByBrandInnerMenu.click();
	}

	@FindBy(xpath = "//a[text()='Sony TVs']")
	WebElement sonyTvsInnerMenu2;

	public void clickSonyTvsInnerMenu2() {
		sonyTvsInnerMenu2.click();
	}

	public void scrollDeptElement() {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		WebElement element = driver
				.findElement(By.xpath("//a[text()='Sony - 65\" Class BRAVIA XR X90L LED 4K UHD Smart Google TV']"));
		// element.click();
	}

	public void clickonDeptCartElement() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement deptcartelement = w
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-sku-id='6544733'][1]")));
		deptcartelement.click();

	}

//	@FindBy(xpath = "//span[text()='Cart']")
//	WebElement cartbutton;

	public void cartButton() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement deptcartelement = w
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Cart']")));
		deptcartelement.click();
	}
}