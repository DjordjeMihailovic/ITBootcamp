package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaffPage {

	public static final String EditDetails_Xpath = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String ChangeName_Xpath = "//*[@id=\"first_name\"]";
	public static final String SaveEmpButton_Xpath = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
	
	public static void EditDetailsClick(WebDriver driver) {
		driver.findElement(By.xpath(ChangeName_Xpath)).click();
	}
	
	public static void ChangeName(WebDriver driver, String NewName) {
		driver.findElement(By.xpath(ChangeName_Xpath)).click();
		driver.findElement(By.xpath(ChangeName_Xpath)).clear();
		driver.findElement(By.xpath(ChangeName_Xpath)).sendKeys(NewName);		
	}
	
	public static void SaveEmpClick(WebDriver driver) {
		driver.findElement(By.xpath(SaveEmpButton_Xpath)).click();
	}
	public static void SelectEmp(WebDriver driver, String FName, String LName) {
		driver.findElement(By.xpath("//*[@title=\"" + FName + " " + LName + "\"]")).click();
	}
}
