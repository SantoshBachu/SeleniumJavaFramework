package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		googleSearch();

	}

	public static void googleSearch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
	}
}
