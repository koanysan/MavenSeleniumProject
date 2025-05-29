package NewCorporateSignup;

import Common.CommonPage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewCorporateSignupPage extends CommonPage {
	public NewCorporateSignupPage(WebDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

//	public void clickSignup() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SIGN UP"))).click();
//	}
//
//	public void clickNewCorporateRdoBtn() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//span[contains(text(), 'I want to create a new account for my company')]"))).click();
//	}
//
//	public void clickJoinNow() {
//		wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]")))
//				.click();
//	}
//
//	public void selectEnquiryType() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-type-input"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Open a new corporate account']")))
//				.click();
//	}
//
//	public void enterCompanyName(String companyName) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("company_name"))).sendKeys(companyName);
//	}
//
//	public void selectIndustry() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-industry-input"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Banking']"))).click();
//	}
//
//	public void enterContactPerson(String contactPerson) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contact_person"))).sendKeys(contactPerson);
//	}
//
//	public void enterJobTitle(String jobTitle) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("job_title"))).sendKeys(jobTitle);
//	}
//
//	public void selectExt() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-country_code-input"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='🇲🇲 MM (+95)']"))).click();
//	}
//
//	public void enterPhoneNo(String phoneNo) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("national_number"))).sendKeys(phoneNo);
//	}
//
//	public void enterEmail(String email) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(email);
//	}
//
//	public void clickSubmitBtn() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type = 'submit']"))).click();
//	}
//
//	public String getTitle() {
//		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("swal-title"))).getText();
//	}
//
//	public String getSuccessContent() {
//		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("swal-text"))).getText();
//	}
//
//	public void clickOkBtn() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//button[contains(@class, 'swal-button--confirm') and text()='OK']"))).click();
//	}
	// Page Elements
	@FindBy(linkText = "SIGN UP")
	WebElement signupText;

	@FindBy(xpath = "//span[contains(text(), 'I want to create a new account for my company')]")
	WebElement typeOfAccount;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]")
	WebElement joinNowBtn;

	@FindBy(id = "react-select-type-input")
	WebElement enquiryType;

	@FindBy(xpath = "//div[text()='Open a new corporate account']")
	WebElement selectEnquiryType;

	@FindBy(id = "company_name")
	WebElement companyName;

	@FindBy(id = "react-select-industry-input")
	WebElement industryType;

	@FindBy(xpath = "//div[text()='Banking']")
	WebElement selectIndustryType;

	@FindBy(id = "contact_person")
	WebElement contactPerson;

	@FindBy(id = "job_title")
	WebElement jobTitle;

	@FindBy(id = "react-select-country_code-input")
	WebElement countryCode;

	@FindBy(xpath = "//div[text()='🇲🇲 MM (+95)']")
	WebElement selectCountryCode;

	@FindBy(id = "national_number")
	WebElement nationalNumber;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement submitBtn;

	@FindBy(className = "swal-title")
	WebElement swalTitle;

	@FindBy(className = "swal-text")
	WebElement swalText;

	@FindBy(xpath = "//button[contains(@class, 'swal-button--confirm') and text()='OK']")
	WebElement okBtn;

	// Page Actions
	public void clickSignup() {
		wait.until(ExpectedConditions.visibilityOf(signupText)).click();
	}

	public void clickExistingCorporateRdoBtn() {
		wait.until(ExpectedConditions.visibilityOf(typeOfAccount)).click();
	}

	public void clickJoinNow() {
		wait.until(ExpectedConditions.visibilityOf(joinNowBtn)).click();
	}

	public void selectEnquiryType() {
		wait.until(ExpectedConditions.visibilityOf(enquiryType)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Open a new corporate account']")))
				.click();
	}

	public void enterCompanyName(String comName) {
		wait.until(ExpectedConditions.visibilityOf(companyName)).sendKeys(comName);
	}

	public void selectIndustry() {
		wait.until(ExpectedConditions.visibilityOf(industryType)).click();
		wait.until(ExpectedConditions.visibilityOf(selectIndustryType)).click();
	}

	public void enterContactPerson(String cPerson) {
		wait.until(ExpectedConditions.visibilityOf(contactPerson)).sendKeys(cPerson);
	}

	public void enterJobTitle(String jTitle) {
		wait.until(ExpectedConditions.visibilityOf(jobTitle)).sendKeys(jTitle);
	}

	public void selectExt() {
		wait.until(ExpectedConditions.visibilityOf(countryCode)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='🇲🇲 MM (+95)']"))).click();
	}

	public void enterPhoneNo(String phoneNo) {
		wait.until(ExpectedConditions.visibilityOf(nationalNumber)).sendKeys(phoneNo);
	}

	public void enterEmail(String mail) {
		wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(mail);
	}

	public void clickSubmitBtn() {
		wait.until(ExpectedConditions.visibilityOf(submitBtn)).click();
	}

	public String getTitle() {
		return wait.until(ExpectedConditions.visibilityOf(swalTitle)).getText();
	}

	public String getSuccessContent() {
		return wait.until(ExpectedConditions.visibilityOf(swalText)).getText();
	}

	public void clickOkBtn() {
		wait.until(ExpectedConditions.visibilityOf(okBtn)).click();
	}

	public void corporateRegister(String comName, String contactPerson, String jobTitle, String phoneNo, String email) {
		clickSignup();
		clickExistingCorporateRdoBtn();
		clickJoinNow();
		selectEnquiryType();
		enterCompanyName(comName);
		selectIndustry();
		enterContactPerson(contactPerson);
		enterJobTitle(jobTitle);
		selectExt();
		enterPhoneNo(phoneNo);
		enterEmail(email);
		clickSubmitBtn();
	}
}
