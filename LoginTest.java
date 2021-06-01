package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Obj.Home;

public class LoginTest {

	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();		
	}
		
	@Test (priority = 2)
	public void LoginValidCred() {
		try {
			File f = new File("data.xlsx");
			InputStream in = new FileInputStream(f);
			XSSFWorkbook  wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			
			SoftAssert sa = new SoftAssert();
			
			for(int i = 0; i < 4; i++) {
				
				driver.get(Home.URL);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				Row rowU = sheet.getRow(i);
				Row rowP = sheet.getRow(0);
				Cell CUser = rowU.getCell(0);
				Cell CPass = rowP.getCell(1);
				
				Home.EnterUser(driver, CUser.toString());
				Home.EnterPassword(driver, CPass.toString());
				Home.LoginButtonClick(driver);
				
				String expectedURL = "https://www.saucedemo.com/inventory.html";
				String currentURL = driver.getCurrentUrl();
				
				sa.assertEquals(currentURL, expectedURL, CUser.toString());
	}
			sa.assertAll();
			wb.close();
			driver.close();
		}
		catch (IOException e) {
	        e.printStackTrace();		        
	    }
	}
	@Test (priority = 1)
	public void LoginInvalidCred() {
		try {
			File f = new File("data.xlsx");
			InputStream in = new FileInputStream(f);
			XSSFWorkbook  wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
						
			Row row = sheet.getRow(4);
			Cell CUser = row.getCell(0);
			Cell CPass = row.getCell(1);
			
			driver.get(Home.URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			Home.EnterUser(driver, CUser.toString());
			Home.EnterPassword(driver, CPass.toString());
			Home.LoginButtonClick(driver);
			
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			String currentURL = driver.getCurrentUrl();
			
			Assert.assertNotEquals(currentURL, expectedURL, CUser.toString() + " " + CPass.toString());
		}
		catch (IOException e) {
	        e.printStackTrace();		        
	    }			
	}
}
