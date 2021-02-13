package am.itu.sololearn.page.courses;

import static am.itu.sololearn.page.courses.CoursesPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololearn.page.Java.JavaPage;
import am.itu.sololearn.page.base.BasePage;

public class CoursesPage extends BasePage {

	public CoursesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = COURSES_LINK_HEADER_XPATH)
	WebElement coursesLink;

	public boolean isCourseLinkPresent() {
		return coursesLink.isDisplayed();
}

	public CoursesPage navigateToCoursePage() {
		coursesLink.click();
		return new CoursesPage(driver);
	}
	
	@FindBy (xpath=COURSES_PAGE_HEAD1_XPATH)
	WebElement pageHead;
	public boolean isHeadDisplayed() {
		return pageHead.isDisplayed();
	}
	@FindBy (xpath=COURSES_JAVA_LINK_XPATH)
	WebElement javaCourse;
	public CoursesPage navigateToJavaPage() {
	javaCourse.click();
	return new JavaPage(driver);
		
	}
}
