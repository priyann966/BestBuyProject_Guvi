package pagesBestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationOfAllMenu {
	final WebDriver driver;

	public NavigationOfAllMenu(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Top Deals']")
	WebElement topdealsmenu;
	
	public String topDealsMenu() {
		topdealsmenu.click();
		return driver.getTitle();
	}

	@FindBy(xpath = "//a[text()='Deal of the Day']")
	WebElement dealsofthedaymenu;
	
	public String dealsOfTheDayMenu() {
		dealsofthedaymenu.click();
		return driver.getTitle();
	}
	
	@FindBy(xpath = "//a[text()='Yes, Best Buy Sells That']")
	WebElement bestbuysells;
	public String bestbuySells() {
		bestbuysells.click();
		return driver.getTitle();

	}
	
	@FindBy(xpath = "//a[text()='My Best Buy Memberships'][1]")
	WebElement bestbuymemberships;
	public String bestbuyMemberships() {
		bestbuymemberships.click();
		return driver.getTitle();

	}
		
	@FindBy(xpath = "//a[text()='Credit Cards']")
	WebElement creditcardsmenu;
	public String creditCardsMenu() {
		creditcardsmenu.click();
		return driver.getTitle();

	}

	@FindBy(xpath = "//a[text()='Gift Cards']")
	WebElement giftcardsmenu;
	public String giftCardsMenu() {
		giftcardsmenu.click();
		return driver.getTitle();

	}

	@FindBy(xpath = "//a[text()='Gift Ideas']")
	WebElement giftideasmenu;
	public String giftIdeasMenu() {
		giftideasmenu.click();
		return driver.getTitle();

	}
	
	@FindBy(xpath = "//a[text()='Best Buy Outlet']")
	WebElement bestbuyoutletmenu;
	public String bestBuyOutletMenu() {
		bestbuyoutletmenu.click();
		return driver.getTitle();

	}

	@FindBy(xpath = "//a[text()='Best Buy Business']")
	WebElement bestbuybusinessmenu;
	public String bestBuyBusinessMenu() {
		bestbuybusinessmenu.click();
		return driver.getTitle();

	}
	
	@FindBy(xpath = "//a[text()='Shop with an Expert'][1]")
	WebElement shopwithanexpert;
	
	public String shopWithanExpert() {
		shopwithanexpert.click();
		return driver.getTitle();

	}
			
	
	public String yardBird() throws InterruptedException {
		WebElement yardbird=driver.findElement(By.xpath("//a[text()='Yardbird']"));
		yardbird.click();
		String winHandleBefore = driver.getWindowHandle();
		Thread.sleep(2000);
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);	    
		}
		String title=driver.getTitle();
		return title ;

	}
	
	@FindBy(xpath = "//span[text()='Cart']")
	WebElement cartbutton;
	public String cartButton() {
		cartbutton.click();
		return driver.getTitle();

	}
}
