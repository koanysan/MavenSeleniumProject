package WhyYomaCarShare;

import Common.CommonPage;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarSharePage extends CommonPage {

	public CarSharePage(WebDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}	
	
	// Page Elements
		@FindBy(linkText = "Why Yoma Car Share?")
		WebElement shareLink;

		@FindBy(xpath = "//h1[@class='font-serif font-bold leading-tight text-2xl my-8 text-center text-black dark:text-textWhite' and text()='Why Yoma Car Share?']")
		WebElement title;

		// Page Actions
		public void clickWhyCarShare() {
			wait.until(ExpectedConditions.visibilityOf(shareLink)).click();
		}

		public String getTitle() {
			return wait.until(ExpectedConditions.visibilityOf(title)).getText();
		}

		public String clickWhyCarShareLink() {
			clickWhyCarShare();
			return getTitle();
		}
}
