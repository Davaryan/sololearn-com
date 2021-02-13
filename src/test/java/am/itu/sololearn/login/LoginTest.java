package am.itu.sololearn.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.sololearn.base.Settings;
import am.itu.sololearn.page.login.SololearnLoginPage;

public class LoginTest extends Settings {

	@Test(priority = 1)
	public void loginWithWrongInputs() throws InterruptedException {
		Thread.sleep(3000);
		SololearnLoginPage signIn = new SololearnLoginPage(driver);
		Thread.sleep(3000);
//		signIn.goToSigninPage();
		Thread.sleep(3000);
		Assert.assertTrue(signIn.emailFieldIsDisplayed());

		signIn.emailFieldIsDisplayed();
		signIn.clickOnEmailField("Narine");
		Thread.sleep(3000);
		signIn.clickOnPassField();
		Assert.assertTrue(true, "Invalid email address");
		Thread.sleep(3000);
		signIn.inputInPassField("Davaryan");
		Thread.sleep(3000);
		signIn.cleanEmailField();
		Thread.sleep(3000);
		signIn.cleanPassField();

	}

//	@Test(priority = 2)
//	public void loginWithFakeParams() throws InterruptedException {
//		Thread.sleep(3000);
//		SololearnLoginPage signIn = new SololearnLoginPage(driver);
//		signIn.goToSigninPage();
//		Thread.sleep(3000);
//		Assert.assertTrue(signIn.emailFieldIsDisplayed());
//		
//		signIn.clickOnEmailField("ndavaryan@gmail.com");
//		Thread.sleep(3000);
//		
//		signIn.inputInPassField("NaRiNe1982");
//		Thread.sleep(3000);
//		signIn.clickOnLoginBtn();
//
//	}
}
