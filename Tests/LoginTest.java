package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Objects.DashboardPage;
import Objects.HomePage;
import Objects.LoginPage;
import Utilities.MaximizeAndImplicitWait;
import Utilities.ThreadSleep3;


public class LoginTest {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();		
	}

	@Test
	public void LoginEmailTest() {
		driver.get(LoginPage.URL);
		MaximizeAndImplicitWait.Use(driver);

		LoginPage.InputUsernameOrEmail(driver, "bobardo@gmail.com");
		LoginPage.InputPassword(driver, "nemapasvord");
		LoginPage.LogInButtonClick(driver);
		
		 try {
		        Thread.sleep(3*1000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();		        
		    }
		
		String expectedURL = "https://bobardodoo.humanity.com/app/dashboard/";
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		
	}
}
