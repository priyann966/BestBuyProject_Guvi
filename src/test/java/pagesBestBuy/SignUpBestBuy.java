package pagesBestBuy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpBestBuy {
final WebDriver driver;
	
	public SignUpBestBuy(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='Account']")
	WebElement clickonaccount;

	public void clickAccount() {
		clickonaccount.click();
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Create Account']")
	WebElement createaccount;

	public void clickonCreateAccount() {
		createaccount.click();
	}

	public String negativeScenario() {
	WebElement n=driver.findElement(By.xpath("//strong[text()='An account with this email already exists.']"));
	String text=n.getText();
	return text;
		
	}
	@FindBy(id = "firstName")
	WebElement firstName;

	public void setFirstName(String strfirstName) {
		firstName.sendKeys(Keys.chord(Keys.CONTROL, "a"), strfirstName);
	}

	@FindBy(id = "lastName")
	WebElement lastName;

	public void setLastName(String strlastName) {
		lastName.sendKeys(Keys.chord(Keys.CONTROL, "a"), strlastName);
	}

	@FindBy(id = "email")
	WebElement email;

	public void setEmail(String strEmail) {
		email.sendKeys(Keys.chord(Keys.CONTROL, "a"), strEmail);
	}

	@FindBy(id = "fld-p1")
	WebElement password;

	public void setPassword(String strPassword) {
		password.sendKeys(Keys.chord(Keys.CONTROL, "a"), strPassword);
	}

	@FindBy(id = "reenterPassword")
	WebElement confirmPassword;

	public void setConfirmPassword(String strconfirmPassword) {
		confirmPassword.sendKeys(Keys.chord(Keys.CONTROL, "a"), strconfirmPassword);
	}

	@FindBy(id = "phone")
	WebElement mobileNumber;

	public void setMobileNumber(String strmobileNumber) {
		mobileNumber.sendKeys(Keys.chord(Keys.CONTROL, "a"), strmobileNumber);
	}

	@FindBy(id = "is-recovery-phone")
	WebElement recoveryCheckBox;

	public void clickonRecoveryCheckBox() {
		recoveryCheckBox.click();
	}


	public void clickCreatAccount() throws InterruptedException {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Create an Account']"))).click();	
		Thread.sleep(4000);

//		WebElement clickcreataccount=driver.findElement(By.xpath("//button[text()='Create an Account']"));
//		clickcreataccount.click();
	}


	public void clickOnAccountIcon() {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='v-p-right-xxs line-clamp']"))).click();		

	}
		
	
	
}
