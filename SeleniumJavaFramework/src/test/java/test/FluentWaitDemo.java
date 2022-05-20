package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) throws Exception {
		test1();

	}
	public static void test1() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		//driver.findElement(By.linkText("ABCD for Kids: Preschool Learning Games - Google Play")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30L))
				.pollingEvery(Duration.ofSeconds(5L))
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkElement = driver.findElement(By.id("gsr"));
				if(linkElement.isEnabled()) {
					System.out.println("Element Found!!!");

				}
				return linkElement;
			}
		});
		element.click();

		Thread.sleep(3000);

		driver.close();
	}
}


