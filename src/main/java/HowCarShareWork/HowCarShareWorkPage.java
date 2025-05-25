package HowCarShareWork;

import Common.CommonPage;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HowCarShareWorkPage extends CommonPage {

	public HowCarShareWorkPage(ChromeDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	// Page Elements
	@FindBy(linkText = "How Yoma Car Share works")
	WebElement shareworkLink;

	@FindBy(xpath = "//h1[@class='font-serif font-bold leading-tight text-2xl my-8 text-center text-black dark:text-textWhite' and text()='How Yoma Car Share Works']")
	WebElement title;

	// Page Actions
	public void clickHowCarShareWork() {
		wait.until(ExpectedConditions.visibilityOf(shareworkLink)).click();
	}

	public String getTitle() {
		return wait.until(ExpectedConditions.visibilityOf(title)).getText();
	}

	public String clickHowCarShareWorkLink() {
		clickHowCarShareWork();
		return getTitle();
	}
}
