package DomaciSelenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumDomaciTestNG {

	private static WebDriver driver;
	public static final String KONTAKT_XPATH = "/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[7]/a";
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();		
	}
	
	@Test
	public void testNaslovna() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://itbootcamp.rs/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(KONTAKT_XPATH)).click();
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://itbootcamp.rs/kontakt/";
		Assert.assertEquals(currentURL, expectedURL);
		driver.close();
	}	
}
