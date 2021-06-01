package Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Obj.Home;
import Obj.Inventory;

public class InventoryTest {
	
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();		
	}
	
	@Test
	public void InventorySortTest() {
		driver.get(Home.InventoryURLPath(driver));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Inventory.SortLowToHigh(driver);
			
		List<WebElement> elements = driver.findElements(By.className("inventory_item_price"));
		
		// elementi pronadjeni na ovaj nacin su sortirani pocev od prvog gore levo
		// do poslednjeg dole desno
		
		double x = 0.0;
		int y = 0;
		int ElementsNum = elements.size();
		
	    for (WebElement element : elements) {
	    	if (x <= (Double.parseDouble(element.getText().substring(1)))) {
	    		y++;
	    		}
	    	x = Double.parseDouble(element.getText().substring(1));
	    }
	    Assert.assertEquals(y, ElementsNum);
	    driver.close();
	  }
	}

