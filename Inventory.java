package Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inventory {
	
	public static final String SortClass = "product_sort_container";
	public static final String SortLowToHighXpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]";
	
	public static void SortLowToHigh(WebDriver driver) {
		driver.findElement(By.className(SortClass)).click();
		driver.findElement(By.xpath(SortLowToHighXpath)).click();
	}
}
