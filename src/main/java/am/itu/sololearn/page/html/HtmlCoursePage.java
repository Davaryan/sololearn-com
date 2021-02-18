package am.itu.sololearn.page.html;

import static am.itu.sololearn.page.courses.CoursesPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololearn.page.courses.CoursesPage;

public class HtmlCoursePage extends CoursesPage {

	public HtmlCoursePage(WebDriver driver) {
		super(driver);
}
	@FindBy(xpath = COURSES_HTML_LINK_XPATH)
	WebElement htmlHome;
}
