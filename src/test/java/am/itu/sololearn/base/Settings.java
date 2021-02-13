package am.itu.sololearn.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Settings {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://sololearn.com");
		driver.manage().window().maximize();
		System.out.println("after wait");
	}
	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
}
