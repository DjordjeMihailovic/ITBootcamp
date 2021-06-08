package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.LoginTool;

public class DashboardPage {
	
	public static final String HumanityButton_Xpath = "//*[@id=\"_nav\"]/div[1]";
	public static final String DashboardButton_Xpath = "//*[@id=\"sn_dashboard\"]/span";
	public static final String ShiftPlannigButton_Xpath = "//*[@id=\"sn_schedule\"]/span";
	public static final String TimeClockButton_Xpath = "//*[@id=\"sn_timeclock\"]/span";
	public static final String LeaveButton_Xpath = "//*[@id=\"sn_requests\"]/span";
	public static final String TrainingButton_Xpath = "//*[@id=\"sn_training\"]/span";
	public static final String StaffButton_Xpath = "//*[@id=\"sn_staff\"]/span";
	public static final String AvailabilityButton_Xpath = "//*[@id=\"sn_availability\"]/span";
	public static final String PayrollButton_Xpath = "//*[@id=\"sn_payroll\"]/span";
	public static final String ReportsButton_Xpath = "//*[@id=\"sn_reports\"]/span";
	public static final String SettingsButton_Xpath = "//*[@id=\"sn_admin\"]";
	
	public static final String LogOut_Xpath = "//*[@id=\"userm\"]/div/div[5]/a";

	public static void HumanityButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(HumanityButton_Xpath)).click();
	}
		
	public static void DashboardButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(DashboardButton_Xpath)).click();
	}
	
	public static void ShiftPlannigButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(ShiftPlannigButton_Xpath)).click();
	}
	
	public static void TimeClockButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(TimeClockButton_Xpath)).click();
	}
	
	public static void LeaveButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(LeaveButton_Xpath)).click();
	}
	
	public static void TrainingButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(TrainingButton_Xpath)).click();
	}
	
	public static void StaffButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(StaffButton_Xpath)).click();
	}
	
	public static void AvailabilityButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(AvailabilityButton_Xpath)).click();
	}
	
	public static void PayrollButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(PayrollButton_Xpath)).click();
	}
	
	public static void ReportsButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(ReportsButton_Xpath)).click();
	}
	
	public static void SettingsButtonClick(WebDriver driver) {
		driver.findElement(By.xpath(SettingsButton_Xpath)).click();
	}
	
	public static void LogOutClick(WebDriver driver) {
		driver.findElement(By.xpath(LogOut_Xpath)).click();
	}
}
