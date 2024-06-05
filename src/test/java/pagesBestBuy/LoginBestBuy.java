package pagesBestBuy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseBestBuy.BaseClassBB;

public class LoginBestBuy extends BaseClassBB{
	
	final WebDriver driver;

	public LoginBestBuy(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//span[text()='Account']")
	WebElement clickonaccount;

	public void clickAccount() {
		clickonaccount.click();
	}


	public void clickonSignin() {
		WebElement clickonSignin=driver.findElement(By.xpath("//a[text()='Sign In']"));
		clickonSignin.click();
	}
	@FindBy(id="fld-e")
	WebElement email_;
	public void enterEmail(String stremail_) {
		email_.sendKeys(stremail_);
	}
	
	@FindBy(id="fld-p1")
	WebElement password_;
	public void enterPassword(String strpassword_) {
		password_.sendKeys(strpassword_);
	}
//	@FindBy(className = "c-button-link cia-cancel")
//	WebElement clickonskip;
//	public void clickonSkip() {
//		clickonskip.click();
//	}
	
//	@FindBy(xpath="//button[text()='Sign In']")
//	WebElement signInButton;
	public void clickSignInButton() {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Sign In']"))).click();	
		//signInButton.click();
	}
	
	
}
