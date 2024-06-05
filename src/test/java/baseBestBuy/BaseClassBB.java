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

public class BaseClassBB {

	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\priya\\Desktop\\drivers\\geckodriver.exe");
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Desktop\\drivers\\chromedriver.exe");
//        ChromeOptions opt =new ChromeOptions();
//        opt.addArguments("--headless=new");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));


		System.out.println("Browser launched");
	}

	@AfterMethod
	public void closeBrowser() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '0.5'");
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		
		FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen"+new Date().getTime()+".png"));
		System.out.println("Screenshot is captured");
		driver.quit();
		System.out.println("Browser close");
		
	}

}
