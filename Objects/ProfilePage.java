package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
	
	public static final String ProfileButton_Xpath = "//*[@id=\"wrap_us_menu\"]";
	public static final String CurrPassword_Xpath = "//*[@id=\"password_current\"]";
	public static final String NewPassword_Xpath = "//*[@id=\"password_new\"]";
	public static final String ConfirmPassword_Xpath = "//*[@id=\"password_new_again\"]";
	public static final String UpdatePassButton_Xpath = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[2]/div/form/table/tbody/tr[4]/td[2]/input[1]";
	public static final String UploadPicture_Xpath = "//*[@id=\"fileupload\"]";
	public static final String SaveEmpButton_Xpath = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	
	public static WebDriver driver;
	
	public static void ChangePassword(WebDriver driver, String CurrPass, String NewPass) {
		
		driver.findElement(By.xpath(ProfileButton_Xpath)).click();
		driver.findElement(By.partialLinkText("Profile")).click();
		driver.findElement(By.partialLinkText("Password")).click();
		
		driver.findElement(By.xpath(CurrPassword_Xpath)).sendKeys(CurrPass);
		driver.findElement(By.xpath(NewPassword_Xpath)).sendKeys(NewPass);
		driver.findElement(By.xpath(ConfirmPassword_Xpath)).sendKeys(NewPass);
		driver.findElement(By.name("submit")).click();		
	}
	
	public static void UploadPicture(WebDriver driver, String PicturePath) {
		driver.findElement(By.xpath(ProfileButton_Xpath)).click();
		driver.findElement(By.partialLinkText("Profile")).click();
		driver.findElement(By.partialLinkText("Edit Details")).click();
		driver.findElement(By.xpath(UploadPicture_Xpath)).sendKeys(PicturePath);
		
		WebDriverWait wait = new WebDriverWait(driver,20);		
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SaveEmpButton_Xpath)));
		e.click();
	}
}
