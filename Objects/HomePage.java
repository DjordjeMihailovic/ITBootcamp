package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
		
	public static final String URL = "https://www.humanity.com/";
	public static final String AboutUs_URL = "https://www.humanity.com/about";
	public static final String AboutUsHoverable_Xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	public static final String AboutUsButton_Xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[2]";
	public static final String Login_Xpath = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String PopUpSkipButton_Xpath = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String AcceptCookiesButton_Xpath = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[1]/button";
	
	public static void PopUpSkip(WebDriver driver) {
		try {
			driver.findElement(By.xpath(PopUpSkipButton_Xpath)).click();
			driver.findElement(By.xpath(AcceptCookiesButton_Xpath)).click();
		}
		catch (Exception e) {			
		}
	}
		
	public static void AboutUsClick(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(AboutUsHoverable_Xpath))).perform();
		driver.findElement(By.xpath(AboutUsButton_Xpath)).click();
	}
	
	public static void LoginClick(WebDriver driver) {
		driver.findElement(By.xpath(Login_Xpath)).click();
	}
}
