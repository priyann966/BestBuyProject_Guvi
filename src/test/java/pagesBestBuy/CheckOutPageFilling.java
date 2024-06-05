package pagesBestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPageFilling {
	
	final WebDriver driver;

	public CheckOutPageFilling(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Cart']")
	WebElement cartButton;
	public void clickCartButton() {
		cartButton.click();
	}
	
	@FindBy(xpath = "//a[@data-track='Attach Modal: Go to cart'][1]")
	WebElement gotocart;
	public void clickGoTocart() {
		gotocart.click();
	}
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkOutInCart;
	public void clickCheckOutInCart() {
		checkOutInCart.click();
	}

	
	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement continueAsGuest;
	public void clickContinueAsGuest() {
		continueAsGuest.click();
	}
	
	@FindBy(id="user.emailAddress")
	WebElement emailAtCheckOut;
	public void enterEmailAtCheckOut(String checkoutemail) {
		emailAtCheckOut.sendKeys(checkoutemail);
	}
	
	@FindBy(id="user.phone")
	WebElement mobileNumAtCheckOut;
	public void enterMobileNumAtCheckOut(String checkoutmob) {
		mobileNumAtCheckOut.sendKeys(checkoutmob);
	}
	
	@FindBy(xpath="//input[@id='text-updates']")
	WebElement textUpdateCheckBox;
	public void clickTextUpdateCheckBox() {
		textUpdateCheckBox.click();
	}
	
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	WebElement continueToPayement;
	public void clickContinueToPayement() {
		continueToPayement.click();
	}
	
	@FindBy(xpath="//input[@id='number']")
	WebElement debitCardNumber;
	public void enterDebitCardNumber(String debtno) {
		debitCardNumber.sendKeys(debtno);
	}
	
	
	public void enterExpMonth() {
		WebElement expMonth=driver.findElement(By.id("expMonth"));
		expMonth.click();
		Select selobj = new Select(expMonth);
		selobj.selectByValue("03");
	}
	
	
	public void enterExpYear() {
		WebElement expYear=driver.findElement(By.id("expYear"));
		expYear.click();
		Select selobj = new Select(expYear);
		selobj.selectByValue("2029");
	}
	
	public void entercvvNo(String cvvno) {
		WebElement cvv=driver.findElement(By.id("cvv"));
		cvv.sendKeys(cvvno);
	}
	
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	public void enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	@FindBy(xpath="//input[@id='street']")
	WebElement address;
	public void enterAddress(String addres) {
		address.sendKeys(addres);
	}
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	public void enterCity(String entercity) {
		city.sendKeys(entercity);
	}
	

	public void enterState() {
		WebElement state=driver.findElement(By.xpath("//select[@id='state']"));
		state.click();
		Select selobj = new Select(state);
		selobj.selectByValue("TX");
	}
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement postalCode;
	public void enterPostalCode(String postalcode) {
		postalCode.sendKeys(postalcode);
	}
	@FindBy(xpath="//span[text()='Apply']")
	WebElement clickonapply;
	public void clickOnApply() {
		clickonapply.click();
	}
	
	@FindBy(xpath="//button[@data-track='Place your Order - Contact Card']")
	WebElement clickonPlaceorder;
	public void clickOnPlaceOrder() {
		clickonPlaceorder.click();
	}
}
