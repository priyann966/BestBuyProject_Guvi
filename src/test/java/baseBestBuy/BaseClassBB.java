package baseBestBuy;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassBB {

	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
//		 running tests with headlesschrome facing issues its taking more time to execute and tests are failing
//        ChromeOptions opt =new ChromeOptions();
//        opt.addArguments("--headless=new");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.navigate().to("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		System.out.println("Browser launched");
	}

	@AfterMethod
	public void closeBrowser() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '0.5'");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		// Saving the screenshot in desired location
	File source = screenshot.getScreenshotAs(OutputType.FILE);
		// Path to the location to save screenshot

		FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen" + new Date().getTime() + ".png"));
		System.out.println("Screenshot is captured");
		driver.quit();
		System.out.println("Browser close");

	}

}
