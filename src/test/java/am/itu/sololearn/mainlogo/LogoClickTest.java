package am.itu.sololearn.mainlogo;

import org.testng.annotations.Test;

import am.itu.sololearn.base.Settings;
import am.itu.sololearn.page.home.HomePageHeader;

public class LogoClickTest extends Settings{

		@Test
		public void clickOnHeaderLogo() {
		HomePageHeader homeLogo=new HomePageHeader(driver);
		homeLogo.clickOnLogo();
		}
}
