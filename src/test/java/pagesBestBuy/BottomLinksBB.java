package pagesBestBuy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BottomLinksBB {
	final WebDriver driver;

	public BottomLinksBB(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='legal-navigation flex flex-column']")
	WebElement footer;

	public void totalBottomlinks() {
		List<WebElement> links = footer.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("The Number of bottom Links are " + count);
	}

	@FindBy(xpath = "//a[text()='Accessibility']")
	WebElement accesslink;

	public String getBottomLinksText() {
		accesslink.click();
		return driver.getTitle();

	}

}
