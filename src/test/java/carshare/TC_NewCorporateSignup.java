package carshare;

import org.testng.Assert;
import org.testng.annotations.Test;
import NewCorporateSignup.NewCorporateSignupPage;

public class TC_NewCorporateSignup extends BaseTestCase {

	@Test
	public void Singup() {

		NewCorporateSignupPage newCorporate = new NewCorporateSignupPage(driver);
		
		newCorporate.clickSignup();
		newCorporate.clickNewCorporateRdoBtn();
		newCorporate.clickJoinNow();
		newCorporate.selectEnquiryType();
		newCorporate.enterCompanyName("Testing");
		newCorporate.selectIndustry();
		newCorporate.enterContactPerson("Kyaw Kyaw");
		newCorporate.enterJobTitle("Banking Staff");
		newCorporate.selectExt();
		newCorporate.enterPhoneNo("09689999999");
		newCorporate.enterEmail("test@gmail.com");
		newCorporate.clickSubmitBtn();

		String title = newCorporate.getTitle();
		Assert.assertEquals(title, "Successful");
		
		String content = newCorporate.getSuccessContent();
		Assert.assertEquals(content, "Thank you for your interest in Yoma Car Share services. Our Key Account team will contact you shortly to assist you with your inquiry.");
	
		newCorporate.clickOkBtn();		
	
	}

}
