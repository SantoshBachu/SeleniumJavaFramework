package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test2");
		//Assert.assertTrue(false);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPasswordd")).sendKeys("admin123");
		driver.close();
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test3");
		throw new SkipException("this test is skipped");
	}

}
