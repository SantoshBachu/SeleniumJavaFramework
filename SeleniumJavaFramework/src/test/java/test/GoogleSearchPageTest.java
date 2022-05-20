package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("Automation step by step");
		
		searchPageObj.clickSearchButton();
		
		driver.close();
	
		System.out.println("Test ran successfully");
	}
	
	
}
