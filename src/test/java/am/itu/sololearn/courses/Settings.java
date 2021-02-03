package am.itu.sololearn.courses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Settings {
	WebDriver driver;
	@BeforeClass
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://sololearn.com");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}



