package FindCar;

import Common.CommonPage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FindCarPage extends CommonPage {

	public FindCarPage(ChromeDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	// Page Elements
	@FindBy(css = "div.select__dropdown-indicator")
	WebElement pickup;

	@FindBy(xpath = "//*[text()='Bagan Airport , Bagan']")
	WebElement pickupLocation;

	@FindBy(xpath = "//input[@name='pickup_date']")
	WebElement pickupDate;

	@FindBy(xpath = "//input[@name='return_date']")
	WebElement returnDate;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/span[2]/*[name()='svg'][1]")
	WebElement nextMonth;

	@FindBy(id = "SimulateButton")
	WebElement simulateBtn;

	// Page Actions
	public void clickPickLocation() {
		wait.until(ExpectedConditions.visibilityOf(pickup)).click();
		wait.until(ExpectedConditions.visibilityOf(pickupLocation)).click();
	}

	public void enterPickupDate(String pickup_Date) {
		wait.until(ExpectedConditions.visibilityOf(pickupDate)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='dayContainer']//*[@aria-label= '" + pickup_Date + "']"))).click();
	}

	public void enterReturnDate(String return_Date) {
		wait.until(ExpectedConditions.visibilityOf(returnDate)).click();
		wait.until(ExpectedConditions.visibilityOf(nextMonth)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='dayContainer']//*[@aria-label= '" + return_Date + "']"))).click();
	}

	public void clickFindCarBtn() {
		wait.until(ExpectedConditions.visibilityOf(simulateBtn)).click();
	}

	public void findCar(String todaysDate, String nextDate) {
		clickPickLocation();
		enterPickupDate(todaysDate);
		enterReturnDate(nextDate);
		clickFindCarBtn();
	}
}
