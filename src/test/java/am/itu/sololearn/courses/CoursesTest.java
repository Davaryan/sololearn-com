package am.itu.sololearn.courses;
import am.itu.sololearn.base.Settings;
import am.itu.sololearn.page.courses.CoursesPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class CoursesTest extends Settings {
	
		
	@Test (priority=1)
	// Verify the Courses link/button is displayed on main page header menu 
	public void isCoursesLinkPresent() throws InterruptedException {
		CoursesPage link=new CoursesPage(driver);
		Assert.assertTrue(link.isCourseLinkPresent());
		Thread.sleep(5000);
	}
	
	@Test (priority=2)
	// Verify the Courses link/button on main page header menu  is clickable
	// Navigate to Courses page
	public void goToCoursesPage() throws InterruptedException {
		CoursesPage page=new CoursesPage(driver);
		page.navigateToCoursePage();
		Assert.assertTrue(true, "What would you like to learn?");
		Thread.sleep(5000);
		Assert.assertTrue(page.isHeadDisplayed());
		}
	
	@AfterMethod
	// Go back to courses page before the next test
	public void backToCoursesPage(){
	driver.get("https://www.sololearn.com/learning");
	}
		}
