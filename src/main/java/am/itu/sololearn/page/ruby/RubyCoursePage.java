package am.itu.sololearn.page.ruby;

import static am.itu.sololearn.page.courses.CoursesPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololearn.page.courses.CoursesPage;

public class RubyCoursePage extends CoursesPage {

	public RubyCoursePage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath = COURSES_RUBY_LINK_XPATH)
	WebElement rubyHome;
}
