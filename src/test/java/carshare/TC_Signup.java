package carshare;

import Signup.SignupPage;
import org.testng.annotations.Test;

public class TC_Signup extends BaseTestCase {
	@Test
	public void signup() {
		SignupPage signup = new SignupPage(driver);
		signup.register("Tester", "test@gmail.com", "NewPass1!", "NewPass1!");
	}
}
