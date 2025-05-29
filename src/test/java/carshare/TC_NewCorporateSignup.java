package carshare;

import org.testng.Assert;
import org.testng.annotations.Test;
import NewCorporateSignup.NewCorporateSignupPage;

public class TC_NewCorporateSignup extends BaseTestCase {

	@Test
	public void Singup() {

		NewCorporateSignupPage newCorporate = new NewCorporateSignupPage(driver);

		newCorporate.corporateRegister("Testing", "Kyaw Kyaw", "Banking Staff", "09689999999", "test@gmail.com");

		String title = newCorporate.getTitle();
		Assert.assertEquals(title, "Successful");

		String content = newCorporate.getSuccessContent();
		Assert.assertEquals(content,
				"Thank you for your interest in Yoma Car Share services. Our Key Account team will contact you shortly to assist you with your inquiry.");

		newCorporate.clickOkBtn();

	}

}
