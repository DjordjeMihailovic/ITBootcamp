package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Objects.DashboardPage;
import Objects.HomePage;
import Objects.LoginPage;
import Utilities.ChromeDriverImplement;
import Utilities.LoginTool;
import Utilities.MaximizeAndImplicitWait;

public class DashboardUpperElementsTest {

	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {			
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver(); 		
		LoginTool.Use(driver);
	}
		
	@Test
	public void ShiftPlannigButtonClickTest() {
		DashboardPage.ShiftPlannigButtonClick(driver);
		
		 try {
		        Thread.sleep(3*1000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();		        
		    }
		// za puno zaposlenih treba vremena da se ucita stranica
		String expectedURL = "https://bobardodoo.humanity.com/app/schedule/employee/week/overview/overview/4%2c5%2c2021/";  //poslednje cifre linka variraiju u zavisnosti od broja zaposlenih
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		driver.navigate().back();
	}
	
	@Test
	public void DashboardButtonClickClickTest() {
		DashboardPage.DashboardButtonClick(driver);
		
		String expectedURL = "https://bobardodoo.humanity.com/app/dashboard/";
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	@Test
	public void TimeClockButtonClickTest() {
		DashboardPage.TimeClockButtonClick(driver);
		
		String expectedURL = "https://bobardodoo.humanity.com/app/timeclock/";
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		driver.navigate().back();
	}
	
	@Test
	public void LeaveButtonClickTest() {
		DashboardPage.LeaveButtonClick(driver);
		
		String expectedURL = "https://bobardodoo.humanity.com/app/requests/vacation/"; // nije leave nego vacation
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		driver.navigate().back();
	}
	
	@Test
	public void TrainingButtonClickTest() {
		DashboardPage.TrainingButtonClick(driver);
		
		String expectedURL = "https://bobardodoo.humanity.com/app/training/";
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		driver.navigate().back();
	}
	
	@Test
	public void StaffButtonClickTest() {
		DashboardPage.StaffButtonClick(driver);
					
		String expectedURL = "https://bobardodoo.humanity.com/app/staff/list/load/true/";
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		driver.navigate().back();
		
	}
	
	@Test
	public void AvailabilityButtonClick() {
		DashboardPage.AvailabilityButtonClick(driver);
		
		String expectedURL = "https://bobardodoo.humanity.com/fe/availability/";
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		driver.navigate().back();
	}
	
	@Test
	public void PayrollButtonClickTest() {
		DashboardPage.PayrollButtonClick(driver);
		
		String expectedURL = "https://bobardodoo.humanity.com/app/payroll/scheduled-hours/";
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		driver.navigate().back();
	}
	
	@Test
	public void ReportsButtonClickTest() {
		DashboardPage.ReportsButtonClick(driver);
		
		String expectedURL = "https://bobardodoo.humanity.com/app/reports/dashboard/";
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		driver.navigate().back();
	}
	
	@Test
	public void SettingsButtonClick() {
		DashboardPage.SettingsButtonClick(driver);
		
		String expectedURL = "https://bobardodoo.humanity.com/app/admin/settings/";
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		driver.navigate().back();
	}
}
