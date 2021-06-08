package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Objects.HomePage;
import Objects.LoginPage;
import Utilities.MaximizeAndImplicitWait;

public class HomePageTest {

	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();		
	}
	
	@Test
	public void AboutUsPathTest() {
		driver.get(HomePage.URL);
		MaximizeAndImplicitWait.Use(driver);
		HomePage.PopUpSkip(driver);
		HomePage.AboutUsClick(driver);
		
		String expectedURL = HomePage.AboutUs_URL;
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		
	}
	
	@Test
	public void LoginPathTest() {
		driver.get(HomePage.URL);
		MaximizeAndImplicitWait.Use(driver);
		HomePage.PopUpSkip(driver);
		HomePage.LoginClick(driver);
		
		String expectedURL = LoginPage.URL;
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		driver.close();
	}

}