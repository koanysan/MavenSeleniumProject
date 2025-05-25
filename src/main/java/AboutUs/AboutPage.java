package AboutUs;

import Common.CommonPage;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AboutPage extends CommonPage {

	public AboutPage(ChromeDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	// Page Elements
	@FindBy(linkText = "About Us")
	WebElement aboutUsLink;

	@FindBy(xpath = "//h1[@class='font-serif font-bold leading-tight text-2xl my-8 text-center text-black dark:text-textWhite' and text()='About Us']")
	WebElement title;

	// Page Actions
	public void clickAboutUs() {
		wait.until(ExpectedConditions.visibilityOf(aboutUsLink)).click();
	}

	public String getTitle() {
		return wait.until(ExpectedConditions.visibilityOf(title)).getText();
	}

	public String clickAboutUsLink() {
		clickAboutUs();
		return getTitle();
	}
}
