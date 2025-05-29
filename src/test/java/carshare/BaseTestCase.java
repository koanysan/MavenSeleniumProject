package carshare;

import utils.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

public class BaseTestCase {

	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@Parameters("browser")
	@BeforeClass
	public void setUp(@Optional("chrome") String browser) {

		driver = DriverManager.getDriver(browser);
	}

	@AfterClass
	public void afterClass() {
		DriverManager.quitDriver();
	}

	@AfterSuite
	public void afterSuite() {
	}

	@BeforeTest
	public void beforeTest() {

	}

	@AfterTest
	public void afterTest() {

	}

}
