package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
	// Step 1: Create a private static instance
	private static WebDriver driver;

	// Step 2: Private constructor to prevent external instantiation
	private DriverManager() {
		// Optional: setup can go here if needed
	}

	// Step 3: Public static method to return the same instance
	public static WebDriver getDriver(String browser) {
		if (driver == null) {

			switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
				options.setExperimentalOption("useAutomationExtension", false);
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://carshare.yomafleet.com");
				break;
			case "firefox":
//				System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
//                driver = new FirefoxDriver();
				break;
			// Add more browsers if needed
			default:
				throw new IllegalArgumentException("Browser not supported: " + browser);

			}
		}
		return driver;
	}

	// Optional: Method to close and nullify the driver instance
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
