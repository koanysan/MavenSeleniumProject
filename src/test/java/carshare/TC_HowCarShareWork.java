package carshare;

import org.testng.Assert;
import org.testng.annotations.Test;
import HowCarShareWork.HowCarShareWorkPage;

public class TC_HowCarShareWork extends BaseTestCase {
	@Test
	public void HowCarShareWork() {

		HowCarShareWorkPage shareWork = new HowCarShareWorkPage(driver);
		String title = shareWork.clickHowCarShareWorkLink();
		Assert.assertEquals(title, "How Yoma Car Share Works");
	}
}
