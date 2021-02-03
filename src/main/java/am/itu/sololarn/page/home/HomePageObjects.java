package am.itu.sololarn.page.home;

import static am.itu.sololarn.page.home.HomePageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololearn.page.base.BasePage;

public class HomePageObjects extends BasePage {

	public HomePageObjects(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = MAIN_PAGE_START_LEARNING_BTN_XPATH)
	WebElement startLearningBtn;

	public void NavigateToCoursesPage() {
		startLearningBtn.click();
	}

	@FindBy(xpath = HOMEPAGE_COURSE_WRAPPER_XPATH)
	WebElement homepageCourseWrapper;

	public boolean homepageCourseWrapper() {
		return homepageCourseWrapper.isDisplayed();
	}

	@FindBy(xpath = STORES_INFO_XPATH)
	WebElement mainPageStoresInfo;

	public boolean mainPageStoresInfoIsDisplayed() {
		return mainPageStoresInfo.isDisplayed();
	}

	@FindBy(xpath = MAIN_PAGE_REVIEWS_XPATH)
	WebElement mainPageReviews;

	public boolean mainPageReviewsIsDisplayed() {
		return mainPageReviews.isDisplayed();
	}

	@FindBy(xpath = MAIN_PAGE_FOOTER_APP_DWNLD_XPATH)
	WebElement mainPageFooterAppLinks;

	public boolean mainPageFooterAppDwnldIsDisplayed() {
		return mainPageFooterAppLinks.isDisplayed();
	}

	@FindBy(xpath = HOME_FOOTER_XPATH)
	WebElement homeFooter;

	public boolean homeFooterIsDisplayed() {
		return homeFooter.isDisplayed();
	}

	@FindBy(xpath = COURSES_LINK_HEADER_XPATH)
	WebElement headerCoursesLink;
	
	public boolean isHeaderCoursesLinkPresent() {
		return headerCoursesLink.isDisplayed();
	}
	public HomePageObjects navigateToCoursePage() {
		headerCoursesLink.click();
		return new HomePageObjects(driver);
	}

	
}