package am.itu.sololearn.courses;

import static org.junit.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import am.itu.sololearn.base.Settings;
import am.itu.sololearn.page.Java.JavaPage;

public class JavaTest extends Settings{
	@BeforeMethod
	// Go back to LOGGED IN courses page before the test
	public void backToCoursesPage(){
	driver.get("https://www.sololearn.com/learning");
	}
	@Test (priority=1)
	// Click on Java course link and navigate to Java course page
	public void goToJavaPage() throws InterruptedException {
	JavaPage javaPage=new JavaPage(driver);
	javaPage.navigateToJavaPage();
	}
	@Test (priority=2)
	// Click on Basic consepts
	public void dropJavaBasicMenu() {
	JavaPage basic=new JavaPage(driver);
	basic.basicMenu();
	// Check if further menu is present
	Assert.assertTrue(basic.isIntroPresent());
//	// Click on Intro Java
//	basic.goToIntroJava();
	}
	@Test (priority=3)
	//Click on Loops
	public void dropLoopMenu() {
		JavaPage loops=new JavaPage(driver);
		// Check if further menu is present
		loops.loopsMenu();
		Assert.assertTrue(loops.isLoopSubPresent());
//		// Click on Loops Java
//		loops.goToLoopsJava();
		}
	
	@Test (priority=4)
	//Click on Arrays
	public void dropArrayMenu() {
		JavaPage array=new JavaPage(driver);
		// Check if further menu is present
		array.loopsMenu();
		Assert.assertTrue(array.isArraySubPresent());
//		// Click on Arrays Java
//		array.goToArraySubMenusJava();
		}
		
}
