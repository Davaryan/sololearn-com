package am.itu.sololearn.page.sql;

import static am.itu.sololearn.page.courses.CoursesPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololearn.page.courses.CoursesPage;

public class SQLCoursePage extends CoursesPage {

	public SQLCoursePage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath = COURSES_SQL_LINK_XPATH)
	WebElement sqlHome;
}
