package carshare;

import org.testng.Assert;
import org.testng.annotations.Test;
import StarterPack.StarterPackPage;

public class TC_StarterPack extends BaseTestCase {
	@Test
	public void AboutUs() {
		StarterPackPage about = new StarterPackPage(driver);
		String title = about.clickStartPackLink();
		Assert.assertEquals(title, "Starter Pack");
	}
}
