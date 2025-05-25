package carshare;

import org.testng.Assert;
import org.testng.annotations.Test;

import ExistingCorporateSignup.ExistingCorporateSignupPage;

public class TC_ExistingCorporateSignup extends BaseTestCase {
	@Test
	public void Singup() {

		ExistingCorporateSignupPage existingCorporate = new ExistingCorporateSignupPage(driver);

		existingCorporate.clickSignup();
		existingCorporate.clickExistingCorporateRdoBtn();
		existingCorporate.clickJoinNow();
		existingCorporate.selectEnquiryType();
		existingCorporate.enterCompanyName("Testing");
		existingCorporate.selectIndustry();
		existingCorporate.enterContactPerson("Kyaw Kyaw");
		existingCorporate.enterJobTitle("Banking Staff");
		existingCorporate.selectExt();
		existingCorporate.enterPhoneNo("09689999999");
		existingCorporate.enterEmail("test@gmail.com");
		existingCorporate.clickSubmitBtn();

		String title = existingCorporate.getTitle();
		Assert.assertEquals(title, "Successful");

		String content = existingCorporate.getSuccessContent();
		Assert.assertEquals(content,
				"Thank you for your interest in Yoma Car Share services. Our Key Account team will contact you shortly to assist you with your inquiry.");

		existingCorporate.clickOkBtn();

	}
}
