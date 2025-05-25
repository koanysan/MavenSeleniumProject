package carshare;

import org.testng.Assert;
import org.testng.annotations.Test;
import WhyYomaCarShare.CarSharePage;

public class TC_WhyCarShare extends BaseTestCase {
	@Test
	public void WhyCarShare() {

		CarSharePage share = new CarSharePage(driver);
		String title = share.clickWhyCarShareLink();
		Assert.assertEquals(title, "Why Yoma Car Share?");
	}
}
