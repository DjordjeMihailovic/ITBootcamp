package DomaciSelenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDomaci2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Program Files (x86)\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		String url = "https://itbootcamp.rs/?script=cir";
		driver.get(url);
		
		Dimension Dim = driver.manage().window().getSize();
		
		driver.manage().window().maximize();
				
		String title = driver.getTitle();

		driver.navigate().to("https://itbootcamp.rs/course/testiranje-softvera/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		
		driver.findElement(By.className("open-search")).click();
		driver.findElement(By.className("form-control")).sendKeys("testiranje" + "\n");
		
		driver.manage().window().setSize(Dim);
		driver.close();
	}
}
