package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class MaximizeAndImplicitWait {
	
	public static WebDriver driver;
	
	public static void Use(WebDriver driver) {		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
