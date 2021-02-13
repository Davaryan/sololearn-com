package am.itu.sololearn.courses;
import am.itu.sololearn.base.Settings;
import am.itu.sololearn.page.Java.JavaPage;
import am.itu.sololearn.page.courses.CoursesPage;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CoursesTest extends Settings {
	
	@Test (priority=1)
	public void isCoursesLinkPresent() throws InterruptedException {
		CoursesPage coursesLink=new CoursesPage(driver);
		Assert.assertTrue(coursesLink.isCourseLinkPresent());
		Thread.sleep(5000);
	}
	
	@Test (priority=2)
	public void goToCoursesPage() throws InterruptedException {
		CoursesPage coursesPage=new CoursesPage(driver);
		coursesPage.navigateToCoursePage();
		Assert.assertTrue(true, "What would you like to learn?");
		Thread.sleep(5000);
		Assert.assertTrue(coursesPage.isHeadDisplayed());
		}
	
	@Test (priority=3)
	public void goToJavaPage() throws InterruptedException {
	JavaPage javaPage=new JavaPage(driver);
	javaPage.navigateToJavaPage();
	Thread.sleep(5000);
	}
		}
