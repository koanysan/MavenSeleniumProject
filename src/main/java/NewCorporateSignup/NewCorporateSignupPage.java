package NewCorporateSignup;

import Common.CommonPage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewCorporateSignupPage extends CommonPage {
	public NewCorporateSignupPage(ChromeDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void clickSignup() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SIGN UP"))).click();
	}

	public void clickNewCorporateRdoBtn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(text(), 'I want to create a new account for my company')]"))).click();
	}

	public void clickJoinNow() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]")))
				.click();
	}

	public void selectEnquiryType() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-type-input"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Open a new corporate account']")))
				.click();
	}

	public void enterCompanyName(String companyName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("company_name"))).sendKeys(companyName);
	}

	public void selectIndustry() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-industry-input"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Banking']"))).click();
	}

	public void enterContactPerson(String contactPerson) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contact_person"))).sendKeys(contactPerson);
	}

	public void enterJobTitle(String jobTitle) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("job_title"))).sendKeys(jobTitle);
	}

	public void selectExt() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-country_code-input"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='🇲🇲 MM (+95)']"))).click();
	}

	public void enterPhoneNo(String phoneNo) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("national_number"))).sendKeys(phoneNo);
	}

	public void enterEmail(String email) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(email);
	}

	public void clickSubmitBtn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type = 'submit']"))).click();
	}

	public String getTitle() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("swal-title"))).getText();
	}

	public String getSuccessContent() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("swal-text"))).getText();
	}

	public void clickOkBtn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[contains(@class, 'swal-button--confirm') and text()='OK']"))).click();
	}
}
