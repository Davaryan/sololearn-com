package am.itu.sololearn.page.Java;

import static am.itu.sololearn.page.Java.JavaPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololearn.page.courses.CoursesPage;

public class JavaPage extends CoursesPage {

	public JavaPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = BACK_TO_COURSES_LINK_XPATH)
	WebElement backToCoursesPage;
	public boolean isBackToCoursesLinkPresent() {
		return backToCoursesPage.isDisplayed();
	}
	public CoursesPage goBackToCoursesPage() {
		backToCoursesPage.click();
		return new CoursesPage(driver);
	}
	@FindBy(xpath = BASIC_CONSEPTS_LINK_XPATH)
	WebElement basic;
	public void basicMenu() {
		basic.click();
	}
	@FindBy(xpath=INTRO_LINK_XPATH)
	WebElement intro;
	public boolean isIntroPresent() {
		return intro.isDisplayed();
	}
	public void goToIntroJava() {
		intro.click();
	}
	@FindBy(xpath = CONDITIONALS_LOOPS_LINK_XPATH)
	WebElement loops;
	public void loopsMenu() {
		loops.click();
	}
	@FindBy(xpath=CONDITIONAL_STATEMENTS_LINK_XPATH)
	WebElement loopsSubMenu;
	public boolean isLoopSubPresent() {
		return loopsSubMenu.isDisplayed();
	}
	public void goToLoopsJava() {
		loopsSubMenu.click();
	}
	@FindBy(xpath = ARRAYS_LINK_XPATH)
	WebElement array;
	public void arrayMenu() {
		array.click();
	}
	@FindBy(xpath=ARRAYS_SUB_LINK_XPATH)
	WebElement arraySubMenu;
	public boolean isArraySubPresent() {
		return arraySubMenu.isDisplayed();
	}
	public void goToArraySubMenusJava() {
		arraySubMenu.click();
	}
}
