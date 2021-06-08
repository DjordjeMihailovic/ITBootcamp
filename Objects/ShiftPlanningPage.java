package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ShiftPlanningPage {

	public static final String AddEmployees_Xpath = "//*[@id=\"e_empty\"]/button";
	public static final String EmployeeFirstName_Xpath = "//*[@id=\"fname_2\"]";
	public static final String EmployeeLastName_Xpath = "//*[@id=\"lname_2\"]";
	public static final String EmpPosition_Xpath = "//*[@id=\"positions_2-selectized\"]";	
	public static final String ConfirmEmployeeButton_Xpath = "//*[@id=\"add_employee_btn\"]";
	public static final String PopUpSkip_Xpath = "//*[@id=\"walkme-balloon-420799\"]/div/div[1]/div[2]/div/div[1]";
	public static final String EmpSearchBox_Xpath = "//*[@id=\"ScheduleSearch\"]";
	public static final String EmpSearchFullName_Xpath = "//*[@id=\"e_6365180\"]/div/span";
	
	public static void MissingFromTeamPopUpSkip(WebDriver driver) {
		try {
			driver.findElement(By.xpath(PopUpSkip_Xpath)).click();
		}
		catch (Exception e) {			
		}
	}
	
	public static void AddEmployeeClick(WebDriver driver) {
		driver.findElement(By.xpath(AddEmployees_Xpath)).click();
	}
	
	public static void InputEmpFirstName(WebDriver driver, String FName) {
		driver.findElement(By.xpath(EmployeeFirstName_Xpath)).clear();
		driver.findElement(By.xpath(EmployeeFirstName_Xpath)).click();
		driver.findElement(By.xpath(EmployeeFirstName_Xpath)).sendKeys(FName);
	}
	
	public static void InputEmpLastName(WebDriver driver, String LName) {
		driver.findElement(By.xpath(EmployeeLastName_Xpath)).click();
		driver.findElement(By.xpath(EmployeeLastName_Xpath)).sendKeys(LName);
	}
	
	public static void InputEmpPosition(WebDriver driver, String Position) {
		driver.findElement(By.xpath(EmpPosition_Xpath)).click();
		driver.findElement(By.xpath(EmpPosition_Xpath)).sendKeys(Position + Keys.ENTER);		
	}
	
	public static void ConfirmEmployee(WebDriver driver) {
		driver.findElement(By.xpath(ConfirmEmployeeButton_Xpath)).click();
	}
	
	public static void FindEmp(WebDriver driver, String FName, String LName) {
		driver.findElement(By.xpath(EmpSearchBox_Xpath)).click();
		driver.findElement(By.xpath(EmpSearchBox_Xpath)).sendKeys(FName + " " + LName + Keys.ENTER);
	}
}
