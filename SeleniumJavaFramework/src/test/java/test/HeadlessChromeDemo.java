package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SendKeysAction;

public class HeadlessChromeDemo {

	public static void main(String[] args) {
		test1();	
	}

	public static void test1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("windows-size=1280,800");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Saanvi Gupta");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		driver.close();
		driver.quit();
		System.out.println("Test Completed");


	}

}
