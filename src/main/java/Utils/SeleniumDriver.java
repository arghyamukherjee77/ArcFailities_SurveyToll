package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumDriver {

	// Singleton pattern
	private static SeleniumDriver seleniumdriver;

	// Initialize WebDriver
	private static WebDriver driver;

	private static final int waittime = 10;

	private static final int pageload_timeout = 30;

	private static WebDriverWait wait;

	private SeleniumDriver() {
		if (Common.browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if ((Common.browser).equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageload_timeout, TimeUnit.SECONDS);
	}

	public static void openPage(String url) {
    	System.out.println(url);
    	System.out.println(driver);
        driver.get(url);
    }

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {
		if (seleniumdriver == null) {
			seleniumdriver = new SeleniumDriver();
		}

	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumdriver = null;
	}

}
