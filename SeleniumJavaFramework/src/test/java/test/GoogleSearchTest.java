package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		googleSearch();

	}

	public static void googleSearch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step By Step");
		
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		
		System.out.println("Test Completed Successfully");
	}
}
