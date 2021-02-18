package am.itu.sololearn.mainlogo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import am.itu.sololearn.base.Settings;
import am.itu.sololearn.page.home.HomePageHeader;

public class LogoClickTest extends Settings {

	@BeforeMethod
	// Start at the main page
	public void startupPage() {
		driver.get("https://www.sololearn.com/");
	}

	@Test
	// Click on main page header logo to be navigated to the same home page
	public void clickOnHeaderLogo() {
		HomePageHeader homeLogo = new HomePageHeader(driver);
		homeLogo.clickOnLogo();
	}
}
