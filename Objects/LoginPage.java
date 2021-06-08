package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static final String URL = "https://www.humanity.com/app/";
	public static final String UsernameOrEmailField_Xpath = "//*[@id=\"email\"]";
	public static final String PasswordField_Xpath = "//*[@id=\"password\"]";
	public static final String LogInButton_Xpath = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	
	public static void InputUsernameOrEmail(WebDriver driver, String UsernameOrEmail) {
		driver.findElement(By.xpath(UsernameOrEmailField_Xpath)).click();
		driver.findElement(By.xpath(UsernameOrEmailField_Xpath)).sendKeys(UsernameOrEmail);
	}
	
	public static void InputPassword(WebDriver driver, String password) {
		driver.findElement(By.xpath(PasswordField_Xpath)).click();
		driver.findElement(By.xpath(PasswordField_Xpath)).sendKeys(password);
	}
	
	public static void LogInButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(LogInButton_Xpath)).click();
	}
}
