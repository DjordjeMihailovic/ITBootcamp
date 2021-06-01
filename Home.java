package Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	public static final String URL = "https://www.saucedemo.com/";
	public static final String UserID = "user-name";
	public static final String PasswordID = "password";
	public static final String LoginID = "login-button";
	
	public static void EnterUser(WebDriver driver, String username) {
		driver.findElement(By.id(UserID)).click();
		driver.findElement(By.id(UserID)).sendKeys(username);
	}
	
	public static void EnterPassword(WebDriver driver, String pass) {
		driver.findElement(By.id(PasswordID)).click();
		driver.findElement(By.id(PasswordID)).sendKeys(pass);
	}
		
	public static void LoginButtonClick(WebDriver driver) {
		driver.findElement(By.id(LoginID)).click();
	}
	
	public static String InventoryURLPath(WebDriver driver) {
		driver.get(URL);
		driver.findElement(By.id(UserID)).click();
		driver.findElement(By.id(UserID)).sendKeys("standard_user");
		driver.findElement(By.id(PasswordID)).click();
		driver.findElement(By.id(PasswordID)).sendKeys("secret_sauce");
		driver.findElement(By.id(LoginID)).click();
		return driver.getCurrentUrl();
	}
}
