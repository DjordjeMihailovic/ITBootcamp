package Utilities;

import org.openqa.selenium.WebDriver;

import Objects.HomePage;
import Objects.LoginPage;

public class LoginTool {

	public static WebDriver driver;
	
	public static void Use(WebDriver driver) {
	driver.get(HomePage.URL);
	MaximizeAndImplicitWait.Use(driver);
	HomePage.PopUpSkip(driver);
	HomePage.LoginClick(driver);

	LoginPage.InputUsernameOrEmail(driver, "bobardo@gmail.com");
	LoginPage.InputPassword(driver, "nemapasvord");
	LoginPage.LogInButtonClick(driver);	
	}
}