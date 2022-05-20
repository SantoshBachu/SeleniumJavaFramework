package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo {

	public static String browserName=null;
	private static WebDriver driver = null;
	
	@BeforeTest
	public static void setUpTest() {
		
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedrivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://google.com");
	}
	
	@Test
	public static void googleSearch() {
		
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		}
	
	@AfterTest
	public static void tearDownTest() {
		
		driver.close();
		
		//driver.quit();
		
		System.out.println("Test ran successfully");
		
	}
}
