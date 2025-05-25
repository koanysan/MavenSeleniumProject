package carshare;

import org.testng.Assert;
import org.testng.annotations.Test;

import ExistingCorporateSignup.ExistingCorporateSignupPage;

public class TC_ExistingCorporateSignup extends BaseTestCase {
	@Test
	public void Singup() {

		ExistingCorporateSignupPage existingCorporate = new ExistingCorporateSignupPage(driver);

		existingCorporate.corporateRegister("Testing", "Kyaw Kyaw", "Banking Staff", "09689999999", "test@gmail.com");

		String title = existingCorporate.getTitle();
		Assert.assertEquals(title, "Successful");

		String content = existingCorporate.getSuccessContent();
		Assert.assertEquals(content,
				"Thank you for your interest in Yoma Car Share services. Our Key Account team will contact you shortly to assist you with your inquiry.");

		existingCorporate.clickOkBtn();

	}
}
