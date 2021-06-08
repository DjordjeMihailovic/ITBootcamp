package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.ProfilePage;
import Utilities.LoginTool;

public class Profile_ChangePass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		LoginTool.Use(driver);
		
		ProfilePage.ChangePassword(driver, "nemapasvord", "novipasvord");
				
	}
}
