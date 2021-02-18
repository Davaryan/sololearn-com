package am.itu.sololearn.page.pythoncore;

import static am.itu.sololearn.page.courses.CoursesPageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.sololearn.page.courses.CoursesPage;

public class PythonCorePage extends CoursesPage {

	public PythonCorePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = COURSES_PYTHON_CORE_LINK_XPATH)
	WebElement pythonCoreHome;

}
