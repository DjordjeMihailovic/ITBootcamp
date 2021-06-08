package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Objects.DashboardPage;
import Objects.HomePage;
import Objects.LoginPage;
import Objects.ShiftPlanningPage;
import Objects.StaffPage;
import Utilities.ExplicitWait;
import Utilities.LoginTool;
import Utilities.MaximizeAndImplicitWait;

public class EmployeeManipulationTests {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();		
		LoginTool.Use(driver);
		
		DashboardPage.ShiftPlannigButtonClick(driver);
	}
	
	@Test
	public void AddEmpTest() {		
		String FName = "Boban";
		String LName = "Glavonja";	
		
		ShiftPlanningPage.MissingFromTeamPopUpSkip(driver);
		ShiftPlanningPage.AddEmployeeClick(driver);
		ShiftPlanningPage.InputEmpFirstName(driver, FName);
		ShiftPlanningPage.InputEmpLastName(driver, LName);
		ShiftPlanningPage.InputEmpPosition(driver, "Designer");
		ShiftPlanningPage.ConfirmEmployee(driver);			
		
		 try {
		        Thread.sleep(3*1000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();		        
		    }
		
		StaffPage.SelectEmp(driver, FName, LName);		
	}
	
	@Test
	public void EmpNameChange() {
		DashboardPage.ShiftPlannigButtonClick(driver);
		
		String FName = "Boban";
		String LName = "Glavonja";
		
		StaffPage.SelectEmp(driver, FName, LName);
		
		String NewName = "Bobardo";
		String LastName = "Glavonja";
		
		driver.findElement(By.partialLinkText("Edit Details")).click();
		StaffPage.ChangeName(driver, NewName);
		StaffPage.SaveEmpClick(driver);	
		
		DashboardPage.ShiftPlannigButtonClick(driver);		
		StaffPage.SelectEmp(driver, NewName, LastName);
	}
	
	@Test
	public void ExcelAddEmp() {
		
		DashboardPage.ShiftPlannigButtonClick(driver);
		File f = new File("AddEmpTable.xlsx");		
		try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);		
			Row row;
			Cell cell1;
			Cell cell2;
			Cell cell3;
			for(int x = 0; x < 5; x++) {
				ShiftPlanningPage.AddEmployeeClick(driver);         
				row = sheet.getRow(x);
				cell1 = row.getCell(0);
				cell2 = row.getCell(1);
				cell3 = row.getCell(2);
				
				ShiftPlanningPage.InputEmpFirstName(driver, cell1.toString());
				ShiftPlanningPage.InputEmpLastName(driver, cell2.toString());   
				ShiftPlanningPage.InputEmpPosition(driver, cell3.toString());
				ShiftPlanningPage.ConfirmEmployee(driver);
				
				 try {
				        Thread.sleep(3*1000);
				    } catch (InterruptedException e) {
				        e.printStackTrace();		        
				    }
				 StaffPage.SelectEmp(driver, cell1.toString(), cell2.toString());	                
				DashboardPage.ShiftPlannigButtonClick(driver);
			}		
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
