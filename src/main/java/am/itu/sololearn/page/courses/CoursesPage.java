package am.itu.sololearn.page.courses;

import static am.itu.sololearn.page.courses.CoursesPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololearn.page.Java.JavaPage;
import am.itu.sololearn.page.base.BasePage;
import am.itu.sololearn.page.cplus.CPlusPage;
import am.itu.sololearn.page.html.HtmlCoursePage;
import am.itu.sololearn.page.pythoncore.PythonCorePage;
import am.itu.sololearn.page.ruby.RubyCoursePage;
import am.itu.sololearn.page.sql.SQLCoursePage;

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
	
	@FindBy (xpath=COURSES_PAGE_HEAD_XPATH)
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
	@FindBy (xpath=COURSES_C_PLUS_LINK_XPATH)
	WebElement cPlusCourse;
	public CoursesPage navigateToCPlusCourse() {
	cPlusCourse.click();
	return new CPlusPage(driver);
		
	}
	@FindBy (xpath=COURSES_PYTHON_CORE_LINK_XPATH)
	WebElement pythonCoreCourse;
	public CoursesPage navigateTopythonCoreCourseCourse() {
	pythonCoreCourse.click();
	return new PythonCorePage(driver);
		
	}
	@FindBy (xpath=COURSES_HTML_LINK_XPATH)
	WebElement htmlCourse;
	public CoursesPage navigateTohtmlCourseCourse() {
		htmlCourse.click();
	return new HtmlCoursePage(driver);
		
	}
	@FindBy (xpath=COURSES_SQL_LINK_XPATH)
	WebElement sqlCourse;
	public CoursesPage navigateToSqlCourseCourse() {
		sqlCourse.click();
	return new SQLCoursePage(driver);
		
	}
	@FindBy (xpath=COURSES_RUBY_LINK_XPATH)
	WebElement rubyCourse;
	public CoursesPage navigateToRubyCourse() {
		rubyCourse.click();
	return new RubyCoursePage(driver);
		
	}
}
