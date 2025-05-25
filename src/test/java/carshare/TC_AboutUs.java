package carshare;

import AboutUs.AboutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_AboutUs extends BaseTestCase {

	@Test
	public void AboutUs() {
		AboutPage about = new AboutPage(driver);
		String title = about.clickAboutUsLink();
		Assert.assertEquals(title, "About Us");
	}
}
