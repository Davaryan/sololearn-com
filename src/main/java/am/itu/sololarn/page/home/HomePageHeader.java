package am.itu.sololarn.page.home;

import static am.itu.sololarn.page.home.HomePageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololearn.page.base.BasePage;
import am.itu.sololearn.page.signInPage.SololearnLoginPage;

public class HomePageHeader extends BasePage{

	public HomePageHeader(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = MAIN_PAGE_HEADER_XPATH)
	WebElement mainPageHeader;

	public boolean mainPageHeaderIsDisplayed() {
		return mainPageHeader.isDisplayed();
	}
	@FindBy(xpath = MAIN_PAGE_LOGO_XPATH)
	WebElement logoMainHeader;

	public boolean mainPageLogoIsDisplayed() {
	return logoMainHeader.isDisplayed();
}
	@FindBy(xpath = COURSES_LINK_XPATH)
	WebElement coursesMainHeader;

	public boolean mainPageCoursesIsDisplayed() {
		return coursesMainHeader.isDisplayed();
}
	public HomePageHeader navigateToCoursesPage() {
		coursesMainHeader.click();
		return new HomePageHeader(driver);
	}
	@FindBy (xpath = CODE_PLAYGROUND_XPATH)
	WebElement codePlaygoundMainHeader; 
	
	public boolean mainPagePlaygroundIsDisplayed(){
	return codePlaygoundMainHeader.isDisplayed();
	}
	@FindBy (xpath = DISCUSS_LINK_XPATH)
	WebElement discussMainHeader; 
	
	public boolean mainPageDiscussIsDisplayed(){
	return discussMainHeader.isDisplayed();
	}
	@FindBy (xpath = TOP_LEARNERS_LINK_XPATH)
	WebElement topLearnersMainHeader; 
	
	public boolean mainPageTopLEarnersIsDisplayed(){
	return topLearnersMainHeader.isDisplayed();
	}
	@FindBy (xpath = BLOG_LINK_XPATH)
	WebElement blogMainHeader; 
	
	public boolean mainPageBlogIsDisplayed(){
	return blogMainHeader.isDisplayed();
	}
	@FindBy (xpath = SIGNIN_ELEMENT_XPATH)
	WebElement signInMainHeader; 
	
	public boolean mainPageSignInIsDisplayed(){
	return signInMainHeader.isDisplayed();
	}
	
	public SololearnLoginPage navigateToSigninPage() {
	signInMainHeader.click();
	return new SololearnLoginPage(driver);
	}
}