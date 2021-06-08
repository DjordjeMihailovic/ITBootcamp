package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.DashboardPage;
import Objects.HomePage;
import Objects.LoginPage;
import Objects.SettingsPage;
import Utilities.LoginTool;
import Utilities.MaximizeAndImplicitWait;

public class LanguageChangeAndUncheckNotifications {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		LoginTool.Use(driver);
				
		DashboardPage.SettingsButtonClick(driver);		

		SettingsPage.LanguageToSerbian(driver);		
		SettingsPage.NotificationUncheck(driver);				
	}
}
