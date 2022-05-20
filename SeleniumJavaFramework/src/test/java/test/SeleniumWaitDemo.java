package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {

	public static void main(String[] args) {

		seleniumWaits();
	}
	
	public static void seleniumWaits() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abcd")));
		
		
		driver.findElement(By.name("abcd")).click();
		
		
		
		driver.close();
		driver.quit();
	}

}
