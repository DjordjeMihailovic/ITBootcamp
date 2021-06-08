package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage {
	
	public static final String LanguageBox_Xpath = "//*[@name=\"language\"]";
	public static final String SerbianLanguageChange_Xpath = "//*[@value=\"sr_RS\"]";
	public static final String ConfirmButton_Xpath = "//*[@id=\"_save_settings_button\"]";
	public static final String	EmailCBox_Xpath = "//*[@id=\"pref_pref_email\"]";
	public static final String	SmsCBox_Xpath = "//*[@id=\"pref_pref_sms\"]";
	public static final String	MobileCBox_Xpath = "//*[@id=\"pref_pref_mobile_push\"]";
	public static final String	BdayCBox_Xpath = "//*[@id=\"pref_pref_birthday\"]";
	public static final String	BcardCBox_Xpath = "//*[@id=\"pref_pref_birthday_card\"]";

	
	public static void LanguageToSerbian(WebDriver driver) {
		driver.findElement(By.xpath( LanguageBox_Xpath)).click();
		driver.findElement(By.xpath(SerbianLanguageChange_Xpath)).click();
		driver.findElement(By.xpath(ConfirmButton_Xpath)).click();
		try {
	        Thread.sleep(3*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();		        
	    }	
		driver.navigate().refresh();		
	}
	
	public static void NotificationUncheck(WebDriver driver) {
		driver.findElement(By.xpath(EmailCBox_Xpath)).click();
		driver.findElement(By.xpath(SmsCBox_Xpath)).click();
		driver.findElement(By.xpath(MobileCBox_Xpath)).click();
		driver.findElement(By.xpath(BdayCBox_Xpath)).click();
		driver.findElement(By.xpath(BcardCBox_Xpath)).click();
		driver.findElement(By.xpath(ConfirmButton_Xpath)).click();
	}
}
