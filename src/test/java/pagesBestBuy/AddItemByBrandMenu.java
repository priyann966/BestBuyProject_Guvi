package pagesBestBuy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemByBrandMenu {
	
	final WebDriver driver;

	public AddItemByBrandMenu(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Menu']")
	WebElement menuButton;

	public void clickMenuButton() {
		menuButton.click();
	}
	@FindBy(xpath = "//button[text()='Brands']")
	WebElement brandsInMenu;
	public void clickBrandsInMenu() {
		brandsInMenu.click();
	}
	
	@FindBy(xpath = "//a[text()='Lenovo']")
	WebElement lenovoInBrandsMenu;
	public void clicklenovoInBrandsMenu() {
		lenovoInBrandsMenu.click();
	}
	
	@FindBy(xpath="//p[text()='ThinkPad laptops']")
	WebElement thinkPadLaptopsAtLenovoProdPage;
	public void clickThinkPadLaptopsAtLenovoProdPage() {
		thinkPadLaptopsAtLenovoProdPage.click();
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Lenovo - ThinkPad E16 Gen 1 16\" Touch-Screen Lapto')])[1]")
	WebElement lenovoThinkPad4TitleAtProdPage;
	public void clickLenovoThinkPad4TitleAtProdPage() {
		lenovoThinkPad4TitleAtProdPage.click();
	}
	
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART'][1]")
	WebElement addToCartLenovoThinkPad;
	public void clickaddToCartLenovoThinkPad() {
		addToCartLenovoThinkPad.click();
	}
	
	public void cartButton() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement cartbutton = w
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Cart']")));
		cartbutton.click();
	}
	
}
