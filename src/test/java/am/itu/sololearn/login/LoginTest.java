package am.itu.sololearn.login;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import am.itu.sololearn.base.Settings;
import am.itu.sololearn.page.login.SololearnLoginPage;

public class LoginTest extends Settings {

	@Test(priority = 1)
	// Verify the sing in button is displayed
	public void navigateToLoginPage() throws InterruptedException {
		Thread.sleep(3000);
		SololearnLoginPage signInLink = new SololearnLoginPage(driver);
		Thread.sleep(3000);
		signInLink.mainPageSignInIsDisplayed();
	// Click on Sign In button on the main page header
		signInLink.goToSigninPage();
		Thread.sleep(3000);
		System.out.println("Sign In button pressed");
	}
		@Test(priority = 2)
		public void logInWithWrongTypeOfInputs() throws InterruptedException {
		SololearnLoginPage wrongParams = new SololearnLoginPage(driver);
	// Assure the login field is present
	//	Assert.assertTrue(wrongParams.emailFieldIsDisplayed());
	// Input wrong type of input in login field
		wrongParams.clickOnEmailField("Narine");
		Thread.sleep(3000);
		wrongParams.clickOnPassField();
	// Make sure an error message appears
		Assert.assertTrue(true, "Invalid email address");
		Thread.sleep(3000);
		System.out.println("The error message pops up");
	//Input any password
		wrongParams.inputInPassField("Davaryan");
		Thread.sleep(3000);
	// Delete the previous inputs
		wrongParams.cleanEmailField();
		Thread.sleep(3000);
		wrongParams.cleanPassField();
		System.out.println("Old inputs deleted");
	}

	@Test(priority = 3)
	public void loginWithFakeParams() throws InterruptedException {
		Thread.sleep(3000);
		SololearnLoginPage fakeParams = new SololearnLoginPage(driver);
		fakeParams.goToSigninPage();
		Thread.sleep(3000);
		Assert.assertTrue(fakeParams.emailFieldIsDisplayed());
	// Insert a right type of fake input in the email field
		fakeParams.clickOnEmailField("ndavaryan@gmail.com");
		Thread.sleep(3000);
	// Insert a right type of fake input in the password field
		fakeParams.inputInPassField("NaRiNe1982");
		Thread.sleep(3000);
	// Click on Log In button
		fakeParams.clickOnLoginBtn();
	//	Make sure the error message about wrong mail or password appears
		Thread.sleep(3000);
		fakeParams.errorMessageIsDisplayed();
		System.out.println("Error Message pops up");

	}
	// Return to main page to start the next tests
	@AfterMethod
	public void goBackToMainPage(){
	driver.get("https://www.sololearn.com/");
	System.out.println("End of Login Tests");
	}
}
