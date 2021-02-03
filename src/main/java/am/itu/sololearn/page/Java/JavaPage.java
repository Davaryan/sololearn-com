package am.itu.sololearn.page.Java;

import static am.itu.sololarn.page.courses.CoursesPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololarn.page.courses.CoursesPage;

public class JavaPage extends CoursesPage {

	public JavaPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = COURSES_JAVA_LINK_XPATH)
	WebElement javaHome;
}
