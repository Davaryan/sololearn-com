package am.itu.sololearn.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.sololearn.page.signInPage.SololearnLoginPage;

public class LoginTest extends Settings {

	@Test(priority = 1)
	public void loginWithWrongInputs() throws InterruptedException {
		SololearnLoginPage signIn = new SololearnLoginPage(driver);
		signIn.navigateToSigninPage();
		Thread.sleep(2000);
		Assert.assertTrue(signIn.emailFieldIsDisplayed());
		signIn.clickOnEmailField("Narine");
		Thread.sleep(2000);
		signIn.clickOnPassField();
		Assert.assertTrue(true, "Invalid email address");
		Thread.sleep(2000);
		signIn.inputInPassField("Davaryan");
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void loginWithFakeParams() throws InterruptedException {
		SololearnLoginPage signIn = new SololearnLoginPage(driver);
		signIn.navigateToSigninPage();
		Thread.sleep(2000);
		Assert.assertTrue(signIn.emailFieldIsDisplayed());
		signIn.clickOnEmailField("ndavaryan@gmail.com");
		Thread.sleep(2000);
		signIn.inputInPassField("NaRiNe1982");
		Thread.sleep(2000);
		signIn.clickOnLoginBtn();

	}
}
