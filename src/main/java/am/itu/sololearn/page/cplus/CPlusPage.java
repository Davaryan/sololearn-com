package am.itu.sololearn.page.cplus;

import static am.itu.sololearn.page.courses.CoursesPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololearn.page.courses.CoursesPage;

public class CPlusPage extends CoursesPage {

	public CPlusPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath = COURSES_C_PLUS_LINK_XPATH)
	WebElement cPlusHome;
}
