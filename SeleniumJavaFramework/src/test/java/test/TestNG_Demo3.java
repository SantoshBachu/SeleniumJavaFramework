package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo3 {

	private static WebDriver driver = null;
	
	@BeforeTest
	public static void setUpTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public static void googleSearch3() {
		
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		}
	@Test
	public static void googleSearch4() {
		
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		}
	
	@AfterTest
	public static void tearDownTest() {
		
		driver.close();
		
		driver.quit();
		
		System.out.println("Test ran successfully");
		
	}
}
