package StarterPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Common.CommonPage;

public class StarterPackPage extends CommonPage {
	public StarterPackPage(WebDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	// Page Elements
	@FindBy(linkText = "Starter Pack")
	WebElement starterPackLink;

	@FindBy(xpath = "//h1[@class='font-serif font-bold leading-tight text-2xl my-8 text-center text-black dark:text-textWhite' and text()='Starter Pack']")
	WebElement title;

	// Page Actions
	public void clickStartPack() {
		wait.until(ExpectedConditions.visibilityOf(starterPackLink)).click();
	}

	public String getTitle() {
		return wait.until(ExpectedConditions.visibilityOf(title)).getText();
	}

	public String clickStartPackLink() {
		clickStartPack();
		return getTitle();
	}
}
