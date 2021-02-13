package am.itu.sololearn.page.login;

import static am.itu.sololearn.page.home.HomePageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololearn.page.base.BasePage;

public class SololearnLoginPage extends BasePage {

	public SololearnLoginPage(WebDriver driver) {
		super(driver);

	}

//	@FindBy(xpath = SIGNIN_ELEMENT_XPATH)
//	WebElement signInMainHeader;
//
//	public boolean mainPageSignInIsDisplayed() {
//		return signInMainHeader.isDisplayed();
//	}
//
//	public SololearnLoginPage goToSigninPage() {
//		signInMainHeader.click();
//		return new SololearnLoginPage(driver);
//	}

	@FindBy(xpath = EMAIL_INPUT_ELEMENT_XPATH)
	WebElement inputEmail;

	public boolean emailFieldIsDisplayed() {
		return inputEmail.isDisplayed();
	}

	public void clickOnEmailField(String email) {
		inputEmail.sendKeys(email);
	}

	public void cleanEmailField() {
		inputEmail.clear();
	}

	@FindBy(xpath = PASS_INPUT_ELEMENT_XPATH)
	WebElement inputPass;

	public boolean passFieldIsDisplayed() {
		return inputPass.isDisplayed();
	}

	public void clickOnPassField() {
		inputPass.click();
	}

	public void inputInPassField(String pass) {
		inputPass.sendKeys(pass);
	}
	public void cleanPassField() {
		inputPass.clear();
	}
	@FindBy(xpath = LOGIN_BTN_XPATH)
	WebElement loginBtn;

	public boolean loginBtnIsDisplayed() {
		return loginBtn.isDisplayed();
	}

	public void clickOnLoginBtn() {
		loginBtn.click();
	}
}
