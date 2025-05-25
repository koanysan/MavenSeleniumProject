package Signup;

import Common.CommonPage;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignupPage extends CommonPage {

	public SignupPage(ChromeDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	// Page Elements
	@FindBy(linkText = "SIGN UP")
	WebElement signupLink;

	@FindBy(xpath = "//button[text()='Join Now' and not(@disabled)]")
	WebElement joinNowBtn;

	@FindBy(id = "fullName")
	WebElement fullName;

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "confirmPassword")
	WebElement confirmPassword;

	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement submitBtn;

	// Page Actions
	public void clickSignup() {
		wait.until(ExpectedConditions.visibilityOf(signupLink)).click();
	}

	public void clickJoinNow() {
		wait.until(ExpectedConditions.visibilityOf(joinNowBtn)).click();
	}

	public void enterFullName(String fName) {
		wait.until(ExpectedConditions.visibilityOf(fullName)).sendKeys(fName);
	}

	public void enterEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(email);
	}

	public void enterPassword(String pwd) {
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pwd);
	}

	public void enterConfirmPassword(String confirmPwd) {
		wait.until(ExpectedConditions.visibilityOf(confirmPassword)).sendKeys(confirmPwd);
	}

	public void clickSubmitBtn() {
		wait.until(ExpectedConditions.visibilityOf(submitBtn)).click();
	}

	public void register(String username, String email, String pwd, String confirmPwd) {
		clickSignup();
		clickJoinNow();
		enterFullName(username);
		enterEmail(email);
		enterPassword(pwd);
		enterConfirmPassword(confirmPwd);
		clickSubmitBtn();
	}

}
